<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Scanner" %>
    
<%-- test2.jsp --%>

<%-- 
		JSP 스크립트릿
		 ├─	JSP 스크립트릿 : <% %> 
		 │		- 자바 로직 코드를 작성(일반적인 코드작성)
		 ├─	선언문 : <%! %>
		 │		- 자바 변수나 메서드, 클래스 정의 할 때
		 └─	표현식 : <%= %>
		 		- 결과값 출력
		
 --%>    
<%!							// 선언문(if문, 반복문 등 안됨)
	int age=20;				// 변수 선언	
	String name="이순신";		// 변수 선언
	
	int sum(int a, int b){	// 메서드 정의
		return a+b;
	}
	
	class men{				// 클래스 정의
		String userName;
	}
	
	// if, for 같은 제어문 사용불가
	// sum(10, 20) 메서드 호출 안됨
	
//	Scanner input = new Scanner(System.in);
//	int num=input.nextInt();
	
%>

<%
//	int num=input.nextInt();	// 브라우저에서 입력 안됨. 콘솔에서 입력
	sum(10, 20);	// 메서드 호출 가능
	if(age>15){		// 반복문 사용 가능
		
	}
	
	String job="군인";		// 변수 선언 가능
	
	// void print(){		// 메서드, 클래스 정의 불가
	// out.println("출력")
	// }
%>

<%=100 %>
<%="<br>이순신" %>
<%=10>5?"크다" : "작다" %>		<%-- 연산자 사용 가능  --%>
<%=sum(10, 40)%>



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>