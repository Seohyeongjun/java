package Check;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//import Reservation.Pay;

class DrinkList
{
	private String name;
	private String price;
	
	public DrinkList(String name, String price)
	{
		this.name=name;
		this.price=price;
	}
	
	@Override
	public String toString()
	{
		return name+" "+price;
	}
		
}

class OrderList
{
	static String[] list;
	static List<DrinkList> drinkList;
	static String order;

	public static void List(List<DrinkList> list)
	{
		drinkList=list;
	}
	
	public static void Order(String order)
	{
		order=order;
	}
	
//	for(DrinkList li : list)
//	{
////		order.contains(li);
//	}
//	

		
	
}

public class Drink {
	
	public static void order()
	{
//		DrinkList drinkList = new DrinkList();
		Scanner input = new Scanner(System.in);
		String order;
		System.out.print("\n���� �ֹ� :");
		order = input.nextLine();
		
//		OrderList.List(order);
	}
	
	public static void coffeeList()
	{
		List<DrinkList> coffee = new ArrayList<>();

		coffee.add(new DrinkList("1. �� �� (long black) ----------", "5000��"));
		coffee.add(new DrinkList("2. �Ƹ޸�ī�� (Americano) ---------", "2500��"));
		coffee.add(new DrinkList("3. �� �����ƶ� (Long Macchiato) ---", "4000��"));
		coffee.add(new DrinkList("4. �񿣳�Ŀ�� (Vienna coffee) -----", "3500��"));		
		coffee.add(new DrinkList("5. ī�� �� (Latte) -------------", "3000��"));
		coffee.add(new DrinkList("6. �÷� ȭ��Ʈ (Flat White) -------", "3500��"));		
		coffee.add(new DrinkList("7. īǪġ�� (Cappuccino) ---------", "4000��"));
		coffee.add(new DrinkList("8. ī�� ��ī (Cafe Mocha) --------", "4500��"));		
		coffee.add(new DrinkList("9. �ڸ�Ÿ�� (Cortado) ------------", "4500��"));
		coffee.add(new DrinkList("10. �������� (Affogato) ----------", "4000��"));	
		
		System.out.println("================  Ŀ��(coffee)  ================");
		for(DrinkList co:coffee)
		{
			System.out.println(co);
		}
		
		OrderList.List(coffee);
	}
	
	public static void teaList()
	{
		List<DrinkList> tea = new ArrayList<>();

		tea.add(new DrinkList("11. ���� (Green Tea) -------------", "2000��"));
		tea.add(new DrinkList("12. ȫ�� (Black Tea) -------------", "3500��"));
		tea.add(new DrinkList("13. ���� (White Tea) -------------", "3000��"));
		tea.add(new DrinkList("14. ����� (Oolong Tea) ----------", "3500��"));		
		tea.add(new DrinkList("15. �ڽ����� (jasmin Tea) ---------", "2500��"));
		tea.add(new DrinkList("16. ����� (Herbal Tea)  ---------", "3500��"));		
		tea.add(new DrinkList("17. ���̳� (Chai Tea) ------------", "4000��"));
		tea.add(new DrinkList("18. Ǫ���� (Pu-erh Tea) ----------", "4500��"));
		
		System.out.println("\n==================  Ƽ(tea)  ==================");
		for(DrinkList t:tea)
		{
			System.out.println(t);
		}
		

	}

	
}
