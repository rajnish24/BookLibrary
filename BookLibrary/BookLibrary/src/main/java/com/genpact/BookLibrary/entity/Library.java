package com.genpact.BookLibrary.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "library")
public class Library {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
	 private String name;
	 private String address;
	 @OneToMany(fetch = FetchType.LAZY)
	 @JoinColumn(name="library_Id")
	 private Set<Book> books;
	 
	 
	 
	public Library(String name, String address, Set<Book> books) {
		super();
		this.name = name;
		this.address = address;
		this.books = books;
	}
	
	public Library() {
		super();
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Set<Book> getBooks() {
		return books;
	}
	public void setBooks(Set<Book> books) {
		this.books = books;
	}
	
	
	 
}
