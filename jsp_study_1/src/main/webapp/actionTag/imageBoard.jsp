<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%-- imageBoard.jsp --%>
    
<div id="imgBoard">
	<%
		for(int i=0; i<15; i++){
	%>
		<img src="https://picsum.photos/250/300?random=<%=i%>">
	<% } %>
</div>