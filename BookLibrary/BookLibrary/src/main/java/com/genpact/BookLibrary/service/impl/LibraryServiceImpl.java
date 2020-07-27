package com.genpact.BookLibrary.service.impl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.genpact.BookLibrary.entity.Library;
import com.genpact.BookLibrary.repository.LibraryRepository;
import com.genpact.BookLibrary.service.LibraryService;
@Service
@Transactional
public class LibraryServiceImpl implements LibraryService {
	
	@Autowired
	LibraryRepository libraryRepo;
	@Override
	public Library addLibrary(Library library) {
		
		return libraryRepo.save(library);
	}

	@Override
	public List<Library> getAllLibrary() {
		
		return libraryRepo.findAll();
	}

	@Override
	public Library getLibraryById(long id) {
		
		Optional<Library> library=libraryRepo.findById(id);
		return library.get();
	}

}
