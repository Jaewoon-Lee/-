package com.spring.book.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.spring.book.vo.BookVO;;

public interface BookDAO {
	public List selectAllBooks() throws DataAccessException;
	
	public BookVO selectBookById(BookVO bookVO) throws DataAccessException;
	
	public int insertBook(BookVO bookVO) throws DataAccessException;
	
	public int updateBook(BookVO bookVO) throws DataAccessException;
	
	public int deleteBook(BookVO bookVO) throws DataAccessException;
}
