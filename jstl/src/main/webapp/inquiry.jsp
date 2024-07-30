<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%-- inquiry.jsp --%>
<% request.setCharacterEncoding("utf-8"); %>
<form method="post" action="/inquiry">
	<input type="text" name="title"><br>
	<input type="text" name="writer"><br>
	<button>문의등록</button>
</form>

<h3>문의글 등록</h3>
<ul>
	<li> 서블렛 정말 쉬워요~ 더 어렵게 해줘요~</li>
	<li> 아직 mvc패턴 구성은 안한거죠?</li>
	<li>${title }</li>
	
</ul>