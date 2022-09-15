package com.book.service;



import java.util.List;
import java.util.Optional;

import com.book.dto.BookDTO;
import com.book.model.Book;

public interface BookService  {
	
	
	 public Long createBook(Book book);

	 public Book editBook(Book book,Long id);
		
	 public List<Book> getBooks();
	 
	 
	 
	    public List<BookDTO> getAllBooks();
	    
	    public List<BookDTO> getBookByCategory(String category);
		
		public List<BookDTO> getBookByPrice(Integer price);
		
		public List<BookDTO> getBookByAuthorName(String authorName);
		
		public List<BookDTO> getBookByCategoryOrPriceOrAuthorName(String category,Integer price,String authorName);
}
