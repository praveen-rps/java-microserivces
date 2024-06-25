package com.examples.springjdbc.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


@Component
public class CommentsDaoImpl implements CommentsDao{
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Comments> getAllComments() {
		return null;
	}

	@Override
	public int addComment(Comments comment) {
		
		String sql = "insert into comments values(?,?,?,?)";
		
		
		int  k = jdbcTemplate.update(sql,comment.getCid(),comment.getComment(),
				comment.getCommenter(),comment.getPid());
		
		return k;
	}

	@Override
	public Comments searchComment(int cid)  {
		// TODO Auto-generated method stub
		
	    return null;
	
	}

	@Override
	public int  deleteComment(int cid) {
		
		String sql = "delete from comments where cid=?";
		int  k = jdbcTemplate.update(sql,cid);
		return k;
		
	}

}
