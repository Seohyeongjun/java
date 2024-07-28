<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- boardWrite.jsp--%>

<%-- 스타일 적용하려면 boardWrite.css 만들어 작성 --%>
<form method="post" action="boardSave.jsp" enctype="multipart/form-data">
	<div id="writeBox">
		<div class="writeInput">
			<label>제목</label>
			<input type="text" name="title" id="title">
		</div>
		<div class="writeInput">
			<label>이미지</label>							<!--  accept : 보이는데 제한을 두어 선택하게 한다. 보이지 않을뿐 다 선택 가능. -->
			<input type="file" name="boardImg" id="boardImg" accept=".jpg, .pnp, .jpeg, .gif"> 
														<!-- accept="image/*" accept="video/*" -->
		</div>
		<div class="writeInput">
			<label>내용</label>
			<textarea name="content" id="content"></textarea>
		</div>
		<button>작성</button>
	</div>

</form>