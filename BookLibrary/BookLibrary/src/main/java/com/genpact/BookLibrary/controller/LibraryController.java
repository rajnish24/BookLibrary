package com.genpact.BookLibrary.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.genpact.BookLibrary.entity.Library;
import com.genpact.BookLibrary.service.LibraryService;

@RestController
@RequestMapping("api/library/v1")
public class LibraryController {
	
	@Autowired
	LibraryService libraryService;
	
	@RequestMapping(value = "/add",method = RequestMethod.POST)
	public ResponseEntity<Library> addLibrary(@RequestBody Library library){
		Library respObj=libraryService.addLibrary(library);
		return new ResponseEntity<>(respObj,HttpStatus.OK);
	}
	@RequestMapping(value = "/list",method = RequestMethod.GET)
	public ResponseEntity<List<Library>> listAllLibrary(){
		List<Library> respObj=libraryService.getAllLibrary();
		return new ResponseEntity<>(respObj,HttpStatus.OK);
	}
	
	@RequestMapping(value = "/get/{libraryId}",method = RequestMethod.GET)
	public ResponseEntity<Library> findById(@PathVariable(name = "libraryId") long libraryId){
		Library library=libraryService.getLibraryById(libraryId);
		return new ResponseEntity<>(library,HttpStatus.OK);
	}

}
