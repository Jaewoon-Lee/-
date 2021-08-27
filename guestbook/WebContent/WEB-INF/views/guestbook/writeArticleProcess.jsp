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
<title>방명록 - 글쓰기 처리</title>
</head>
<body>

	<h1>방명록</h1>
	<h2>글쓰기 처리</h2>

	<c:choose>
		<c:when test='${result==0 }'>
			<p>글쓰기에 실패했습니다.</p>
			<p>다시 한 번 립력 내용을 확인하세요.</p>
			<input type="button" value="뒤로가기" onclick="history.go(-1)">
		</c:when>
		<c:otherwise>
			<p>글쓰기에 성공하였습니다.</p>
			<p>5초 후에 방명록 글 목록으로 이동합니다.</p>	
			<meta http-equiv="refresh" content="5;url=${contextPath}/guestbook/listArticles.do">
			<input type="button" value="즉시이동" onclick="${contextPath}/guestbook/listArticles.do">	
		</c:otherwise>
	</c:choose>

</body>
</html>