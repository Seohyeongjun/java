<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>	<!-- core태그 사용할 수 있게 됨 -->

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
				<!-- getAttriber("user") -->

		<a href="/signUp.do">회원가입</a>
		<a href="/signIn.do">로그인</a>

		<a href="signIn.do">로그아웃</a>

	
		<a href="/board.do">게시판</a>	<!-- ${sessionScope.user } : login 아이디 -->
		
	
</body>
</html>