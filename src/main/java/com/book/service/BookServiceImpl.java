package com.book.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.model.Book;
import com.book.repository.BookRepositoty;
@Service
public class BookServiceImpl implements BookService {
	@Autowired
	private BookRepositoty bookRepository;
	
	public Long saveBook(Book book) {
		Book saveBook = bookRepository.save(book);
		return saveBook.getId();
	}

}
