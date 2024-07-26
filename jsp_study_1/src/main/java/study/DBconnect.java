package study;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBconnect {
	public Connection conn;
	public PreparedStatement pt;
	public ResultSet rs;
	
	public DBconnect() {
		dblink();
	}
	private void dblink() {
		try{	// 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception e){
			System.out.println("드라이버 로드 실패");
		}

		// 계정 접속
		String user = "seo";
		String password = "1234";
		String url="jdbc:mysql://localhost:3306/seo";	// seo 데이터베이스 이름
		
		try{
			conn = DriverManager.getConnection(url, user, password);
		}catch(SQLException e){
			System.out.println("접속 실패");
		}				
	}
}
