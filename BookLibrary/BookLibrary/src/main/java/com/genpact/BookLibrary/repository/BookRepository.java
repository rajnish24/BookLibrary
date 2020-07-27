package com.genpact.BookLibrary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.genpact.BookLibrary.entity.Book;
@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

}
