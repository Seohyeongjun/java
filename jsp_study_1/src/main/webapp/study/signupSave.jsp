<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--
	회원가입을 위해 입력 값을 Member클래스 객체로 저장하고 객체의 데이터를 데이터베이스에 저장한다.
--%>
<%-- Member class 설정 --%>
<jsp:useBean id="newMem" class="study.Member"/>		
<jsp:setProperty property="*" name="newMem"/>

<%
	// newMem 객체의 데이터를 데이터베이스에 저장
	// 1. 데이터베이스 드라이버 로드(메모리에 넣기)
	// 2. 데이터베이스 계정 접속
	
	try{
		Class.forname("com.mysql.cj.jdbc.Driver");
	}catch(Exception e){
		System.out.println("드라이버 로드 실패");
	}

	// 계정 접속
	String user = "seo";
	String password = "1234";
	String url="jdbc.mysql//localhost:3606/seo";
	
	Connection conn=null;
	PreparedStatement pt=null;
	try{
		
	}catch(SQLException e){
		System.out.println("접속 실패");
	}
	
	
	
	
%>