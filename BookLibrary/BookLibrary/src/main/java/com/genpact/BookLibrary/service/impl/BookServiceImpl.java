package com.genpact.BookLibrary.service.impl;

import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.genpact.BookLibrary.entity.Book;
import com.genpact.BookLibrary.repository.BookRepository;
import com.genpact.BookLibrary.service.BookService;
@Service
@Transactional
public class BookServiceImpl implements BookService{
@Autowired
BookRepository bookRepo;
	@Override
	public Book addBook(Book book) {
		book.setCreatedDate(new Date());
		
		return bookRepo.save(book);
	}
	@Override
	public Book updateBook(Book book) {
		Book bookToUpdate=bookRepo.getOne(book.getId());
		bookToUpdate.setAuthors(book.getAuthors());
		bookToUpdate.setCoverImgUrl(book.getCoverImgUrl());
		bookToUpdate.setTitle(book.getTitle());
		bookToUpdate.setLanguage(book.getLanguage());
		bookToUpdate.setUpdatedDate(new Date());
		
		return bookRepo.save(bookToUpdate);
	}

}
