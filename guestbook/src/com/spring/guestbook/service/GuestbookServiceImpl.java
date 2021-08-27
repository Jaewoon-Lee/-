package com.spring.guestbook.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.spring.guestbook.dao.GuestbookDAO;
import com.spring.guestbook.vo.GuestbookVO;

public class GuestbookServiceImpl implements GuestbookService {

	private GuestbookDAO guestbookDAO;
	
	public GuestbookDAO getGuestbookDAO() {
		return guestbookDAO;
	}

	public void setGuestbookDAO(GuestbookDAO guestbookDAO) {
		this.guestbookDAO = guestbookDAO;
	}

	@Override
	public List listArticles() throws DataAccessException {
		return guestbookDAO.selectAllArticles();
	}

	@Override
	public GuestbookVO readArticleById(GuestbookVO guestbookVO) throws DataAccessException {
		return guestbookDAO.selectArticleById(guestbookVO);
	}

	@Override
	public int writeArticle(GuestbookVO guestbookVO) throws DataAccessException {
		return guestbookDAO.insertArticle(guestbookVO);
	}

	@Override
	public int deleteArticle(GuestbookVO guestbookVO) throws DataAccessException {
		return guestbookDAO.deleteArticle(guestbookVO);
	}

	@Override
	public int modifyArticle(GuestbookVO guestbookVO) throws DataAccessException {
		return guestbookDAO.updateArticle(guestbookVO);
	}

}
