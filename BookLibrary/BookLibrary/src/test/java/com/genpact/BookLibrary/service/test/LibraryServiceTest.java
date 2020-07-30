package com.genpact.BookLibrary.service.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.genpact.BookLibrary.entity.Author;
import com.genpact.BookLibrary.entity.Book;
import com.genpact.BookLibrary.entity.Library;
import com.genpact.BookLibrary.repository.BookRepository;
import com.genpact.BookLibrary.repository.LibraryRepository;
import com.genpact.BookLibrary.service.impl.BookServiceImpl;
import com.genpact.BookLibrary.service.impl.LibraryServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class LibraryServiceTest {
	@Mock
	LibraryRepository libraryRepo;
	
	@InjectMocks
	LibraryServiceImpl libraryServiceMock;
	
	@Test
	public void addLibrary() {
		Author author=new Author("Chethan Bhagat", "test");
		Set<Author> authors=new HashSet<Author>();
		authors.add(author);
		
		Book book1=new Book("ISBN1","two states","http://cover/img.jpg","english",authors,1);
		Book book2=new Book("ISBN12","Looking for Alaska","http://cover/img1.jpg","english",authors,1);
		Set<Book> books=new HashSet<>();
		books.add(book1);
		books.add(book2);
		Library library=new Library("Library A", "Mg Road", books);
		when(libraryRepo.save(any(Library.class))).thenReturn(library);
		assertEquals("Library A", libraryServiceMock.addLibrary(library).getName());
	}
}
