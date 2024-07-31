package Service;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

import DAO.CoffeDAO;
import DAO.TeaDAO;
import DTO.Coffe;
import DTO.Tea;

public class SelectDrink implements Kiosk {

	private HashMap<Integer, Coffe> coffe ;
	private HashMap<Integer, Tea> tea;
	
	public SelectDrink()
	{
		
	}
	
	@Override
	public void action()
	{
		while(true)
		{
			Scanner scan = new Scanner(System.in);
			System.out.print("1. Ŀ��, 2. Ƽ : ");
			
			int category = scan.nextInt();
			
			switch(category)
			{
				case 0 : System.out.println("������ ������");
						return;
						
				case 1 : selectCoffe();
						break;		
				
				case 2 : selectTea();
						break;
				
				default : System.out.println("�ٽ� �Է��ϼ���");				
			}
		}
		
	}
	
	// Ŀ�� ����
	private void selectCoffe()
	{
		CoffeDAO dao = new CoffeDAO();
		coffe = dao.findAll();
		
		Set<Integer> ids = coffe.keySet();
		for(Integer id : ids)
		{
			System.out.println(id+". "+coffe.get(id));
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�޴� ���� : ");
		int menu = sc.nextInt();
		
		Kiosk order = new Order(coffe.get(menu));
		order.action();
		
	}
	
	// Ƽ ����
	private void selectTea()
	{
		TeaDAO dao = new TeaDAO();
		tea = dao.findAll();
		
		Set<Integer> ids = tea.keySet();
		for(Integer id : ids)
		{
			System.out.println(id+". "+tea.get(id));
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�޴� ���� : ");
		int menu = sc.nextInt();
		
		Kiosk order = new Order(tea.get(menu));
		order.action();
		
	}
}













