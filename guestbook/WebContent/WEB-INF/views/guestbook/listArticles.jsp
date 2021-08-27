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
<title>방명록</title>
</head>
<body>

<h1>방명록</h1>

<p>[ <a href="${contextPath}/guestbook/writeArticleForm.do">글쓰기</a>] </p>

<hr>
<c:forEach var="article" items="${articles}" >
	<p><b>No. ${article.id}</b>&nbsp;&nbsp;<b>${article.name}</b></p>
	<p>${article.content}</p>
	<p><font size="-1">${article.writedate}</font></p>
	<p>[ <a href="${contextPath}/guestbook/modifyArticleForm.do?id=${article.id}">수정</a>] </p>
	<p>[ <a href="${contextPath}/guestbook/deleteArticleForm.do?id=${article.id}">삭제</a>] </p>
<hr>
</c:forEach>

</body>
</html>