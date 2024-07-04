package com.examples.commentsproject.dao;

import java.io.FileNotFoundException;
import java.util.List;

import com.examples.commentsproject.exceptions.CommentNotFoundException;
import com.examples.commentsproject.model.Comments;

public interface CommentsDao {
	
	public List<Comments> getAllComments() throws FileNotFoundException;
	public int addComment(Comments comment) throws FileNotFoundException;
	public Comments searchComment(int cid) throws CommentNotFoundException, FileNotFoundException;
	public int  deleteComment(int cid) throws CommentNotFoundException, FileNotFoundException;

}
