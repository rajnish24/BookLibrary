package com.genpact.BookLibrary.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity
@Table(name = "book")
public class Book {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
	
	@Column(name="isbn",unique = true,nullable = false)
	private String isbn;
	private String title;
	private String coverImgUrl;
	private String language;
	private Date createdDate;
	private Date updatedDate;
	@ManyToMany(cascade=CascadeType.PERSIST)  
	@JoinTable(name="author_book", joinColumns=@JoinColumn(name="book_id"), inverseJoinColumns=@JoinColumn(name="author_id"))  
	private Set<Author> authors;
	@Column(name = "library_Id")
	private long libraryId; 
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCoverImgUrl() {
		return coverImgUrl;
	}
	public void setCoverImgUrl(String coverImgUrl) {
		this.coverImgUrl = coverImgUrl;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	public Set<Author> getAuthors() {
		return authors;
	}
	public void setAuthors(Set<Author> authors) {
		this.authors = authors;
	}
	public long getLibraryId() {
		return libraryId;
	}
	public void setLibraryId(long libraryId) {
		this.libraryId = libraryId;
	}
	

}
