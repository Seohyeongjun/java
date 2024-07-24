<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%-- index.jsp --%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<%
	String part=request.getParameter("part");	// header에서 part대신 파일명(imageBoard)를 사용했다면 여기서 part는 파일명이 된다.
%>    

<link rel="stylesheet" href="default.css">

<link rel="stylesheet" href="main.css">
<link rel="stylesheet" href="signin.css">

</head>
<body>

	<div id="wrap">
		<jsp:include page="header.jsp"/>			
			
		<div id="main">
		<% if (part==null){ %>
			<jsp:include page="main.jsp"/>
		<% } else if(part.equals("signin")){ 
			part+=".jsp";
		%>
			<jsp:include page="<%=part %>"/>
		<% }else{ 
			part+=".jsp";
		%>
			<jsp:include page="<%=part %>"/>
		<% }%>	
			
		</div>
			
		
		
		<jsp:include page="footer.jsp"/>
			
			
		
	</div>

</body>
</html>