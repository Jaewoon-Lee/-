package com.spring.book.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.spring.book.dao.BookDAO;
import com.spring.book.vo.BookVO;

public class BookServiceImpl implements BookService {
	
	private BookDAO bookDAO;
	
	public BookDAO getBookDAO() {
		return bookDAO;
	}

	public void setBookDAO(BookDAO bookDAO) {
		this.bookDAO = bookDAO;
	}

	@Override
	public List listBooks() throws DataAccessException {
		return bookDAO.selectAllBooks();
	}

	@Override
	public BookVO showBook(BookVO bookVO) throws DataAccessException {
		return bookDAO.selectBookById(bookVO);
	}

	@Override
	public int addBookProcess(BookVO bookVO) throws DataAccessException {
		return bookDAO.insertBook(bookVO);
	}

	@Override
	public BookVO modifyBookForm(BookVO bookVO) throws DataAccessException {
		return bookDAO.selectBookById(bookVO);
	}

	@Override
	public int modifyBookProcess(BookVO bookVO) throws DataAccessException {
		return bookDAO.updateBook(bookVO);
	}

	@Override
	public int removeBookProcess(BookVO bookVO) throws DataAccessException {
		return bookDAO.deleteBook(bookVO);
	}

	
	
}
