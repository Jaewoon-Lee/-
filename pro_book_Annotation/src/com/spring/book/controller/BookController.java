package com.spring.book.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

import com.spring.book.vo.BookVO;

public interface BookController {

	public ModelAndView listBooks(HttpServletRequest request, HttpServletResponse response) throws Exception;

	public ModelAndView showBook(BookVO bookVO, HttpServletRequest request, HttpServletResponse response) throws Exception;

	public ModelAndView addBookForm(HttpServletRequest request, HttpServletResponse response) throws Exception;

	public ModelAndView addBookProcess(BookVO bookVO, HttpServletRequest request, HttpServletResponse response) throws Exception;

	public ModelAndView modifyBookForm(BookVO bookVO, HttpServletRequest request, HttpServletResponse response) throws Exception;

	public ModelAndView modifyBookProcess(BookVO bookVO, HttpServletRequest request, HttpServletResponse response) throws Exception;

	public ModelAndView removeBookForm(BookVO bookVO, HttpServletRequest request, HttpServletResponse response) throws Exception;

	public ModelAndView removeBookProcess(BookVO bookVO, HttpServletRequest request, HttpServletResponse response) throws Exception;

	
}
