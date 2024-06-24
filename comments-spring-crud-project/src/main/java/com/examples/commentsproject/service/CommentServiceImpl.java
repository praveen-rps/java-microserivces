package com.examples.commentsproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.examples.commentsproject.dao.CommentsDao;
import com.examples.commentsproject.exceptions.CommentNotFoundException;
import com.examples.commentsproject.model.Comments;


@Component
public class CommentServiceImpl implements CommentsService {
	
	@Autowired
	CommentsDao dao;
	
	public CommentServiceImpl() {
		super();
		
	}

	@Override
	public String getAllComments() {
		// TODO Auto-generated method stub
		return dao.getAllComments();
	}

	
	@Override
	public String searchComment(int cid) throws CommentNotFoundException{
		// TODO Auto-generated method stub
		return dao.searchComment(cid);
	}

	@Override
	public String  deleteComment(int cid)throws CommentNotFoundException {
		// TODO Auto-generated method stub
		return dao.deleteComment(cid);
	}

	@Override
	public String addComment(Comments comment) {
		// TODO Auto-generated method stub
		return dao.addComment(comment);
	}

}
