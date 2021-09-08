package com.spring.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.spring.book.dao.BookDAO;
import com.spring.book.vo.BookVO;

@Service("bookService")
@Transactional(propagation = Propagation.REQUIRED)
public class BookServiceImpl implements BookService {
	
	@Autowired
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
