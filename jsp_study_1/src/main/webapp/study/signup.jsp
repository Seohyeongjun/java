<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%-- signup.jsp --%>    

<%-- 스타일을 적용하고 싶다면 signup.css에 작성하기 --%>

<div id="signupBox">
	<form method="post" action="signupSave.jsp">
		<div class="joinInput">
			<lavel></lavel>
			<input type="text" name="userId" placeholder="아이디 입력">
		</div>
		<div class="joinInput">
			<lavel></lavel>
			<input type="password" name="userPassword" placeholder="비밀번호 입력">
		</div>
		<div class="joinInput">
			<lavel></lavel>
			<input type="email" name="userEmail" placeholder="이메일 입력">
		</div>
		<div class="joinInput">
			<lavel></lavel>
			<input type="text" name="userName" placeholder="이름 입력">
		</div>
		<button id="joinBt">회원가입</button>
	</form>

</div>