package com.spring.guestbook.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.spring.guestbook.vo.GuestbookVO;

public interface GuestbookDAO {

	public List selectAllArticles() throws DataAccessException;
	
	public GuestbookVO selectArticleById(GuestbookVO guestbookVO) throws DataAccessException;

	public int insertArticle(GuestbookVO guestbookVO) throws DataAccessException;

	public int deleteArticle(GuestbookVO guestbookVO) throws DataAccessException;
	
	public int updateArticle(GuestbookVO guestbookVO) throws DataAccessException;

}
