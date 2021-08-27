package com.spring.book.vo;

public class BookVO {
	private int id;
	private String title;
	private String author;
	private String publication;
	private int year;

	public BookVO() {
		super();
	}

	public BookVO(int id, String title, String author, String publication, int year) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.publication = publication;
		this.year = year;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublication() {
		return publication;
	}

	public void setPublication(String publication) {
		this.publication = publication;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

}
