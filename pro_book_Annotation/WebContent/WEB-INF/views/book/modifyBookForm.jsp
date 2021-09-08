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
<h2>책 수정 양식</h2>

	<form method="POST" action="${contextPath}/book/modifyBookProcess.do">
		<p>책 제목 <input type="text" name="title" value="${book.title}"></p>
		<p>저자 <input type="text" name="author" value="${book.author}"></p>
		<p>출판사 <input type="text" name="publication" value="${book.publication}"></p>
		<p>연도 <input type="text" name="year" value="${book.year}"></p>
		<p>
			<input type="hidden" name="id" value="${book.id}">
			<input type="submit" value="수정">
			<input type="reset" value="초기화">
			<input type="button" value="되돌아가기" onclick="history.go(-1)">
		</p>
	</form>

</body>
</html>