<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- jquery CDN -->
<script src="https://code.jquery.com/jquery-3.7.1.js" integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4=" crossorigin="anonymous"></script>
 
 <!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="board/boardWrite.css">
</head>
<body>
	<form method="post" action="/boardUpdate.do">
		<input type="hidden" name="method" value="update">
		<input type="hidden" name="boardId" value="${board.board_id} ">
	
		<div id="writeBox">
			<div class="writeInput">
				<label>제목</label>
				<input type="text" name="title" id="title" value="${board.title }">
			</div>
			
			<div class="writeInput">
				<label>내용</label>
				<textarea name="content" id="content">${board.content }</textarea>
			</div>
			<button >작성</button>
		
		</div>
	</form>
</body>
</html>
<!-- 
<script>
	$("#write").on("click", function(){  
		
		location.href="/boardView.do?id=${board.board_id}";
		
	});
	
</script>
 -->