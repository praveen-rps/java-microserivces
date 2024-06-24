package com.examples.commentsproject.service;

import java.util.List;

import com.examples.commentsproject.exceptions.CommentNotFoundException;
import com.examples.commentsproject.model.Comments;

public interface CommentsService {
	
	public String getAllComments();
	public String addComment(Comments comment);
	public String searchComment(int cid) throws CommentNotFoundException;
	public String  deleteComment(int cid) throws CommentNotFoundException;

}
