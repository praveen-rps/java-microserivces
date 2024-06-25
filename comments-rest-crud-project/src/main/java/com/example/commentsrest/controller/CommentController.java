package com.example.commentsrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.commentsrest.model.Comments;
import com.example.commentsrest.service.CommentService;

@RestController
@RequestMapping("/comments")
public class CommentController {
	
	@Autowired
	CommentService service;
	
	@GetMapping("/all")
	@ResponseStatus(HttpStatus.CREATED)
	public List<Comments> getAllComments() {
		return service.getAllComments();
	}
	
	@PostMapping("/add")
	public ResponseEntity<Comments> addComment(@RequestBody Comments comment) {
		return new ResponseEntity(service.addComment(comment), HttpStatus.CREATED);
	}
	
	@GetMapping("/search/{cid}")
	public Comments searchComment(@PathVariable int cid) {
		return service.searchComment(cid);
	}
	
	@DeleteMapping("/delete/{cid}")
	public int deleteComment(@PathVariable int cid) {
		return service.deleteComment(cid);
	}
	
	
	

}


// localhost:8080/comments/all