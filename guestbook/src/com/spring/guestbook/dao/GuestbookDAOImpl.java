package com.spring.guestbook.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.dao.DataAccessException;

import com.spring.guestbook.vo.GuestbookVO;

public class GuestbookDAOImpl implements GuestbookDAO {
	
	private SqlSession sqlSession;
	
	public SqlSession getSqlSession() {
		return sqlSession;
	}

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public List selectAllArticles() throws DataAccessException {
		return sqlSession.selectList("mapper.guestbook.selectAllArticles");
		//sql문 실행후 결과 데이터를 list형으로 받아온다
	}

	@Override
	public GuestbookVO selectArticleById(GuestbookVO guestbookVO) throws DataAccessException {
		return (GuestbookVO)sqlSession.selectOne("mapper.guestbook.selectArticleById", guestbookVO);
	}

	@Override
	public int insertArticle(GuestbookVO guestbookVO) throws DataAccessException {
		int result = sqlSession.insert("mapper.guestbook.insertArticle", guestbookVO);
		return result;
	}

	@Override
	public int deleteArticle(GuestbookVO guestbookVO) throws DataAccessException {
		int result = sqlSession.delete("mapper.guestbook.deleteArticle", guestbookVO);
		return result;
	}

	@Override
	public int updateArticle(GuestbookVO guestbookVO) throws DataAccessException {
		int result = sqlSession.update("mapper.guestbook.updateArticle", guestbookVO);
		return result;
	}

}
