package DTO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ParentDAO {

	protected Connection conn;
	protected PreparedStatement pt;
	protected ResultSet rs;
	
	public ParentDAO()
	{
		driverLoad();
		connect();
	}
	private void driverLoad()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(Exception e)
		{
			System.out.println("����̹� �ε� ����");
		}
		
	}
	private void connect()
	{
		String user="seo";
		String password="1234";
		String url="jdbc:mysql://localhost:3306/seo";
		
		try
		{
			conn=DriverManager.getConnection(url, user, password);
		}
		catch(Exception e)
		{
			System.out.println("������ ���̽� ���� ����");
		}
		
	}
	
	
	
}
