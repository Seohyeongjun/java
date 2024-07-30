<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% request.setCharacterEncoding("utf-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="/board">
		<button>글작성</button><br>	
		<input type="text" name="main" placeholder="제목"><br>
		<input type="text" name="textW" placeholder="작성"><br>	
	</form>
	<table>	
		<tr>			
			<td><a href="/board">게시글 첫번째 제목이다.</a></td>				
		</tr>
		<tr>
			<td>내가 작성자</td>
		</tr>
	</table>
</html>