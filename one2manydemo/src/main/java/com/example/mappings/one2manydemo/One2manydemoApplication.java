package com.example.mappings.one2manydemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.mappings.one2manydemo.dao.NewCommentDao;
import com.example.mappings.one2manydemo.dao.NewPostDao;
import com.example.mappings.one2manydemo.model.NewComment;
import com.example.mappings.one2manydemo.model.NewPost;


@SpringBootApplication
public class One2manydemoApplication implements CommandLineRunner{
	
	@Autowired
	private NewPostDao postDao;
	//private PostDao postDao;
	
	@Autowired
	private NewCommentDao commentsdao;
	//private CommentsDao commentsdao;

	public static void main(String[] args) {
		SpringApplication.run(One2manydemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		/*
		Comment comment1 = new Comment(9001L,"Good");
		Comment comment2 = new Comment(9002L,"average");
		Comment comment3 = new Comment(9003L,"good");
		List<Comment> comments = new ArrayList<>();
		comments.add(comment3);
		comments.add(comment2);
		comments.add(comment1);
		

		Comment comment4 = new Comment(9001L,"not so Good");
		Comment comment5 = new Comment(9002L,"not so average");
		Comment comment6 = new Comment(9003L,"average");
		List<Comment> comments1 = new ArrayList<>();
		comments1.add(comment4);
		comments1.add(comment5);
		comments1.add(comment6);
		
		Post post = new Post(1001L,"First Post",comments);
		
		Post post1 = new Post(1002L,"Second Post",comments1);
		
		postDao.save(post);
		postDao.save(post1);
		
		
		System.out.println("one2many mapping done..");
		
		//fetching the data
		Iterable<Post> cmts = postDao.findAll();
		cmts.forEach(System.out::println);
		
		
		
		// Update a Post
        Post existingPost = postDao.findById(1L).orElse(null);
        if (existingPost != null) {
            existingPost.setDescription("Updated Post Title");
            postDao.save(existingPost);
        }

        // Delete a Post
        //postDao.deleteById(1L);
	
	*/
		NewComment comment1 = new NewComment();
        comment1.setComments("This is the first comment");

        NewComment comment2 = new NewComment();
        comment2.setComments("This is the second comment");
        
        List<NewComment> newComments = new ArrayList<>();

        NewPost post = new NewPost();
        post.setTitle("First Post");
        post.setComments(newComments);

        comment1.setPost(post);
        comment2.setPost(post);
        postDao.save(post);
        commentsdao.save(comment1);
        commentsdao.save(comment2);
        System.out.println("one to one mapping bi directional done...");
   		
		
	}

}
