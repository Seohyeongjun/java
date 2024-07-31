<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%-- 내장객체1.jsp --%>

<%--
	JSP 페이지를 생성하고 서버에 의해서 페이지가 동작할 때 서버에서 페이지에게 객체를 할당해 준다.
	
	내장객체는 9가지이다.
		├ 서버 - application : 처음 서버가 시작할 때 생성되는 객체
		├ 연결 - session : 사용자가 서버에 처음 요청할 때 생성되고 사용자가 브라우저를 종료하기전가지 살아 있는 객체
		└ 페이지	┬ request : 사용자의 요청 내용을 저장하는 객체
			  	├ response : 요청에 대한 응답 정보를 저장하는 객체
			  	├ out : 출력객체
			  	├ page : JSP 페이지 자체를 나타낸다.
			  	├ config : JSP 페이지의 설정정보를 저장하는 객체
			  	├ exception : JSP 페이지의 예외발생을 처리하는 객체
			  	└ pageCotext : JSP 페이지의 정보를 저장
		
				

 --%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String localAdddr = request.getLocalAddr();
		out.println(localAdddr);%><br><%

		String serverAddr = request.getRemoteAddr();
		out.println(serverAddr);%><br><%
		
		out.println(request.getLocale());%><br><%
		
		out.println(request.getMethod());	// GET or HOST etc
		%><br><%
		out.println(request.getRequestURI());
		%><br><%
		out.println(request.getRequestURL());	// URL 안에 URI가 있다
		%>
		<!-- 
			input태그에 입력한 내용에 대한 처리를 requestTest.jsp주소로 요청
		 -->
		<br>
		<form method="get" action="requestTest.jsp">
			
			<%-- input 태그에 입력한 값을 request에 저장하기 위해서는 name이 꼭 필요하다. --%>
			<input type="text" name="myName"><br>		
			<input type="date" name="today"><br>
			
			<%-- name은 같아야 한다. 배열의 구조(checkbox로 체크 시) --%>
			<input type="checkbox" name="interest" value="게임">게임 
			<input type="checkbox" name="interest" value="영화">영화
			<input type="checkbox" name="interest" value="자동차">자동차
			<input type="checkbox" name="interest" value="웹툰">웹툰
			
			<br>
			<%-- 배열 --%>
			<select name="city">
				<option value="대전">대전</option>
				<option value="서울">서울</option>
				<option value="광주">광주</option>
				<option value="부산">부산</option>
			</select>

			
			
			
			<button>전송</button>
			
		</form>
		
		
		
		<%
		
		
		
		
		
		
		
		
	%>



</body>
</html>