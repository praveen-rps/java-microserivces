package com.examples.springjdbc.model;


import java.util.List;


public interface CommentsService {
	
	public List<Comments> getAllComments();
	public int addComment(Comments comment);
	public Comments searchComment(int cid);
	public int deleteComment(int cid);

}
