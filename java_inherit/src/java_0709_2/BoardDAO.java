package java_0709_2;

import java.sql.Connection;
import java.sql.Statement;			// ����ó�� ���(�ӵ�����)
import java.sql.PreparedStatement;	// ����ó�� ���(����)
import java.sql.ResultSet;
import java.sql.DriverManager;

public class BoardDAO {
	private Connection conn;	// �����ͺ��̽� �������� ����
	private Statement st;		// SQL��ɾ� ���ް� ��� �ޱ�
	private PreparedStatement pt;	// SQL ��ɾ� ���ް� ��� �ޱ�
	private ResultSet rs;		// ������ ��ȸ ��� ����
	
	public BoardDAO()		// �ʱ⼳��
	{
		DriverLoad();	// �����ͺ��̽� ����̹� �ε�
		Connected();	// �����ͺ��̽� ����
	}
	
	// test_board ���̺��� ������ �����ͼ� BoardŬ���� ��ü�� �����ϱ�
	public Board[] findByAll()
	{
		Board[] list = new Board[7];
		String sql = "select * from test_board"; // sql���ǹ�, ������
		
		// select ���� executeQuery �޼���, 
		// insert, update, delete ���� - executeUpdate �޼���
		try
		{
			st=conn.createStatement();	// statement ����
			rs=st.executeQuery(sql);
			
			int i=0;	// �迭�� �ε���
			while(rs.next())
			{
				list[i] = new Board(rs.getInt("Board_id"), rs.getString("title"), 
						rs.getString("writer"), rs.getString("content"), rs.getInt("hit"));	
				i++;
			}
		}
		catch(Exception e)
		{
			System.out.print("������ �������� ����");
		}
		
		return list;
	}
	private void DriverLoad()	// ����̹� �ε�
	{
		try // try - catch ����ó��
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(Exception e)
		{
			System.out.print("����̹� �ε� ����");
		}
	}
	
	private void Connected()	// �����ͺ��̽� ����
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
			System.out.print("���� ����");
		}
	}
	
	
}

/*
 	�������� �ʿ�
 	- Connection, Statement �Ǵ� PreparedStatement, ResultSet
 	
 	1. �����ͺ��̽��� �����ϱ� ���� ����̹� �ε�
 		(mysql 5���� ���� - com.mysql.cj.jdbc.Driver
 			   5���� ���� - com.mysql.jdbc.Driver
 			   
	   Class.forName("com.mysql.cj.jdbc.Driver");	// ��ǻ���� �޸𸮿� �ε�(���α׷� ���� ��)
	   
	   
	2. �����ͺ��̽� ����
	 - �����ͺ��̽� ������, ��й�ȣ, �ּ�
	   conn =DriverManager.getConnection(�ּ�, ������, ��й�ȣ);
	   
	   ���� �õ��� ����� Connection�� ��������(conn)�� ����
	   
	   
	3. conn�� ���ؼ� Statement �Ǵ� PreparedStatement�� ��ü �����Ͽ� SQL��ɾ� ������ 		
 		
 */
