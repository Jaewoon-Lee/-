package com.spring.movie.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.spring.movie.vo.MovieVO;;

public interface MovieDAO {
	public List selectAllMovies() throws DataAccessException;
	
	public MovieVO selectMovieById(MovieVO movieVO) throws DataAccessException;
	
	public int insertMovie(MovieVO movieVO) throws DataAccessException;
	
	public int updateMovie(MovieVO movieVO) throws DataAccessException;
	
	public int deleteMovie(MovieVO movieVO) throws DataAccessException;
}
