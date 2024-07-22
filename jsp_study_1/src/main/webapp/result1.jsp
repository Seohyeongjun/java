<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%-- result1.jsp -> html태그 삭제

이름과 국어, 수학, 과학 성적을 받아서 

> 평균이 
* 90이상이면 참 잘했어요
* 80이상이면 잘했어요
* 70이상이면 노력해라
* 나머지는 이게 점수야! 출력

--%>
<%@ include file="requestTest2.jsp" %>	
<hr>
<%
	String name=request.getParameter("stdName");

	// String 값을 Integer로 바꾸기
	// Integer.parseInt(String 값);
	// Integer.valueOf(String 값);	
	int kor= Integer.parseInt(request.getParameter("kor"));
	int math=Integer.parseInt(request.getParameter("math"));
	int sci=Integer.valueOf(request.getParameter("sci"));
	
	int total=kor+math+sci;
	int average=total/3;
	String print=name+" ";
	
	if(average>=90)
		{print+="참 잘했어요";}
	else if(average>=80)
		{print+="잘했어요";}
	else if(average>=70)
		{print+="노력해라";}
	else
		{print+="이게 점수야!";}
	
%>

	<div>이름 : <%=name %></div><br>
	<div>국어 : <%=kor %></div>
	<div>수학 : <%=math %></div>
	<div>과학 : <%=sci %></div><br>
	<div>총합 : <%=total %></div>
	<div>평균 : <%=average %></div><br>
	<%=print %>
	
	<br><br>
	<hr>

	
	
	
	