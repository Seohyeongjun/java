package DAO;

import java.sql.SQLException;
import java.util.HashMap;

import DTO.ParentDAO;
import DTO.Tea;

public class TeaDAO extends ParentDAO {

	public HashMap<Integer, Tea> findAll()
	{
		HashMap<Integer, Tea> data = new HashMap<>();
		
		String sql="select * from tea";	// * : 모든것( 곱하기 아님)
		
		try
		{
			pt = conn.prepareStatement(sql);
			rs = pt.executeQuery();
			
			while(rs.next())
			{
				// rs.get데이터타입("컬럼명")
				data.put(rs.getInt("tea_id"), new Tea(rs.getString("item_name"), rs.getInt("price")));
			}
			
		}
		
		catch(SQLException e)
		{
			System.out.println("tea테이블 조회 실패");
		}
		
		return data;
	}
}
