package com.spring.movie.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.spring.movie.service.MovieService;
import com.spring.movie.vo.MovieVO;

public class MovieControllerImpl extends MultiActionController implements MovieController {

	private MovieService movieService;
	
	public MovieService getMovieService() {
		return movieService;
	}

	public void setMovieService(MovieService movieService) {
		this.movieService = movieService;
	}

	@Override
	public ModelAndView listMovies(HttpServletRequest request, HttpServletResponse response) throws Exception {
		List movies = movieService.listMovies();
		
		String viewName = getViewName(request);
		ModelAndView mav = new ModelAndView(viewName);
		mav.addObject("movies", movies);
		return mav;
	}

	@Override
	public ModelAndView showMovie(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		MovieVO id = new MovieVO();
		bind(request,id);
		
		MovieVO movie = movieService.showMovie(id);
		
		String viewName = getViewName(request);
		ModelAndView mav = new ModelAndView(viewName);
		mav.addObject("movie", movie);
		return mav;
	}

	@Override
	public ModelAndView addMovieForm(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String viewName = getViewName(request);
		ModelAndView mav = new ModelAndView(viewName);
		return mav;
	}

	@Override
	public ModelAndView addMovieProcess(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		MovieVO movieVO = new MovieVO();
		bind(request,movieVO);
		
		int result = movieService.addMovieProcess(movieVO);
		
		String viewName = getViewName(request);
		ModelAndView mav = new ModelAndView(viewName);
		mav.addObject("result", result);
		return mav;
	}

	@Override
	public ModelAndView modifyMovieForm(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		MovieVO id = new MovieVO();
		bind(request,id);
		
		MovieVO movie = movieService.modifyMovieForm(id);
		
		String viewName = getViewName(request);
		ModelAndView mav = new ModelAndView(viewName);
		mav.addObject("movie", movie);
		return mav;
	}

	@Override
	public ModelAndView modifyMovieProcess(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		MovieVO movieVO = new MovieVO();
		bind(request,movieVO);
		
		int result = movieService.modifyMovieProcess(movieVO);
		
		String viewName = getViewName(request);
		ModelAndView mav = new ModelAndView(viewName);
		mav.addObject("result", result);
		return mav;
	}

	@Override
	public ModelAndView removeMovieForm(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		MovieVO movieVO = new MovieVO();
		bind(request,movieVO);
		//db와 연결 불필요
		String viewName = getViewName(request);
		ModelAndView mav = new ModelAndView(viewName);
		mav.addObject("id", movieVO.getId());
		return mav;
	}

	@Override
	public ModelAndView removeMovieProcess(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		MovieVO movieVO = new MovieVO();
		bind(request,movieVO);
		
		int result = movieService.removeMovieProcess(movieVO);
		
		String viewName = getViewName(request);
		ModelAndView mav = new ModelAndView(viewName);
		mav.addObject("result", result);
		return mav;
	}
	
	private String getViewName(HttpServletRequest request) throws Exception {
		String contextPath = request.getContextPath();
		String uri = (String) request.getAttribute("javax.servlet.include.request_uri");
		if (uri == null || uri.trim().equals("")) {
			uri = request.getRequestURI();
		}

		int begin = 0;
		if (!((contextPath == null) || ("".equals(contextPath)))) {
			begin = contextPath.length();
		}

		int end;
		if (uri.indexOf(";") != -1) {
			end = uri.indexOf(";");
		} else if (uri.indexOf("?") != -1) {
			end = uri.indexOf("?");
		} else {
			end = uri.length();
		}

		String fileName = uri.substring(begin, end);
		if (fileName.indexOf(".") != -1) {
			fileName = fileName.substring(0, fileName.lastIndexOf("."));
		}
		if (fileName.lastIndexOf("/") != -1) {
			fileName = fileName.substring(fileName.lastIndexOf("/"), fileName.length());
		}
		return fileName;
	}
	
}
