package com.examples.springjdbc.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class CommentServiceImpl implements CommentsService {
	
	@Autowired
	CommentsDao dao;
	
	public CommentServiceImpl() {
		super();
		
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
	public List<Comments> searchComment(int cid) {
		// TODO Auto-generated method stub
		return  dao.searchComment(cid);
	}

	@Override
	public int  deleteComment(int cid) {
		// TODO Auto-generated method stub
		return dao.deleteComment(cid);
	}

}
