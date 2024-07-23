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
		System.out.print("\n음료 주문 :");
		order = input.nextLine();
		
//		OrderList.List(order);
	}
	
	public static void coffeeList()
	{
		List<DrinkList> coffee = new ArrayList<>();

		coffee.add(new DrinkList("1. 롱 블랙 (long black) ----------", "5000원"));
		coffee.add(new DrinkList("2. 아메리카노 (Americano) ---------", "2500원"));
		coffee.add(new DrinkList("3. 롱 마끼아또 (Long Macchiato) ---", "4000원"));
		coffee.add(new DrinkList("4. 비엔나커피 (Vienna coffee) -----", "3500원"));		
		coffee.add(new DrinkList("5. 카페 라떼 (Latte) -------------", "3000원"));
		coffee.add(new DrinkList("6. 플랫 화이트 (Flat White) -------", "3500원"));		
		coffee.add(new DrinkList("7. 카푸치노 (Cappuccino) ---------", "4000원"));
		coffee.add(new DrinkList("8. 카페 모카 (Cafe Mocha) --------", "4500원"));		
		coffee.add(new DrinkList("9. 코르타도 (Cortado) ------------", "4500원"));
		coffee.add(new DrinkList("10. 아포가토 (Affogato) ----------", "4000원"));	
		
		System.out.println("================  커피(coffee)  ================");
		for(DrinkList co:coffee)
		{
			System.out.println(co);
		}
		
		OrderList.List(coffee);
	}
	
	public static void teaList()
	{
		List<DrinkList> tea = new ArrayList<>();

		tea.add(new DrinkList("11. 녹차 (Green Tea) -------------", "2000원"));
		tea.add(new DrinkList("12. 홍차 (Black Tea) -------------", "3500원"));
		tea.add(new DrinkList("13. 백차 (White Tea) -------------", "3000원"));
		tea.add(new DrinkList("14. 우롱차 (Oolong Tea) ----------", "3500원"));		
		tea.add(new DrinkList("15. 자스민차 (jasmin Tea) ---------", "2500원"));
		tea.add(new DrinkList("16. 허브차 (Herbal Tea)  ---------", "3500원"));		
		tea.add(new DrinkList("17. 차이나 (Chai Tea) ------------", "4000원"));
		tea.add(new DrinkList("18. 푸에르 (Pu-erh Tea) ----------", "4500원"));
		
		System.out.println("\n==================  티(tea)  ==================");
		for(DrinkList t:tea)
		{
			System.out.println(t);
		}
		

	}

	
}
