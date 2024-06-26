package com.example.commentsrest.service;

import java.util.List;

import com.example.commentsrest.exceptions.CommentsNotFoundException;
import com.example.commentsrest.model.Comments;

public interface CommentService {
	
	public List<Comments> getAllComments();
	public Comments addComment(Comments comment);
	public Comments searchComment(int cid) throws CommentsNotFoundException;
	public int deleteComment(int cid) throws CommentsNotFoundException;
	

}
