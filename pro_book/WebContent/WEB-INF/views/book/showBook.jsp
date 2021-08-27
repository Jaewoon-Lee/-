<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<%
	request.setCharacterEncoding("UTF-8");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서관리</title>
</head>
<body>

<h1>도서관리</h1>
<h2>책 상세정보</h2>

		<p>책 번호 : ${book.id}</p>
		<p>책 제목 : ${book.title}</p>
		<p>저자 : ${book.author}</p>
		<p>출판사 : ${book.publication}</p>
		<p>연도 : ${book.year}</p>
		
		<p>
			[ <a href="${contextPath}/book/modifyBookForm.do?id=${book.id}">수정</a>]
			[ <a href="${contextPath}/book/removeBookForm.do?id=${book.id}">삭제</a>]
		</p>
					<input type="button" value="뒤로가기" onclick="history.go(-1)">
</body>
</html>