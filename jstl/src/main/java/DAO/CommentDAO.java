package DAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DTO.CommentDTO;

public class CommentDAO extends DBConnect{

	public void save(int bid, String comment, String writer) {

		String sql = "insert into comment(board_id, writer, comment, write_date) values(?, ?, ?, now())	";	// now() 현재 시간을 구하는 함수
		
		try {
			pt = conn.prepareStatement(sql);
			pt.setInt(1, bid);
			pt.setString(2, comment);
			pt.setString(3, writer);
			pt.executeUpdate();
		}
		catch(SQLException e) {
			System.out.println("댓글 저장 실패");
			e.printStackTrace();
		}
		
	}

	public List<CommentDAO> findByBoardId(int bid) {

		String sql="select * from comment where board_id=?";
		List<CommentDTO> list = new ArrayList<>();
		
		try {
			pt = conn.prepareStatement(sql);
			pt.setInt(1, bid);
			rs=pt.executeQuery();
			while(rs.next()) {
				list.add(CommentDTO.of(rs.getInt("comment_id"), rs.getInt("board+id"), 
										rs.getString("writer"), rs.getString("comment"), 
										rs.getDate("write_date").toLocalDate()));
			}
		}
		catch(SQLException e) {
			System.out.println("댓글 조회 실패");
			e.printStackTrace();
		}

		return list;
	}
	
}
