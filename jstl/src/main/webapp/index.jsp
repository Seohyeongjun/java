<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.ArrayList"%>
    
    	<!--  core tag의 이름을 c(변수)로 한다 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   

<a href="/main.jsp">로그인 및 회원가입</a> <br>
<a href="/board.jsp">게시판</a><br>
<a href="/inquiry">문의</a><br>

<%--
	<jsp:forward page="">
	

 --%>
<%-- core태그 변수 --%>
<c:set var="num" value="10"/> <!-- 변수명 : num, 값 : 10 -->

${num }		<!-- 출력 -->
${num+10 }
<c:set var="num" value="30.068" scope="session"/>	<!-- 변수명(num)은 같으나 참조위치가 달라 다른 변수이다. -->

${num +25.6}
${sessionScope.num }	<%-- session 변수(num, 30.68) 출력 --%>

<%-- core태그 조건문 --%>
<c:if test="${30>20 }"> 		<%-- :if test="${조건식}" true만 적용 됨 --%>
	30>20 참이다.
</c:if>
<%----------------------------------------------------------------------------------------------------------------%>
<c:choose>
	<c:when test="${num>5} ">
		<h1>5보다 크다</h1>
	</c:when>
	<c:when test="${100>10} ">
		10보다 크다
	</c:when>	
	
	<c:otherwise>
		위의 조건이 모두 거짓일때 실행
	</c:otherwise>
</c:choose>
<%----------------------------------------------------------------------------------------------------------------%>
<%-- core태그 반복문 --%><%-- step="1" 1씩 더하기 --%>
<c:forEach begin="1" end="10" step="1"><%// for(int i=1; i<10; i++) %>
	내가 반복한다.
</c:forEach>	
<%----------------------------------------------------------------------------------------------------------------%>
<%
	ArrayList<String> list = new ArrayList<>();
	list.add("강감찬"); list.add("이순신"); list.add("장보고");
	
	request.setAttribute("list", list);
%>
<% // for(String name:list) %>
<c:forEach var="name" items="${list }">
	${name }
</c:forEach>
<%----------------------------------------------------------------------------------------------------------------%>
														<%-- delims="@" 문자열@를 items에서 제거 --%>
<c:forTokens items="${'포도@딸기@수박@참외@토마토' }" var="fruit" delims="@">	<%// 문자열 데이터 반복문 forEach의 item(Object type)과 다르다. %>
	${fruit }
</c:forTokens>
<%----------------------------------------------------------------------------------------------------------------%>

<%--
	웹 모델 1 : 사용자 요청 -> 서버 -> 컨테이너 
			-> 서블릿 -> 페이지처리
			-> 컨테이너 -> 서버 -> 사용자
	
	웹 모델 2 (MVC 디자인패턴)
			  사용자 요청 -> 서버 -> 컨테이너 
			  -> 요청에 맞는 서블릿 -> 서비스
			  -> (데이터베이스가 필요하면 DAO, DTO) -> 서블릿 
			  -> 컨테이너 -> 서버 -> 사용자		
			  
	M : model -service, DAO, DTO
	V : view - html, jsp페이지(사용자의 브라우저에 표시되는 부분)
	C : controller - 사용자의 요청을 어떻게 처리할지 결정
	
	예1) 회원가입을 위해 아이디, 비밀번호, 이름, 주소, 여락처 등을 입력하고 가입 버튼을 클릭
	
	1. 가입요청을 Controller(서블릿)가 받는다.
	2. 가입 요청을 처리해 줄 service를 실행한다.
	3. service에서 데이터베이스에 저장하기 위해 DAO를 실행
	4. DAO 실행이 끝나면 가입 완료 페이지를 Controller에게 보내기
	5. Controller는 가입 완료페이지를 사용자에게 보낸다.
	
	DAO : Data Access Object - 데이터베이스에 접근하기 위한 클래스
	DTO : Data Transfer Object - 데이터 저장 클래스
	
	예2)사용자가 로그인을 한다. 아이디, 비밀번호를 입력하고 로그인 버튼 클릭 
	
	1. 로그인요청을 Controller가 받는다(요청 접수 및 요청처리할 수 있는 service 실행).
	2. 로그인 처리를 해줄 수 있는 service를 실행한다. 
	3. service에서 데이터베이스 작업을 수행하는 DAO실행
	4. DAO실행 결과 아이디, 비밀번호가 일치하면 service에서 세션 생성,
								일치하지 않으면 로그인 실패를 Controller엥게 전달
	5. Controller는 로그인 성공유무에 다른 service의 결과를 사용자에게 보낸다.
		  

--%>



    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>