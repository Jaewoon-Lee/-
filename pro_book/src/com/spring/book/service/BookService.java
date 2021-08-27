package com.spring.book.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.spring.book.vo.BookVO;

public interface BookService {
	public List listBooks() throws DataAccessException;
	
	public BookVO showBook(BookVO bookVO) throws DataAccessException;
	
	public int addBookProcess(BookVO bookVO) throws DataAccessException;
	
	public BookVO modifyBookForm(BookVO bookVO) throws DataAccessException;

	public int modifyBookProcess(BookVO bookVO) throws DataAccessException;
	
	public int removeBookProcess(BookVO bookVO) throws DataAccessException;

}
