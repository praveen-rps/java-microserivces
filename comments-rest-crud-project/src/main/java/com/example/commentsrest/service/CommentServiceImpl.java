package com.example.commentsrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.commentsrest.dao.CommentsDao;
import com.example.commentsrest.exceptions.CommentsNotFoundException;
import com.example.commentsrest.model.Comments;


@Service
public class CommentServiceImpl implements CommentService {
	
	@Autowired
	CommentsDao dao;

	@Override
	public List<Comments> getAllComments() {
		// TODO Auto-generated method stub
		return dao.getAllComments();
	}

	@Override
	public Comments addComment(Comments comment) {
		// TODO Auto-generated method stub
		return dao.addComment(comment);
	}

	@Override
	public Comments searchComment(int cid) throws CommentsNotFoundException {
		// TODO Auto-generated method stub
		return dao.searchComment(cid);
	}

	@Override
	public int deleteComment(int cid) throws CommentsNotFoundException{
		// TODO Auto-generated method stub
		return dao.deleteComment(cid);
	}

}
