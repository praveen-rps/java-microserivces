package com.example.commentsrest.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.example.commentsrest.exceptions.CommentsNotFoundException;
import com.example.commentsrest.model.Comments;


@Repository
public class CommentsDaoImpl implements CommentsDao{
	
	List<Comments> comments;
	
	public CommentsDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
		comments = new ArrayList<Comments>();
	}

	@Override
	public List<Comments> getAllComments() {
		// TODO Auto-generated method stub
		return comments;
	}

	@Override
	public Comments addComment(Comments comment) {
		// TODO Auto-generated method stub
			comments.add(comment);
			return comment;
	}

	@Override
	public Comments searchComment(int cid) throws CommentsNotFoundException {
		// TODO Auto-generated method stub
		//Comments result = null;
		return comments.stream()
					    .filter(c -> c.getCid() == cid)
					    .findFirst()
					    .orElseThrow(CommentsNotFoundException::new);
	}

	@Override
	public int deleteComment(int cid) throws CommentsNotFoundException {
		// TODO Auto-generated method stub
		int result =0;
		Optional<Comments> comment = comments.stream().filter(c -> c.getCid() == cid).findFirst();
		
		if (comment.isPresent()) {
			comments.remove(comment.get());
			result = 1;
		} 
					
		return result;
		
		
	}

}
