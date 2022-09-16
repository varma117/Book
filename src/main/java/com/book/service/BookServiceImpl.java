package com.book.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.dto.BookDTO;
import com.book.exceptionhandling.ResourceNotFoundException;
import com.book.model.Book;
import com.book.repository.BookRepositoty;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
@Service
public class BookServiceImpl implements BookService {
	@Autowired
	private BookRepositoty bookRepository;
	

	@Override
	public Long createBook(Book book) {
		Book newBook = bookRepository.save(book);
		return newBook.getId();
	}

	@Override
	public Book editBook(Book book,Long id) {
		
		Book updatedBook = bookRepository.findById(id).orElseThrow(
				()-> new ResourceNotFoundException("Book", "id", id) );
		updatedBook.setBookName(book.getBookName());
		updatedBook.setCategory(book.getCategory());
		updatedBook.setContent(book.getContent());
		updatedBook.setLogo(book.getLogo());
		updatedBook.setPrice(book.getPrice());
		updatedBook.setPublishedDate(book.getPublishedDate());
		updatedBook.setPublisher(book.getPublisher());
		updatedBook.setStatus(book.isStatus());
		updatedBook.setAuthorName(book.getAuthorName());
		
		bookRepository.save(updatedBook);
		return updatedBook;
	}
	
	public Book editBookV2(Book book,Long id) {
					
		return bookRepository.save(book);
	}

	@Override
	public List<Book> getBooks() {
		
		return bookRepository.findAll();
	}

	@Override
	public List<BookDTO> getBookByCategory(String category) {
		return ((List<Book>)
				bookRepository.getBookByCategory(category)).stream().map(this::convertDataIntoDTO).collect(Collectors.toList());
					
	}

	@Override
	public List<BookDTO> getBookByPrice(Integer price) {
		return ((List<Book>)
				bookRepository.getBookByPrice(price)).stream().map(this::convertDataIntoDTO).collect(Collectors.toList());
	}

	@Override
	public List<BookDTO> getBookByAuthorName(String authorName) {
		return 
				bookRepository.getBookByAuthorName(authorName)
				.stream()
				.map(this::convertDataIntoDTO)
				.collect(Collectors.toList());
	}

	
	public List<BookDTO> getBookDetails(){
		return ((List<Book>)
				bookRepository.findAll()).stream().map(this::convertDataIntoDTO).collect(Collectors.toList());
					
		
		
	} 
	private BookDTO convertDataIntoDTO(Book bookDetails) {
		BookDTO dto = new BookDTO();
		dto.setAuthorName(bookDetails.getAuthorName());
		dto.setBookName(bookDetails.getBookName());
		dto.setCategory(bookDetails.getCategory());
		dto.setLogo(bookDetails.getLogo());
		dto.setPrice(bookDetails.getPrice());
		dto.setPublishedDate(bookDetails.getPublishedDate());
		dto.setPublisher(bookDetails.getPublisher());
		return dto;
		
	}

	@Override
	public List<BookDTO> getBookByCategoryOrPriceOrAuthorName(String category,Integer price,String authorName) {
		
		return 
				bookRepository.getBookByCategoryOrPriceOrAuthorName(category,price,authorName)
				.stream()
				.map(this::convertDataIntoDTO)
				.collect(Collectors.toList());
	}

	@Override
	public List<BookDTO> getAllBooks() {
		
		return bookRepository.findAll().stream().map(this::convertDataIntoDTO).collect(Collectors.toList());
	}

	

}
