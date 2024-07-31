package Check;

import java.util.ArrayList;
import Reservation.Reservation;
import java.util.List;
import java.util.Scanner;

public class OrderList {
	
		static List<DrinkList> drinkListCoffee;
		static List<DrinkList> drinkListTea;
		public static List<OrderList> drinkOrderList = new ArrayList<>();	
		
		private String order;
		
		private String coffeeOrder;
		private String teaOrder;
		
		private String name;
		private int price;
		public static int totalPrice;
		
		public OrderList() {}
		
		public OrderList(String name, int price)
		{
			this.name=name;
			this.price=price;		
		}
		public String getName() {
			return name;
		}
		public int getPrice() {
			return price;
		}
		
		public String toString()
		{
			return name+" -- "+price+"��";
		}
		
		public static void menuList(String m, List<DrinkList> list)
		{
			if(m=="c")
			{
				drinkListCoffee=list;
				
				for(DrinkList l:drinkListCoffee)
				{
					System.out.println(l);
				}		
			}
			else
			{
				drinkListTea=list;
				
				for(DrinkList l:drinkListTea)
				{
					System.out.println(l);
				}
			}
		}
		
		Scanner input = new Scanner(System.in);
		
		public int order()
		{
			System.out.println("\n�ֹ��ϼ���");
			System.out.print("Ŀ�� 1��, Ƽ 2�� : ");
			order=input.nextLine();
			
			if(order.equals("1") || order.equals("1��"))
			{
				System.out.print("Ŀ�Ǹ� ������ �ּ��� : ");
				coffeeOrder=input.nextLine();
				
				for(DrinkList l:drinkListCoffee)
				{
					if(l.getNum().equals(coffeeOrder))
					{					
						drinkOrderList.add( new OrderList(l.getName(), l.getPrice()));
						totalPrice+=l.getPrice();
					}
				}
			}
			else if(order.equals("2") || order.equals("2��"))
			{
				System.out.print("���� ������ �ּ��� : ");
				teaOrder=input.nextLine();
				
				for(DrinkList l:drinkListTea)
				{
					if(l.getNum().equals(teaOrder))
					{
						drinkOrderList.add(new OrderList(l.getName(), l.getPrice()));
						totalPrice+=l.getPrice();
					}
				}
			}
			System.out.println("\n�ֹ� : ");
			for(OrderList l : drinkOrderList)
			{
				System.out.println(l);
			}
			System.out.println("--------------------------------\n���� : "+totalPrice+"��");
			System.out.print("\n�߰� �ֹ� �Ͻðڽ��ϱ�?  1 : �߰��ֹ�, 2 : �ֹ� ��  : ");
			
			return totalPrice;
		}	
		
}


