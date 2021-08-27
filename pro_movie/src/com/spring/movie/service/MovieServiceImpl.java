package com.spring.movie.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.spring.movie.dao.MovieDAO;
import com.spring.movie.vo.MovieVO;

public class MovieServiceImpl implements MovieService {
	
	private MovieDAO movieDAO;
	
	public MovieDAO getMovieDAO() {
		return movieDAO;
	}

	public void setMovieDAO(MovieDAO movieDAO) {
		this.movieDAO = movieDAO;
	}

	@Override
	public List listMovies() throws DataAccessException {
		return movieDAO.selectAllMovies();
	}

	@Override
	public MovieVO showMovie(MovieVO movieVO) throws DataAccessException {
		return movieDAO.selectMovieById(movieVO);
	}

	@Override
	public int addMovieProcess(MovieVO movieVO) throws DataAccessException {
		return movieDAO.insertMovie(movieVO);
	}

	@Override
	public MovieVO modifyMovieForm(MovieVO movieVO) throws DataAccessException {
		return movieDAO.selectMovieById(movieVO);
	}

	@Override
	public int modifyMovieProcess(MovieVO movieVO) throws DataAccessException {
		return movieDAO.updateMovie(movieVO);
	}

	@Override
	public int removeMovieProcess(MovieVO movieVO) throws DataAccessException {
		return movieDAO.deleteMovie(movieVO);
	}

	
	
}
