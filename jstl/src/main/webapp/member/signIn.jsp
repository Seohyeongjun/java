<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>로그입 화면 </h2>
<div id="signinBox">
	<form id="signFm" method="post" action="/signInCheck.do">
		<input type="hidden" name="preURL" id="preURL">	<!-- 사용자에게 보이지 않음. 로그인 할때 로그인 후 이젠 페이지로 이동하기 위한 위치 저장용 -->
		<div class="signinInput">
			<div class="loginInput">
				<b>아이디</b>
				<input type="text" name="userId" id="userId">
				<p class="error"></p>
			</div>
			<div class="loginInput">
				<b>비밀번호</b>
				<input type="password" name="userPassword" id="userPassword">
				<p class="error"></p>
			</div>
			<button id="loginBt">로그인</button>
		</div>
	</form>
	<div class="findAndJoin">
		<p><a href="findUser.jsp">아이디/비밀번호찾기</a></p>
		<p><a href="/?part=signup">회원가입</a></p>
	</div>
</div>
</body>
</html>

<script>
	document.getElementById("preURL").value=document.referrer;	// 이전 페이지주소 : document.referrer
</script>