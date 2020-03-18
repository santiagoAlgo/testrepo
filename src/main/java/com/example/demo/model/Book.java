package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Book")
public class Book {

	@Id
	@Column(name="BookId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long bookId;
	
	@Column(name="Title")
	String title;

	public long getBookId() {
		return bookId;
	}

	public void setBookId(long bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Book(long bookId, String title) {
		super();
		this.bookId = bookId;
		this.title = title;
	} 
	
	public Book() {
		super();

	} 
    
	
}
