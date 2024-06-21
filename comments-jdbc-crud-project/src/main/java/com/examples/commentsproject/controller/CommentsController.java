package com.examples.commentsproject.controller;

import java.util.Scanner;

import com.examples.commentsproject.exceptions.CommentNotFoundException;
import com.examples.commentsproject.model.Comments;
import com.examples.commentsproject.service.CommentServiceImpl;
import com.examples.commentsproject.service.CommentsService;

public class CommentsController {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CommentsService service = new CommentServiceImpl();
		
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the comment id to search: ");
		System.out.println("Enter the comment id to delete: ");
		int cid = sc.nextInt();
		
		try {
			//Comments comment = service.searchComment(cid);
			int result = service.deleteComment(cid);
			if (result >= 1)
				System.out.println("Comment deleted successfully");
			}
		catch (CommentNotFoundException e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}

		// service.getAllComments().forEach(System.out::println);

		/*Comments comment = new Comments(9007, "Can you make it clear", "Sunil", 1001);

		int result = service.addComment(comment);
		if (result >= 1)
			System.out.println("Comment added successfully");
		else
			System.out.println("Error in adding comment");
		*/
		
		
	}
}
