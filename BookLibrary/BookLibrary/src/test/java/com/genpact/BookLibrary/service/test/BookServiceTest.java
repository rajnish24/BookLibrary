package com.genpact.BookLibrary.service.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.genpact.BookLibrary.entity.Author;
import com.genpact.BookLibrary.entity.Book;
import com.genpact.BookLibrary.repository.BookRepository;
import com.genpact.BookLibrary.service.BookService;
import com.genpact.BookLibrary.service.impl.BookServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class BookServiceTest {
	@Mock
	BookRepository bookRepository;
	
	@InjectMocks
	BookServiceImpl bookServiceMock;
	
	@Test
	public void addBook() {
		Author author=new Author("Chethan Bhagat", "test");
		Set<Author> authors=new HashSet<Author>();
		authors.add(author);
		
		Book book=new Book("ISBN1","two states","http://cover/img.jpg","english",authors,1);
		when(bookRepository.save(any(Book.class))).thenReturn(book);
		
		assertEquals("two states", bookServiceMock.addBook(book).getTitle());
	}
	

	
}
