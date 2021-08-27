package com.spring.book.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.spring.book.service.BookService;
import com.spring.book.vo.BookVO;

public class BookControllerImpl extends MultiActionController implements BookController {

	private BookService bookService;
	
	public BookService getBookService() {
		return bookService;
	}

	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}

	@Override
	public ModelAndView listBooks(HttpServletRequest request, HttpServletResponse response) throws Exception {
		List books = bookService.listBooks();
		
		String viewName = getViewName(request);
		ModelAndView mav = new ModelAndView(viewName);
		mav.addObject("books", books);
		return mav;
	}

	@Override
	public ModelAndView showBook(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		BookVO id = new BookVO();
		bind(request,id);
		
		BookVO book = bookService.showBook(id);
		
		String viewName = getViewName(request);
		ModelAndView mav = new ModelAndView(viewName);
		mav.addObject("book", book);
		return mav;
	}

	@Override
	public ModelAndView addBookForm(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String viewName = getViewName(request);
		ModelAndView mav = new ModelAndView(viewName);
		return mav;
	}

	@Override
	public ModelAndView addBookProcess(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		BookVO bookVO = new BookVO();
		bind(request,bookVO);
		
		int result = bookService.addBookProcess(bookVO);
		
		String viewName = getViewName(request);
		ModelAndView mav = new ModelAndView(viewName);
		mav.addObject("result", result);
		return mav;
	}

	@Override
	public ModelAndView modifyBookForm(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		BookVO id = new BookVO();
		bind(request,id);
		
		BookVO book = bookService.modifyBookForm(id);
		
		String viewName = getViewName(request);
		ModelAndView mav = new ModelAndView(viewName);
		mav.addObject("book", book);
		return mav;
	}

	@Override
	public ModelAndView modifyBookProcess(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		BookVO bookVO = new BookVO();
		bind(request,bookVO);
		
		int result = bookService.modifyBookProcess(bookVO);
		
		String viewName = getViewName(request);
		ModelAndView mav = new ModelAndView(viewName);
		mav.addObject("result", result);
		return mav;
	}

	@Override
	public ModelAndView removeBookForm(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		BookVO bookVO = new BookVO();
		bind(request,bookVO);
		//db와 연결 불필요
		String viewName = getViewName(request);
		ModelAndView mav = new ModelAndView(viewName);
		mav.addObject("id", bookVO.getId());
		return mav;
	}

	@Override
	public ModelAndView removeBookProcess(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		BookVO bookVO = new BookVO();
		bind(request,bookVO);
		
		int result = bookService.removeBookProcess(bookVO);
		
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
