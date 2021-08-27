package com.spring.movie.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.dao.DataAccessException;

import com.spring.movie.vo.MovieVO;

public class MovieDAOImpl implements MovieDAO {

	private SqlSession sqlSession;
	
	public SqlSession getSqlSession() {
		return sqlSession;
	}
	
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	@Override
	public List selectAllMovies() throws DataAccessException {
		// sql실행 결과 반환
		return sqlSession.selectList("mapper.movie.selectAllMovies");
	}

	@Override
	public MovieVO selectMovieById(MovieVO movieVO) throws DataAccessException {
		return (MovieVO) sqlSession.selectOne("mapper.movie.selectMovieById", movieVO);
	}

	@Override
	public int insertMovie(MovieVO movieVO) throws DataAccessException {
		return sqlSession.insert("mapper.movie.insertMovie", movieVO);
	}

	@Override
	public int updateMovie(MovieVO movieVO) throws DataAccessException {
		return sqlSession.update("mapper.movie.updateMovie", movieVO);
	}

	@Override
	public int deleteMovie(MovieVO movieVO) throws DataAccessException {
		return sqlSession.delete("mapper.movie.deleteMovie", movieVO);
	}

}
