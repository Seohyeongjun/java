<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%--
	choice.jsp
 --%>    
 
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>점심메뉴 선택</h2>
<form method="get" action="lunchInput.jsp">
	메뉴 : <input type="text" name="menu"><br>
	가격 : <input type="text" name="price"><br>
	식당 : <input type="text" name="restaurant">
	<button>선택</button>
</form>
</body>
</html>