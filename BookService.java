package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;

@Service
public class BookService 
{
	@Autowired
	BookRepository bookrepo;
	
	
	
	public void addBook(Book book)
	{
		bookrepo.save(book);
	}
	
	public List<Book> getallbook()
	{
		List<Book> book=new ArrayList<Book>();
		bookrepo.findAll().forEach(book1 -> book.add(book1));
		return book;
	}
	
	
	public Book getBooksById(int id)   
	{  
	return bookrepo.findById(id).get();  
	}  
	
	
	public void delete(int id)   
	{  
	bookrepo.deleteById(id);  
	}  
	
	public void update(Book book, int bookid)   
	{  
	bookrepo.save(book);  
	}  

}
