package com.spring.book.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

public interface BookController {

	public ModelAndView listBooks(HttpServletRequest request, HttpServletResponse response) throws Exception;

	public ModelAndView showBook(HttpServletRequest request, HttpServletResponse response) throws Exception;

	public ModelAndView addBookForm(HttpServletRequest request, HttpServletResponse response) throws Exception;

	public ModelAndView addBookProcess(HttpServletRequest request, HttpServletResponse response) throws Exception;

	public ModelAndView modifyBookForm(HttpServletRequest request, HttpServletResponse response) throws Exception;

	public ModelAndView modifyBookProcess(HttpServletRequest request, HttpServletResponse response) throws Exception;

	public ModelAndView removeBookForm(HttpServletRequest request, HttpServletResponse response) throws Exception;

	public ModelAndView removeBookProcess(HttpServletRequest request, HttpServletResponse response) throws Exception;
	
}
