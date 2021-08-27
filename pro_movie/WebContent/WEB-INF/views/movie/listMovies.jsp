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
<title>영화관리</title>
</head>
<body>

<h1>영화관리</h1>

<p>[ <a href="${contextPath}/movie/addMovieForm.do">새로운 영화 추가</a>] </p>

<table border="1"  align="center"  width="80%">
    <tr align="center">
      <td ><b>id</b></td>
      <td><b>Title</b></td>
   </tr>
   
<c:forEach var="movie" items="${movies}" >     
   <tr align="center">
      <td>${movie.id}</td>
      <td><a href="${contextPath}/movie/showMovie.do?id=${movie.id}">${movie.title} ${movie.year}</a></td>
    </tr>
  </c:forEach>   
</table>

</body>
</html>