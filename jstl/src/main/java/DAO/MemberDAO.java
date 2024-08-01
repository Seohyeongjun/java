package DAO;

import java.sql.SQLException;

import DTO.MemberDTO;


public class MemberDAO extends DBConnect{
	
	public void save(MemberDTO member) {	// 회원가입 내용 member테이블에 저장, DTO : 순수 데이터만 저장
		String sql = "insert into member(user_id, user_password, user_email, user_name) values(?,?,?,?)";
		
		try {
			pt = conn.prepareStatement(sql);
			pt.setString(1, member.getUserId());
			pt.setString(2, member.getUserPassword());
			pt.setString(3, member.getUserEmail());
			pt.setString(4, member.getUserName());
			pt.executeUpdate(); 
			
		}catch(SQLException e) {
			System.out.println("회원가입 member테이블 저장 실패");
			e.printStackTrace();
		}
	}
	
	public boolean login(String id, String pw) {
		
		String sql="select * from member where user_id=? and user_password=?";
		
		try {
			pt = conn.prepareStatement(sql);
			pt.setString(1, id);
			pt.setString(2, pw);
			rs=pt.executeQuery();	// 사용자가 입력한 아이디 비번이 존재한다면 값이 있고 
									// 일치하는 값이 없으면 아무 값도 없다.
			if(rs.next())	// 다음위치에 데이터가 있다면 rs.next() = true (아이디, 비밀번호가 login한 값과 일치하는 값이 존재한다면)
			{
				return true;
			}
		}catch(SQLException e) {
			System.out.println("회원 로그인 조회 중 오류 발생");
		}
		
		return false;
	}
	

	
}
