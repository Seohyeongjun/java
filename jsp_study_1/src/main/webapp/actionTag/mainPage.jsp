<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%-- mainPage.jsp --%>

<%
	String part=request.getParameter("part");	// header에서 part대신 파일명(imageBoard)를 사용했다면 여기서 part는 파일명이 된다.
	
	if(part!=null){
		if(part.equals("notify") && session.getAttribute("user")==null){	// 신고메뉴를 클릭했는데 로그인하지 않은 상태
			%>
			<jsp:forward page="login.jsp"/>
			<%
		}
	}
	
%>    

    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" href="main.css">

</head>
<body>
	<div id="loginBox">
		<a href="login.jsp">로그인</a>
	</div>
	
	<h2>내가 main 이다</h2>
	<!-- 메뉴 표시 header.jsp -->
	<jsp:include page="header.jsp">
<%--		<jsp:param value="<%=part %>" name="select"/>	<%-- parameter값 --%>
	
	<div id="main">
		<%	if(part==null){	%>
			첫페이지 내용
		<% } else { 
			 part+=".jsp";
		%>
			<jsp:include page="<%=part%>"/>	<%-- imageboard.jsp 대신 <%=part%> --%>
		<% } %>	
	</div>
	
	
	<!-- footer 표시 footer.jsp -->
	<jsp:include page="footer.jsp"/>


</body>
</html>