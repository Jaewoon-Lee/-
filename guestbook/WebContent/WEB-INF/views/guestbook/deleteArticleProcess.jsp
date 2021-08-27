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
<title>방명록 - 글삭제 처리</title>
</head>
<body>

	<h1>방명록</h1>
	<h2>글삭제 양식</h2>

	<c:choose>
		<c:when test='${result==0 }'>
			<p>글 삭제에 실패했습니다.</p>
			<p>다시 한 번 암호를 확인하세요.</p>
			<input type="button" value="뒤로가기" onclick="history.go(-1)">
		</c:when>
		<c:otherwise>
			<p>글 삭제에 성공하였습니다.</p>
			<p>5초 후에 되돌아갑니다.</p>	
			<meta http-equiv="refresh" content="5;url=${contextPath}/guestbook/listArticles.do">
			<input type="button" value="즉시이동" onclick="location.href='${contextPath}/guestbook/listArticles.do'">	
		</c:otherwise>
	</c:choose>

</body>
</html>