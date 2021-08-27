package com.spring.guestbook.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.spring.guestbook.vo.GuestbookVO;

public interface GuestbookService {
	
	public List listArticles() throws DataAccessException;
	
	public GuestbookVO readArticleById(GuestbookVO guestbookVO) throws DataAccessException;

	public int writeArticle(GuestbookVO guestbookVO) throws DataAccessException;

	public int deleteArticle(GuestbookVO guestbookVO) throws DataAccessException;
	
	public int modifyArticle(GuestbookVO guestbookVO) throws DataAccessException;
	
}
