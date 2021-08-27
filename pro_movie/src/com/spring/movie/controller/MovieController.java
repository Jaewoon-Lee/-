package com.spring.movie.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

public interface MovieController {

	public ModelAndView listMovies(HttpServletRequest request, HttpServletResponse response) throws Exception;

	public ModelAndView showMovie(HttpServletRequest request, HttpServletResponse response) throws Exception;

	public ModelAndView addMovieForm(HttpServletRequest request, HttpServletResponse response) throws Exception;

	public ModelAndView addMovieProcess(HttpServletRequest request, HttpServletResponse response) throws Exception;

	public ModelAndView modifyMovieForm(HttpServletRequest request, HttpServletResponse response) throws Exception;

	public ModelAndView modifyMovieProcess(HttpServletRequest request, HttpServletResponse response) throws Exception;

	public ModelAndView removeMovieForm(HttpServletRequest request, HttpServletResponse response) throws Exception;

	public ModelAndView removeMovieProcess(HttpServletRequest request, HttpServletResponse response) throws Exception;
	
}
