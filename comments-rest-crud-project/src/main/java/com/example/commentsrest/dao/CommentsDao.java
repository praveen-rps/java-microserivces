package com.example.commentsrest.dao;

import java.util.List;

import com.example.commentsrest.model.Comments;

public interface CommentsDao {
	
	public List<Comments> getAllComments();
	public Comments addComment(Comments comment);
	public Comments searchComment(int cid);
	public int deleteComment(int cid);

}
