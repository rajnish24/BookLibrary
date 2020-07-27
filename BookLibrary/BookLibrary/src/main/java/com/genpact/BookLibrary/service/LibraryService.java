package com.genpact.BookLibrary.service;

import java.util.List;

import com.genpact.BookLibrary.entity.Library;

public interface LibraryService {
	public Library addLibrary(Library library);
	public List<Library> getAllLibrary();
	public Library getLibraryById(long id);
	

}
