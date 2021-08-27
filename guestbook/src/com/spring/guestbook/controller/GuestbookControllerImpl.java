package com.spring.guestbook.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.spring.guestbook.service.GuestbookService;
import com.spring.guestbook.vo.GuestbookVO;

public class GuestbookControllerImpl extends MultiActionController implements GuestbookController {
	
	private GuestbookService guestbookService;
	
	public GuestbookService getGuestbookService() {
		return guestbookService;
	}

	public void setGuestbookService(GuestbookService guestbookService) {
		this.guestbookService = guestbookService;
	}

	@Override
	public ModelAndView listArticles(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String viewName = getViewName(request);
		List articles = guestbookService.listArticles();
		ModelAndView mav = new ModelAndView(viewName);
		mav.addObject("articles", articles);
		return mav;
	}

	@Override
	public ModelAndView writeArticleForm(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String viewName = getViewName(request);
		ModelAndView mav = new ModelAndView(viewName);
		return mav;
	}

	@Override
	public ModelAndView writeArticleProcess(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		GuestbookVO guestbookVO = new GuestbookVO();
		bind(request,guestbookVO);
		int result = guestbookService.writeArticle(guestbookVO);
		ModelAndView mav = new ModelAndView("redirect:/guestbook/listArticles.do");
		return mav;
		}

	@Override
	public ModelAndView modifyArticleForm(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//입력 데이터 바인딩
		request.setCharacterEncoding("utf-8");
		GuestbookVO guestbookVO = new GuestbookVO();
		bind(request,guestbookVO);
		//서비스처리
		GuestbookVO article = guestbookService.readArticleById(guestbookVO);
		// 뷰와 모델 설정
		String viewName = getViewName(request);
		ModelAndView mav = new ModelAndView(viewName);
		mav.addObject("article",article);
		return mav;
	}

	@Override
	public ModelAndView modifyArticleProcess(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		request.setCharacterEncoding("utf-8");
		GuestbookVO guestbookVO = new GuestbookVO();
		bind(request,guestbookVO);
		
		int result = guestbookService.modifyArticle(guestbookVO);
		
		String viewName = getViewName(request);
		ModelAndView mav = new ModelAndView(viewName);
		mav.addObject("result",result);
		return mav;
	}

	@Override
	public ModelAndView deleteArticleForm(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String viewName = getViewName(request);
		ModelAndView mav = new ModelAndView(viewName);
		mav.addObject("id", request.getParameter("id"));
		return mav;
	}

	@Override
	public ModelAndView deleteArticleProcess(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		//데이터 받아서 바인딩
		request.setCharacterEncoding("utf-8");
		GuestbookVO guestbookVO = new GuestbookVO();
		bind(request,guestbookVO);
		//서비스 적용
		int result = guestbookService.deleteArticle(guestbookVO);
		// 뷰 적용
		String viewName = getViewName(request);
		ModelAndView mav = new ModelAndView(viewName);
		mav.addObject("result",result);		
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
