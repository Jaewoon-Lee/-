package com.spring.guestbook.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

public interface GuestbookController {
	
	public ModelAndView listArticles(
			HttpServletRequest request,
			HttpServletResponse response) throws Exception;
	
	public ModelAndView writeArticleForm(
			HttpServletRequest request,
			HttpServletResponse response) throws Exception;

	public ModelAndView writeArticleProcess(
			HttpServletRequest request,
			HttpServletResponse response) throws Exception;
	
	public ModelAndView modifyArticleForm(
			HttpServletRequest request,
			HttpServletResponse response) throws Exception;

	public ModelAndView modifyArticleProcess(
			HttpServletRequest request,
			HttpServletResponse response) throws Exception;

	public ModelAndView deleteArticleForm(
			HttpServletRequest request,
			HttpServletResponse response) throws Exception;

	public ModelAndView deleteArticleProcess(
			HttpServletRequest request,
			HttpServletResponse response) throws Exception;

	
}
