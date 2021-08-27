package com.spring.guestbook.vo;

import java.sql.Date;

public class GuestbookVO {
	private int id;
	private String name;
	private String pwd;
	private String content;
	private Date writedate;
	
	public GuestbookVO() {
		super();
	}

	public GuestbookVO(int id, String name, String pwd, String content, Date writedate) {
		super();
		this.id = id;
		this.name = name;
		this.pwd = pwd;
		this.content = content;
		this.writedate = writedate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getWritedate() {
		return writedate;
	}

	public void setWritedate(Date writedate) {
		this.writedate = writedate;
	}
	
	
	
	
}
