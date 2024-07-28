package Check;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import Reservation.Member;
import Reservation.Reservation;

//import Reservation.Pay;

class DrinkList
{
	public List<DrinkList> drinkList = new ArrayList<>();	
	
	private String num;
	private String name;
	private int price;
	
	public DrinkList()	{}
	
	public DrinkList(String num, String name, int price)
	{
		this.num=num;
		this.name=name;
		this.price=price;
	}
	
	@Override
	public String toString()
	{
		return num+". "+name+" \t---------- "+price+"원";
	}		
	public void setNum(String num)
	{
		this.num=num;
	}
	
	public String getNum()
	{
		return num;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setPrice(int price)
	{
		this.price=price;
	}
	public int getPrice()
	{
		return price;
	}
	
	public String toNamePrice()
	{
		return name+" -- "+price+"원";
	}
}


public class Drink{
	
	private int addOrder=1;
	
	Coffee coffee = new Coffee();
	Tea tea = new Tea();	
	OrderList order = new OrderList();
	Scanner input = new Scanner(System.in);
//	Member member = null;
	ArrayList<Member> customerList = new ArrayList<>();
	
	public Drink()
	{	
		int totalPrice=0;
		coffee.coffeeList();
		tea.teaList();
		
		while(addOrder==1)
		{
			totalPrice= order.order();
			addOrder = input.nextInt();
		}
		
		Pay pay = new Pay(totalPrice);	
	}	
}



class Coffee extends DrinkList{
	
	public void coffeeList()
	{
		drinkList.add(new DrinkList("1", "롱 블랙", 5000));
		drinkList.add(new DrinkList("2", "아메리카노", 2500));
		drinkList.add(new DrinkList("3", "롱 마끼아또", 4000));
		drinkList.add(new DrinkList("4", "비엔나커피", 3500));		
		drinkList.add(new DrinkList("5", "카페 라떼", 3000));
		drinkList.add(new DrinkList("6", "플랫 화이트", 3500));		
		drinkList.add(new DrinkList("7", "카푸치노", 4000));
		drinkList.add(new DrinkList("8", "카페 모카", 4500));		
		drinkList.add(new DrinkList("9", "코르타도", 4500));
		drinkList.add(new DrinkList("10", "아포가토", 4000));	
		
		System.out.println("============  커피(coffee)  ============");
	
		OrderList.menuList("c", drinkList);	
		
	}
}

class Tea extends DrinkList{
	
	public void teaList()
	{
		drinkList.add(new DrinkList("11", "녹 차", 2000));
		drinkList.add(new DrinkList("12", "홍 차", 3500));
		drinkList.add(new DrinkList("13", "백 차", 3000));
		drinkList.add(new DrinkList("14", "우롱차", 3500));		
		drinkList.add(new DrinkList("15", "자스민차", 2500));
		drinkList.add(new DrinkList("16", "허브차", 3500));		
		drinkList.add(new DrinkList("17", "차이나", 4000));
		drinkList.add(new DrinkList("18", "푸에르", 4500));
		
		System.out.println("\n==============  티(tea)  ==============");
		
		OrderList.menuList("t", drinkList);
	}
}
