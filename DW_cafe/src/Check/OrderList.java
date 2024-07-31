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
			return name+" -- "+price+"원";
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
			System.out.println("\n주문하세요");
			System.out.print("커피 1번, 티 2번 : ");
			order=input.nextLine();
			
			if(order.equals("1") || order.equals("1번"))
			{
				System.out.print("커피를 선택해 주세요 : ");
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
			else if(order.equals("2") || order.equals("2번"))
			{
				System.out.print("차를 선택해 주세요 : ");
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
			System.out.println("\n주문 : ");
			for(OrderList l : drinkOrderList)
			{
				System.out.println(l);
			}
			System.out.println("--------------------------------\n총합 : "+totalPrice+"원");
			System.out.print("\n추가 주문 하시겠습니까?  1 : 추가주문, 2 : 주문 끝  : ");
			
			return totalPrice;
		}	
		
}


