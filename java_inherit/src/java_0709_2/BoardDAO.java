package java_0709_2;

import java.sql.Connection;
import java.sql.Statement;			// 직렬처리 방식(속도빠름)
import java.sql.PreparedStatement;	// 병렬처리 방식(권장)
import java.sql.ResultSet;
import java.sql.DriverManager;

public class BoardDAO {
	private Connection conn;	// 데이터베이스 접속정보 저장
	private Statement st;		// SQL명령어 전달과 결과 받기
	private PreparedStatement pt;	// SQL 명령어 전달과 결과 받기
	private ResultSet rs;		// 데이터 조회 결과 저장
	
	public BoardDAO()		// 초기설정
	{
		DriverLoad();	// 데이터베이스 드라이버 로드
		Connected();	// 데이터베이스 접속
	}
	
	// test_board 테이블의 데이터 각져와서 Board클래스 객체로 저장하기
	public Board[] findByAll()
	{
		Board[] list = new Board[7];
		String sql = "select * from test_board"; // sql질의문, 쿼리문
		
		// select 사용시 executeQuery 메서드, 
		// insert, update, delete 사용시 - executeUpdate 메서드
		try
		{
			st=conn.createStatement();	// statement 생성
			rs=st.executeQuery(sql);
			
			int i=0;	// 배열의 인덱스
			while(rs.next())
			{
				list[i] = new Board(rs.getInt("Board_id"), rs.getString("title"), 
						rs.getString("writer"), rs.getString("content"), rs.getInt("hit"));	
				i++;
			}
		}
		catch(Exception e)
		{
			System.out.print("데이터 가져오기 실패");
		}
		
		return list;
	}
	private void DriverLoad()	// 드라이버 로드
	{
		try // try - catch 예외처리
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(Exception e)
		{
			System.out.print("드라이버 로드 실패");
		}
	}
	
	private void Connected()	// 데이터베이스 접속
	{
		String username = "seo";
		String password = "1234";
		String url="jdbc:mysql://localhost:3306/seo";
		
		try
		{
			conn=DriverManager.getConnection(url, username, password);
		}
		catch(Exception e)
		{
			System.out.print("접속 실패");
		}
	}
	
	
}

/*
 	참조변수 필요
 	- Connection, Statement 또는 PreparedStatement, ResultSet
 	
 	1. 데이터베이스와 연결하기 위한 드라이버 로드
 		(mysql 5버전 이후 - com.mysql.cj.jdbc.Driver
 			   5버전 이하 - com.mysql.jdbc.Driver
 			   
	   Class.forName("com.mysql.cj.jdbc.Driver");	// 컴퓨터의 메모리에 로드(프로그램 실행 중)
	   
	   
	2. 데이터베이스 접속
	 - 데이터베이스 계정명, 비밀번호, 주소
	   conn =DriverManager.getConnection(주소, 계정명, 비밀번호);
	   
	   접속 시도한 결과를 Connection의 참조번수(conn)에 저장
	   
	   
	3. conn을 통해서 Statement 또는 PreparedStatement의 객체 생성하여 SQL명령어 보내기 		
 		
 */
