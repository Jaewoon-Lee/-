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

<p>[ <a href="${contextPath}/book/addBookForm.do">책 추가</a>] </p>

<c:forEach var="book" items="${books}" >
	<p>
		<b>${book.id}</b>
		<a href="${contextPath}/book/showBook.do?id=${book.id}">${book.title}</a>
	</p>
</c:forEach>

</body>
</html>