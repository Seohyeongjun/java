<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<%-- 내장객체3.jsp --%>
123
12
1
<pre>
123
12
1
<%
	out.println("출력");
%><br><%
	out.newLine();	// <pre>태그 안에는 있는 그대로 적용 된다.(엔터 기능(줄 바꿈 등))
	out.print("정수, 실수, 문자, 문자열 출력 가능");
	
	// page == this

	String name = "이순신";
	
	pageContext.getRequest().getParameter(name);
	pageContext.setAttribute("age", 25);
	
//	pageContext.include("requestTest2.jsp");	//<%@ include file="경로"
	pageContext.forward("내장객체1.jsp");	// page의 특정구간 내용만 바꾸기
	
	
	
%>
<%-- 
<jsp:include page="파일명"/>
<jsp:forward page="파일명"/>
--%>
</pre>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%--<%=pageContext(). --%>

</body>
</html>