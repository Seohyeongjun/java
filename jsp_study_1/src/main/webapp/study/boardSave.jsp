<%@page import="java.util.Enumeration"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="study.*" %>
<%-- boardSave.jsp --%>

<%@ page import="java.sql.*" %> 
<% request.setCharacterEncoding("utf-8"); %>
   
<%
	//작성자 가져오기
	String writer = ((Member)session.getAttribute("user")).getUserId();

	// 이미지 업로드해서 저장될 실제 위치 (\가 하나일 경우는 특수문자로 인식, \\로 해야 경로 표시로 인식한다(windows일 경우 해당))
	String path="C:\\seo\\java_spring\\jsp_study_1\\src\\main\\webapp\\study\\image";
	
	// 업로드할 이미지의 최대크기(1024*1024=1M)
	int size=1024*1024*20;	// 20M
	
	String title=null;
	String content=null;
	String imgName=null;
	String imgPath="/jsp_study_1/study/image/";
	
	try{
		// 파일 업로드를 위한 MultipartRequest 객체 생성
		MultipartRequest mr = new MultipartRequest(request, path, size, "utf-8", 
										new DefaultFileRenamePolicy()); // DefaultFileRenamePolicy() 같은 이름의 파일을 올릴때 다른이름으로 바꿔준다
		// 업로드 이미지 파일 이름 가져오기
		Enumeration em = mr.getFileNames();
		String file = (String)em.nextElement();	// 이미지 한 개만 업로드 하기 때문에 nextElement() 한 번만 하면 된다.
		
		imgName = mr.getFilesystemName(file);	// 실제 저장된 파일 이름
		// 원본이름 - mr.getOriginalFileName(file);	// 똑같은 이름으로 이름이 바뀌기 전 원본이름 파일
		
		// 제목과 내용 파라미터 가져오기
		title = mr.getParameter("title");
		content = mr.getParameter("content");		
		
	}catch(Exception e){
		System.out.print("파일 업로드 실패");
		e.printStackTrace();
	}
	
	
	
	
	

//	String title = request.getParameter("title");
//	String content = request.getParameter("content");
	
	//데이터베이스 사용(로드 및 접속)
	DBconnect db = new DBconnect();	
	//db.pt = db.conn.prepareStatement(sql);

	String sql = "insert into board(title, writer, content) values(?,?,?)";
	
	try{
		db.pt=db.conn.prepareStatement(sql);
		db.pt.setString(1, title);
		db.pt.setString(2, writer);
		db.pt.setString(3, content);
		db.pt.executeUpdate();	// 실행
	}catch(SQLException e){
		e.printStackTrace();
	}
	
	int boardId=0; // 방금 저장한 게시글 번호를 저장하기 위한 변수
										// desc 내림차순, limit 1 맨 끝에 하나
	sql = "select board_id from board order by board_id desc limit 1";
	
	try{
		db.pt = db.conn.prepareStatement(sql);
		db.rs = db.pt.executeQuery();
		
		if(db.rs.next()){
			boardId = db.rs.getInt("board_id");
		}
	}catch(SQLException e){
		
	}
	
	sql = "insert into board_img(board_id, img_name, img_path) values(?,?,?)";
	
	try{
		db.pt = db.conn.prepareStatement(sql);
		db.pt.setInt(1, boardId);
		db.pt.setString(2, imgName);
		db.pt.setString(3, imgPath);
		db.pt.executeUpdate();
		
	}catch(SQLException e){
		
	}
	
	response.sendRedirect("/jsp_study_1/study/?part=board");

%>










