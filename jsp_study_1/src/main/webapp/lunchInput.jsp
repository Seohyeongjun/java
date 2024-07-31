<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<%-- 
	lunchInput.jsp
 --%>    
 
 <%
// request 객체에 문자코드 적용(한글깨짐 방지)
 request.setCharacterEncoding("utf-8");
 %>
 <jsp:useBean id="lunch" class="Test.Lunch"/>
 <jsp:setProperty name="lunch" property="*" />
 
 <jsp:getProperty name="lunch" property="menu"/><br>
 <%= lunch.getPrice()%><br>
 
 <%
 	out.println(lunch.getRestaurant());
 %>

 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>