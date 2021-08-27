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
<title>방명록 - 글수정 양식</title>
</head>
<body>

	<h1>방명록</h1>
	<h2>글쓰기 양식</h2>

	<form method="post" action="${contextPath}/guestbook/modifyArticleProcess.do">
		<p>
			이름 <input type="text" name="name" value="${article.name}" readonly>
		</p>
		<p>
			암호<input type="password" name="pwd">
		</p>
		<p>
			내용<textarea name="content" rows="5" cols="60">${article.content}</textarea>
		</p>
		<p>
			<input type="hidden" name="id" value="${article.id}">
			<input type="submit" value="글쓰기">
			<input type="reset" value="초기화">
			<input type="button" value="뒤로가기" onclick="history.go(-1)">
		</p>
	</form>

</body>
</html>