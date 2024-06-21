package com.examples.commentsproject.dao;

import java.util.List;

import com.examples.commentsproject.exceptions.CommentNotFoundException;
import com.examples.commentsproject.model.Comments;

public interface CommentsDao {
	
	public List<Comments> getAllComments();
	public int addComment(Comments comment);
	public Comments searchComment(int cid) throws CommentNotFoundException;
	public int  deleteComment(int cid) throws CommentNotFoundException;

}
