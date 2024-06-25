package com.example.commentsrest.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.commentsrest.model.Comments;


@Repository
public class CommentsDaoImpl implements CommentsDao{
	
	List<Comments> comments;
	
	public CommentsDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
		comments = new ArrayList<Comments>();
	}

	@Override
	public List<Comments> getAllComments() {
		// TODO Auto-generated method stub
		return comments;
	}

	@Override
	public Comments addComment(Comments comment) {
		// TODO Auto-generated method stub
			comments.add(comment);
			return comment;
	}

	@Override
	public Comments searchComment(int cid) {
		// TODO Auto-generated method stub
		//Comments result = null;
		for (Comments c : comments) {
			if (c.getCid() == cid) {
				return c;
			}
		}
		return null;
	}

	@Override
	public int deleteComment(int cid) {
		// TODO Auto-generated method stub
		int result =0;
		boolean k = comments.removeIf(c -> c.getCid() == cid);
		if(k) {
            result = 1;
        }
		return result;
		
	}

}
