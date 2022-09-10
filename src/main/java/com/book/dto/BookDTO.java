package com.book.dto;

import java.util.Date;

public class BookDTO {
	
	private String logo;
	private String bookName;
	private String authorName;
	private String publisher;
	private Integer price;
	private Date publishedDate;
	private String category;
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
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Date getPublishedDate() {
		return publishedDate;
	}
	public void setPublishedDate(Date publishedDate) {
		this.publishedDate = publishedDate;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public BookDTO(String logo, String bookName, String authorName, String publisher, Integer price, Date publishedDate,
			String category) {
		super();
		this.logo = logo;
		this.bookName = bookName;
		this.authorName = authorName;
		this.publisher = publisher;
		this.price = price;
		this.publishedDate = publishedDate;
		this.category = category;
	}
	public BookDTO() {
		super();
	}
	
	

}
