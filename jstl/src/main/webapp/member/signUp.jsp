<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!-- jquery CDN -->
<script src="https://code.jquery.com/jquery-3.7.1.js" integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4=" crossorigin="anonymous"></script>
    
    <!--   signUp.html  -->

    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>회원가입 </h2>
<div id="signupBox">
	<form method="post" action="/signUpSave.do">
	<div class="joinBox">
		<div class="joinInput">
			<label>아이디</label>
			<input type="text" name="userId" placeholder="아이디 입력">
			<p class="duplicate"></p>
		</div>
		<div class="joinInput">
			<label>비밀번호</label>
			<input type="password" name="userPassword" placeholder="비밀번호 입력">
		</div>
		<div class="joinInput">
			<label>이메일</label>
			<input type="email" name="userEmail" placeholder="이메일 입력">
		</div>
		<div class="joinInput">
			<label>이름</label>
			<input type="text" name="userName" placeholder="이름 입력">
		</div>
		<button id="joinBt">회원가입</button>		
	</div>
	</form>
</div>

</body>
</html>

<script>

	var temp = '${idList}'; 
	const IdList = temp.substring(1, temp.length-1).split(", ");	// 양쪽 [, ] 제외 시키고 불러오기
	
	$("input[name=userId]").on("keyup", function(){
		var id = $(this).val();
		if(IdList.indexOf(id) == -1){	// 입력 아이디가 중복이 아니다.
			$(".duplicate").text("사용가능한 아이디 입니다.");
			$(".duplicate").css("color", "green");
			$("#joinBt").attr("disabled", false);	// 아이디 중복시 가입버튼 비 활성화
		}
		else{	// 아이디 중복
			$(".duplicate").text("이미 사용중인 아이디 입니다.");
			$(".duplicate").css("color", "red");
			$("#joinBt").attr("disabled", true);	// 가입버튼 활성화
			
		}
	});
	
</script>











