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
<h2>책 추가 양식</h2>

	<form method="POST" action="${contextPath}/book/addBookProcess.do">
		<p>책 제목 <input type="text" name="title"></p>
		<p>저자 <input type="text" name="author"></p>
		<p>출판사 <input type="text" name="publication"></p>
		<p>연도 <input type="text" name="year"></p>
		<p>
			<input type="submit" value="추가">
			<input type="reset" value="초기화">
			<input type="button" value="되돌아가기" onclick="history.go(-1)">
	</form>

</body>
</html>