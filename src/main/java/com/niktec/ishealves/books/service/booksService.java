package com.niktec.ishealves.books.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niktec.ishealves.books.Books;
import com.niktec.ishealves.books.repository.booksRepository;

@Service
public class booksService {
	
	@Autowired
	private booksRepository booksrepository;
	
	
	// method to add a book into the database
	public void saveBook(Books book) {
		
		booksrepository.save(book);
	}
	
	
	//method toget all books from the database 
	
	public List<Books> getBooks(){
		return booksrepository.findAll();
	}
	
	//get book by ID 
	
	public Optional<Books> getBookById(int id) {
		
		return booksrepository.findById(id);
	}
	
	//get book by name 
	
	
	//
	
	

}
