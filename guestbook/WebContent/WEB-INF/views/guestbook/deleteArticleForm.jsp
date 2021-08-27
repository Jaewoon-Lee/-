<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<%
	request.setCharacterEncoding("UTF-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>방명록 - 글삭제 양식</title>
</head>
<body>

	<h1>방명록</h1>
	<h2>글삭제 양식</h2>

	<form method="post" action="${contextPath}/guestbook/deleteArticleProcess.do">
		<p><b>${id}</b>번 글을 삭제하려면 암호를 입력하고 삭제 버튼을 누르세요.</p>
		<p>암호<input type="password" name="pwd"></p>
		<p>
			<input type="hidden" name="id" value="${id}">
			<input type="submit" value="삭제">
			<input type="reset" value="초기화">
			<input type="button" value="뒤로가기" onclick="history.go(-1)">
		</p>
			
	</form>

</body>
</html>