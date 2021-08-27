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
<title>영화관리 - 수정</title>
</head>
<body>

<h1>영화관리</h1>
<h2>영화 수정 양식</h2>

	<form method="POST" action="${contextPath}/movie/modifyMovieProcess.do">
		<p>제목 <input type="text" name="title" value="${movie.title}"></p>
		<p>배우 <input type="text" name="actor" value="${movie.actor}"></p>
		<p>연도 <input type="text" name="year" value="${movie.year}"></p>
		<p>
			<input type="hidden" name="id" value="${movie.id}">
			<input type="submit" value="수정">
			<input type="reset" value="초기화">
			<input type="button" value="되돌아가기" onclick="history.go(-1)">
		</p>
	</form>

</body>
</html>