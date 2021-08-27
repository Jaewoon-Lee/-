package com.spring.movie.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.spring.movie.vo.MovieVO;

public interface MovieService {
	public List listMovies() throws DataAccessException;
	
	public MovieVO showMovie(MovieVO movieVO) throws DataAccessException;
	
	public int addMovieProcess(MovieVO movieVO) throws DataAccessException;
	
	public MovieVO modifyMovieForm(MovieVO movieVO) throws DataAccessException;

	public int modifyMovieProcess(MovieVO movieVO) throws DataAccessException;
	
	public int removeMovieProcess(MovieVO movieVO) throws DataAccessException;

}
