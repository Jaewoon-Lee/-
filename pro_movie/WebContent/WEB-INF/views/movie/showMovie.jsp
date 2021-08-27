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
<title>영화관리 - 상세정보</title>
</head>
<body>

<h1>영화관리</h1>
<h2>영화 상세정보</h2>

<table border="1">
    <tr>
    <td>
		<b>번호</b>&nbsp;&nbsp;&nbsp;&nbsp; ${movie.id}<br>
		<b>제목</b>&nbsp;&nbsp;&nbsp;&nbsp; ${movie.title}<br>
		<b>배우</b>&nbsp;&nbsp;&nbsp;&nbsp; ${movie.actor}<br>
		<b>연도</b>&nbsp;&nbsp;&nbsp;&nbsp; ${movie.year}<br>
		</td>
		</tr>
		</table>
		<p>
			[ <a href="${contextPath}/movie/modifyMovieForm.do?id=${movie.id}">수정</a>]
			[ <a href="${contextPath}/movie/removeMovieForm.do?id=${movie.id}">삭제</a>]
		</p>
					<input type="button" value="뒤로가기" onclick="history.go(-1)">
</body>
</html>