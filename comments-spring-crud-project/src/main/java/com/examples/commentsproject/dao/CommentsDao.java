package com.examples.commentsproject.dao;

import java.util.List;

import com.examples.commentsproject.exceptions.CommentNotFoundException;
import com.examples.commentsproject.model.Comments;

public interface CommentsDao {
	
	public String getAllComments();
	public String addComment(Comments comment);
	public String searchComment(int cid) throws CommentNotFoundException;
	public String  deleteComment(int cid) throws CommentNotFoundException;

}
