package Cafe;

import java.util.ArrayList;
import Check.OrderList;
import Check.Pay;
import Check.Table;
import Delivery.Robot;

import java.util.Scanner;

import Check.Drink;
import Check.OrderList;
import Reservation.Member;
import Reservation.Reservation;

public class DWCafe {

	public static void main(String[] args) {
		
		Member reservList = Reservation.customer();
		
		Drink drink = new Drink();
		System.out.println(reservList);
		
		System.out.println("\n�ֹ� : ");
		for(OrderList l : OrderList.drinkOrderList)
		{
			System.out.println(l);
		}
		System.out.println("\n���� : "+OrderList.totalPrice+"�� �����Ϸ�");

		Table table = new Table();
		
		for(int i=0; i<5 ;i++)
		{
			System.out.println("���� ����� ��...");
		}
		Robot deliver = new Robot();
		deliver.deliver();		
		
	}
}



