<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Arrays"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String name = request.getParameter("myName");	//getParameter 개별 값
		String today = request.getParameter("today");
		
		String[] 관심 = request.getParameterValues("interest"); // checkbox로 온 데이터는 배열이고 getParameterValues로 해야 한다.
		String[] 도시 = request.getParameterValues("city");
		
	%>	
	<div>이름 : <%=name %></div>
	<div>날짜 : <%=today %></div>		
	<div>관심분야 : <%=Arrays.toString(관심) %></div>	<%-- 배열의 값을이 주솟값으로 들어와서 String해 줘야 한다. --%>
	<div>도시 : <%=Arrays.toString(도시) %></div>
</body>
</html>