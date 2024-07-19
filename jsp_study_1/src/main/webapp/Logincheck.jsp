<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String myId = request.getParameter("id");
	String myPw = request.getParameter("pw");
	
//	out.print(myId);
	
	if(myId.equals("asdf") && myPw.equals("1234"))
	{
%>
	<script>
		alert("로그인 성공");
		location.href="login.jsp";
	</script>
<%
	}
	else
	{
%>		
	<script>
		alert("로그인 실패");
		location.href="login.jsp";
	</script>
<%		
	}

%>

<%-- jsp 주석 --%>






<!--  Logincheck.jsp  -->