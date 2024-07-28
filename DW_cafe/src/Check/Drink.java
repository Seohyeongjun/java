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
		return num+". "+name+" \t---------- "+price+"��";
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
		return name+" -- "+price+"��";
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
		drinkList.add(new DrinkList("1", "�� ��", 5000));
		drinkList.add(new DrinkList("2", "�Ƹ޸�ī��", 2500));
		drinkList.add(new DrinkList("3", "�� �����ƶ�", 4000));
		drinkList.add(new DrinkList("4", "�񿣳�Ŀ��", 3500));		
		drinkList.add(new DrinkList("5", "ī�� ��", 3000));
		drinkList.add(new DrinkList("6", "�÷� ȭ��Ʈ", 3500));		
		drinkList.add(new DrinkList("7", "īǪġ��", 4000));
		drinkList.add(new DrinkList("8", "ī�� ��ī", 4500));		
		drinkList.add(new DrinkList("9", "�ڸ�Ÿ��", 4500));
		drinkList.add(new DrinkList("10", "��������", 4000));	
		
		System.out.println("============  Ŀ��(coffee)  ============");
	
		OrderList.menuList("c", drinkList);	
		
	}
}

class Tea extends DrinkList{
	
	public void teaList()
	{
		drinkList.add(new DrinkList("11", "�� ��", 2000));
		drinkList.add(new DrinkList("12", "ȫ ��", 3500));
		drinkList.add(new DrinkList("13", "�� ��", 3000));
		drinkList.add(new DrinkList("14", "�����", 3500));		
		drinkList.add(new DrinkList("15", "�ڽ�����", 2500));
		drinkList.add(new DrinkList("16", "�����", 3500));		
		drinkList.add(new DrinkList("17", "���̳�", 4000));
		drinkList.add(new DrinkList("18", "Ǫ����", 4500));
		
		System.out.println("\n==============  Ƽ(tea)  ==============");
		
		OrderList.menuList("t", drinkList);
	}
}
