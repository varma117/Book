package com.book.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.book.model.Book;
@Repository
public interface BookRepositoty extends JpaRepository<Book, Long> {

    public List<Book> getBookByCategory(String category);
	
	public List<Book> getBookByPrice(Integer price);
	
	public List<Book> getBookByAuthorName(String authorName);
}
