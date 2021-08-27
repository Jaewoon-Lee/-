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
<title>영화관리 - 제거</title>
</head>
<body>

<h1>영화관리</h1>
<h2>영화 제거 양식</h2>

<form method="POST" action="${contextPath}/movie/removeMovieProcess.do">
	<p>${id}번 책을 삭제하시겠습니까?</p>
	<p>
		<input type="hidden" name="id" value="${id}">
		<input type="submit" value="삭제">
		<input type="button" value="뒤로가기" onclick="history.go(-1)">
		
</form>

<!-- TODO -->

</body>
</html>