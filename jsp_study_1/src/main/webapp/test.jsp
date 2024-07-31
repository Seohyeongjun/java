<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="Test.Test"%>

<%

	int num=10;
	String name = "이순신";
	for(int i=0; i<5; i++)
	{
		System.out.println(num++);
	}	
	
	Test test = new Test(name, num);
	
	out.println(test.getName());
	out.println(test.getAge());

	
	
%>    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1> <%=name %><%=num %> </h1>

</body>
</html>