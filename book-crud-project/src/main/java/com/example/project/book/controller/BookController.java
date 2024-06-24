package com.example.project.book.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.project.book.model.Book;

@Controller
public class BookController {
	
	List<Book> books = new ArrayList<Book>();
	
	@GetMapping("/add")
	
	public String addBook() {
		return "addBook";
	}
	
	@PostMapping("/addBook")
	public String insertBook(@RequestParam int bookid, 
			@RequestParam String bookname, 
			@RequestParam  String author, 
			@RequestParam int price) {
		
		Book book = new Book(bookid, bookname, author, price);
		books.add(book);
		return "success";
	}
	
	@GetMapping("/view")
	public String viewBooks(Model model) {
		
		model.addAttribute("books", books);
		return "viewBooks";
	}
	
	@GetMapping("/home")
	public String success() {
		return "success";
	}
	
	@GetMapping("/search")
	public String searchBook() {
		return "search";
	}
	
	@PostMapping("/searchBook")
	public String searchBook(@RequestParam String bookid, Model model) {
		
		int id = Integer.parseInt(bookid);
		for (Book b : books) {
			if (b.getBookid() == id) {
				model.addAttribute("book", b);
				return "searchSuccess";
			}
		}
		return "searchFailure";
	}

}
