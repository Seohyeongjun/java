<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    <%-- create.jsp --%>
    
<%
	request.setAttribute("name", "장보고");
	session.setAttribute("age", 34);
	application.setAttribute("job", "군인");


%>     
	<h2>객체 생성 저장</h2>
    requset 객체 -> name : <%=request.getAttribute("name") %><br>
    session 객체 -> age : <%=session.getAttribute("age") %><br>
    application 객체 -> job : <%=application.getAttribute("job") %><br>
    
    <a href="object_check.jsp">이동</a>
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>