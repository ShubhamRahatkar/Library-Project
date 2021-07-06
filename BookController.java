package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;
import com.example.demo.service.BookService;

@RestController
public class BookController 
{
	@Autowired
	BookService bookservice;
	
	
	@PostMapping("/addbook")
	private int addbook(@RequestBody Book book)
	{
		bookservice.addBook(book);
		return book.getBid();
	}
	
	
	@GetMapping("/getallbook")
	private List<Book> getallbook()
	{
		return bookservice.getallbook();
	}
	
	
	@GetMapping("/book/{bookid}")
	private Book getBooks(@PathVariable("bookid") int bookid)   
	{  
	return bookservice.getBooksById(bookid);  
	}  
	
	
	@DeleteMapping("/book/{bookid}")
	private void deleteBook(@PathVariable("bookid") int bookid)   
	{  
	bookservice.delete(bookid);  
	} 
	
	
	@PutMapping("/updatebook")  
	private Book update(@RequestBody Book book)   
	{  
	bookservice.addBook(book);  
	return book;  
	}  
	

}
