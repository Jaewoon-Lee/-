package com.spring.movie.vo;

public class MovieVO {
	private int id;
	private String title;
	private String actor;
	private int year;
	public MovieVO() {
		super();
	}
	public MovieVO(int id, String title, String actor, int year) {
		super();
		this.id = id;
		this.title = title;
		this.actor = actor;
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
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}


}
