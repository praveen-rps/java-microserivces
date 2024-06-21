package com.examples.commentsproject.service;

import java.util.List;

import com.examples.commentsproject.dao.CommentsDao;
import com.examples.commentsproject.dao.CommentsDaoImpl;
import com.examples.commentsproject.exceptions.CommentNotFoundException;
import com.examples.commentsproject.model.Comments;

public class CommentServiceImpl implements CommentsService {
	
	CommentsDao dao;
	
	public CommentServiceImpl() {
		super();
		this.dao = new CommentsDaoImpl();
	}

	@Override
	public List<Comments> getAllComments() {
		// TODO Auto-generated method stub
		return dao.getAllComments();
	}

	@Override
	public int addComment(Comments comment) {
		// TODO Auto-generated method stub
		return dao.addComment(comment);
	}

	@Override
	public Comments searchComment(int cid) throws CommentNotFoundException{
		// TODO Auto-generated method stub
		return dao.searchComment(cid);
	}

	@Override
	public int  deleteComment(int cid)throws CommentNotFoundException {
		// TODO Auto-generated method stub
		return dao.deleteComment(cid);
	}

}
