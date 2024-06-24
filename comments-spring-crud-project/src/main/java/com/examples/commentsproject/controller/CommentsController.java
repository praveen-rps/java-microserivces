package com.examples.commentsproject.controller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.examples.commentsproject.configs.ServiceConfigs;
import com.examples.commentsproject.service.CommentsService;

public class CommentsController {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext config = 
				new AnnotationConfigApplicationContext(ServiceConfigs.class);
	
		CommentsService service = config.getBean(CommentsService.class);
	
		System.out.println(service.getAllComments());
		System.out.println(service.addComment(null));
		System.out.println(service.deleteComment(0));
		System.out.println(service.searchComment(0));
		
	
	}
}
