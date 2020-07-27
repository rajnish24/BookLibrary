package com.genpact.BookLibrary.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.genpact.BookLibrary.entity.Book;
import com.genpact.BookLibrary.entity.Library;
import com.genpact.BookLibrary.service.BookService;
import com.genpact.BookLibrary.service.LibraryService;

@RestController
@RequestMapping("api/book/v1")
public class BookController {
	
	@Autowired
	LibraryService libraryService;
	
	@Autowired
	BookService bookService;
	
	@RequestMapping(value = "/add",method = RequestMethod.POST)
	public ResponseEntity<Book> addbook(@RequestBody Book book){
		Book respObj=bookService.addBook(book);
		return new ResponseEntity<>(respObj,HttpStatus.OK);
	}
	@RequestMapping(value = "/update",method = RequestMethod.POST)
	public ResponseEntity<Book> updateBook(@RequestBody Book book){
		Book respObj=bookService.updateBook(book);
		return new ResponseEntity<>(respObj,HttpStatus.OK);
	}

}
