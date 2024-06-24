package com.examples.commentsproject.dao;

import org.springframework.stereotype.Component;

import com.examples.commentsproject.exceptions.CommentNotFoundException;
import com.examples.commentsproject.model.Comments;

@Component
public class CommentsDaoImpl implements CommentsDao{
	
		
	@Override
	public String getAllComments() {
		return "returned all Comments from the database";
	}

	@Override
	public String addComment(Comments comment) {
		// TODO Auto-generated method stub
		
		
		return "Comment is added to the database";
	}

	@Override
	public String searchComment(int cid) throws CommentNotFoundException {
		// TODO Auto-generated method stub
		return "Comment is searched from the database";
	
	}

	@Override
	public String  deleteComment(int cid) {
		// TODO Auto-generated method stub
		return "Comment is deleted from the database";
		
		
	}

}
