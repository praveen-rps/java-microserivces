package com.examples.commentsproject.dao;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.examples.commentsproject.dbutils.DbConnections;
import com.examples.commentsproject.exceptions.CommentNotFoundException;
import com.examples.commentsproject.model.Comments;

public class CommentsDaoImpl implements CommentsDao{
	
	Statement st = null;
	PreparedStatement pst = null;
	ResultSet rs= null;
	Connection con= null;
	List<Comments> comments = null;
	int k=0;
	
	@Override
	public List<Comments> getAllComments() throws FileNotFoundException {
		// TODO Auto-generated method stub
		comments = new ArrayList<>();
		con = DbConnections.getDatabaseConnection();
		try {
			st = con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String query = "select * from comments";
		try {
			rs = st.executeQuery(query);
			while(rs.next()) {
				comments.add(new Comments(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return comments;
	}

	@Override
	public int addComment(Comments comment) throws FileNotFoundException{
		// TODO Auto-generated method stub
		
		
		String sql = "insert into comments values(?,?,?,?)";
		
		con = DbConnections.getDatabaseConnection();
		
		try {
			pst = con.prepareStatement(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			pst.setInt(1, comment.getCid());
			pst.setString(2, comment.getComment());
			pst.setString(3, comment.getCommenter());
			pst.setInt(4, comment.getPid());
			k = pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return k;
	}

	@Override
	public Comments searchComment(int cid) throws CommentNotFoundException, FileNotFoundException{
		// TODO Auto-generated method stub
		List<Comments> comments = new ArrayList<>();
		con = DbConnections.getDatabaseConnection();
		String query = "select * from comments where cid = ?";
		try {
			pst = con.prepareStatement(query);
			pst.setInt(1, cid);
			rs = pst.executeQuery();
			while (rs.next()) {
				comments.add(new Comments(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(comments.isEmpty())
			throw new CommentNotFoundException("Comment with id "+cid+" not found");
		else
			return comments.get(0);
	
	}

	@Override
	public int  deleteComment(int cid) throws FileNotFoundException {
		// TODO Auto-generated method stub
		int result = 0;
		con = DbConnections.getDatabaseConnection();
		String query = "delete from comments where cid = ?";
		try {
			pst = con.prepareStatement(query);
			pst.setInt(1, cid);
			result = pst.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(result<1)
			throw new CommentNotFoundException("Comment with id "+cid+" not found");
		else
			return result;
		
		
	}

}
