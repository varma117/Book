package com.book.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String authorName;
	
	private String logo;
	
	private String bookName;

	private String category;

	private Integer price;
	
	private String publisher;
	
	private Date publishedDate;
	
	private String content;
	
	private boolean status;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Date getPublishedDate() {
		return publishedDate;
	}

	public void setPublishedDate(Date publishedDate) {
		this.publishedDate = publishedDate;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Book(Long id, String authorName, String logo, String bookName, String category, Integer price,
			String publisher, Date publishedDate, String content, boolean status) {
		super();
		this.id = id;
		this.authorName = authorName;
		this.logo = logo;
		this.bookName = bookName;
		this.category = category;
		this.price = price;
		this.publisher = publisher;
		this.publishedDate = publishedDate;
		this.content = content;
		this.status = status;
	}

	public Book() {
		super();
	}
	

}
