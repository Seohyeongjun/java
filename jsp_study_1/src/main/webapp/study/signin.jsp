<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%-- singin.jsp --%>
    
<div id="signinBox">
	<form id="signFm" method="post" action="signCheck.jsp">
		<div class="signinInput">
			<div class="loginInput">			
				<b>아이디</b>
				<input type="text" name="userId" id="userId"><br>
				<p class="error"></p>
			</div>
			<div class="loginInput">
				<b>비밀번호</b>
				<input type="password" name="userPassword" id="userPassword"><br>
				<p class="error"></p>
			</div>
			<button type="button" id="loginBt">로그인</button>	
		</div>		
	</form>
	<div class="findAndJoin">
		<p><a href="findUser.jsp">아이디/비밀번호찾기</a></p>
		<p><a href="/jsp_study_1/study/?part=signup">회원가입</a></p>
	</div>
</div>
<style>
	.error{color:red; font-size:14px;}
</style>

<script>
	let bt=document.getElementById("loginBt");
	bt.addEventListener("click", function(){		// 로그인 버튼의 클릭 이벤트 등록 및 실행 함수 정의
		let id = document.getElementById("userId");
		let pw = document.getElementById("userPassword");
		
		if(id.value==''){	// 아이디 입력 하지 않은 경우
			document.getElementsByClassName("error")[0].innerText="아이디를 입력하세요.";
		}else if(pw.value==''){	// 비밀번호 입력 하지 않은 경우
			document.getElementsByClassName("error")[1].innerText="비밀번호를 입력하세요.";
		}else{
			document.getElementById("signFm").submit();
		}		
	});

</script>
<%-- signup.jsp __%>
</div>
<%--
	
	아래 내용으로 로그인 페이지를 만드세요. 스타일은 알아서.
	전송방식 : post
	전송 url : signCheck.jsp
	아이디 파라미터 : userId
	비밀번호 파라미터 : userPassword
	아이디/비밀번호찾기 url : findUser.jsp
	회원가입 url : signup.jsp
	
--%>