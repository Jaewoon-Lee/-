package com.spring.book.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.spring.book.service.BookService;
import com.spring.book.vo.BookVO;

@Controller("bookController")
public class BookControllerImpl extends MultiActionController implements BookController {
	@Autowired
	private BookService bookService;
	@Autowired
	private BookVO bookVO;
	
	public BookService getBookService() {
		return bookService;
	}

	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}

	@Override
	@RequestMapping(value="/book/listBooks.do", method = {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView listBooks(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//바인딩
		
		//서비스
		List books = bookService.listBooks();
		//뷰모델
		String viewName = getViewName(request);
		ModelAndView mav = new ModelAndView(viewName);
		mav.addObject("books", books);
		return mav;
	}

	@Override
	@RequestMapping(value="/book/showBook.do", method = {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView showBook(@ModelAttribute("book") BookVO bookVO, HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");		
		
		BookVO book = bookService.showBook(bookVO);
		
		String viewName = getViewName(request);
		ModelAndView mav = new ModelAndView(viewName);
		mav.addObject("book", book);
		return mav;
	}

	@Override
	@RequestMapping(value="book/addBookForm.do", method = {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView addBookForm(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String viewName = getViewName(request);
		ModelAndView mav = new ModelAndView(viewName);
		return mav;
	}

	@Override
	@RequestMapping(value="book/addBookProcess.do", method = {RequestMethod.GET,RequestMethod.POST})	
	public ModelAndView addBookProcess(@ModelAttribute("bookVO") BookVO bookVO, HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");

		int result = bookService.addBookProcess(bookVO);
		
		String viewName = getViewName(request);
		ModelAndView mav = new ModelAndView(viewName);
		mav.addObject("result", result);
		return mav;
	}

	@Override
	@RequestMapping(value="book/modifyBookForm.do", method = {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView modifyBookForm(@ModelAttribute("bookVO") BookVO bookVO, HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		
		BookVO book = bookService.modifyBookForm(bookVO);
		
		String viewName = getViewName(request);
		ModelAndView mav = new ModelAndView(viewName);
		mav.addObject("book", book);
		return mav;
	}

	@Override
	@RequestMapping(value="book/modifyBookProcess.do",method = {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView modifyBookProcess(@ModelAttribute("bookVO") BookVO bookVO, HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		
		int result = bookService.modifyBookProcess(bookVO);
		
		String viewName = getViewName(request);
		ModelAndView mav = new ModelAndView(viewName);
		mav.addObject("result", result);
		return mav;
	}

	@Override
	@RequestMapping(value="book/removeBookForm.do", method = {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView removeBookForm(@ModelAttribute("bookVO") BookVO bookVO, HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		//db와 연결 불필요
		String viewName = getViewName(request);
		ModelAndView mav = new ModelAndView(viewName);
		mav.addObject("id", bookVO.getId());
		return mav;
	}

	@Override
	@RequestMapping(value="book/removeBookProcess.do", method = {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView removeBookProcess(@ModelAttribute("bookVO") BookVO bookVO, HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		
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
