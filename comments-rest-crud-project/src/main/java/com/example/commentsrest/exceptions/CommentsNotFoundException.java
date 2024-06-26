package com.example.commentsrest.exceptions;

public class CommentsNotFoundException extends RuntimeException{
	
	public CommentsNotFoundException() {
		super("Comments not found for given id");
	}

}
