package DAO;

import java.sql.SQLException;
import java.util.HashMap;

import DTO.Coffe;
import DTO.ParentDAO;

public class CoffeDAO extends ParentDAO{

	public HashMap<Integer, Coffe> findAll()
	{
		HashMap<Integer, Coffe> data = new HashMap<>();
						// * : ����( ���ϱ� �ƴ�)
		String sql="select * from coffe";	// coffe order by price desc; desc : ��������, asc : ��������
		
		try
		{
			pt = conn.prepareStatement(sql);
			rs = pt.executeQuery();	// select - executeQuery
									// insert update dalete - executeUpdate
			
			while(rs.next()) 
			{
				// rs.get������Ÿ��("�÷���");
				data.put(rs.getInt("coffe_id"),	new Coffe(rs.getString("item_name"), rs.getInt("price"), rs.getBoolean("decaffein")));
			}
		}
		
		catch(SQLException e)
		{
			System.out.println("coffe���̺� ��ȸ ����");
		}
		
		
		
		
		return data;
	}
	
}
