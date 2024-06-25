package com.examples.springjdbc.model;

import java.util.List;



public interface CommentsDao {
	
	public List<Comments> getAllComments();
	public int addComment(Comments comment);
	public List<Comments> searchComment(int cid) ;
	public int  deleteComment(int cid) ;
	// write the code for updating the comment data
	// write the code to handle the exception cases

}
