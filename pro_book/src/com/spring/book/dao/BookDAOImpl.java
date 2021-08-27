package com.spring.book.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.dao.DataAccessException;

import com.spring.book.vo.BookVO;

public class BookDAOImpl implements BookDAO {

	private SqlSession sqlSession;
	
	public SqlSession getSqlSession() {
		return sqlSession;
	}
	
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	@Override
	public List selectAllBooks() throws DataAccessException {
		// sql실행 결과 반환
		return sqlSession.selectList("mapper.book.selectAllBooks");
	}

	@Override
	public BookVO selectBookById(BookVO bookVO) throws DataAccessException {
		return (BookVO) sqlSession.selectOne("mapper.book.selectBookById", bookVO);
	}

	@Override
	public int insertBook(BookVO bookVO) throws DataAccessException {
		return sqlSession.insert("mapper.book.insertBook", bookVO);
	}

	@Override
	public int updateBook(BookVO bookVO) throws DataAccessException {
		return sqlSession.update("mapper.book.updateBook", bookVO);
	}

	@Override
	public int deleteBook(BookVO bookVO) throws DataAccessException {
		return sqlSession.delete("mapper.book.deleteBook", bookVO);
	}

}
