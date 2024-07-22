<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

		<!--  method = "get"  : 아이디, 비밀번호 노출 	--> 
		<!--		 = "post" : 노출 안됨 				-->
	<form method="get" action="Logincheck.jsp">		<!-- 아이디, 비밀번호, 로그인 의 내용을 action=Logincheck.jsp에서 받는다. -->
		아이디 <input type="text" name="id" ><br>
		비밀번호<input type="password" name="pw">
		<button>로그인</button>
		
	</form>

</body>
</html>