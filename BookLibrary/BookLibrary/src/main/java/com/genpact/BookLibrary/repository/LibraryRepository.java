package com.genpact.BookLibrary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.genpact.BookLibrary.entity.Library;
@Repository
public interface LibraryRepository extends JpaRepository<Library, Long> {

}
