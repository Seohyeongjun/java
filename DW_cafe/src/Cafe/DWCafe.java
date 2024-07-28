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
		
		System.out.println("\n주문 : ");
		for(OrderList l : OrderList.drinkOrderList)
		{
			System.out.println(l);
		}
		System.out.println("\n총합 : "+OrderList.totalPrice+"원 결제완료");

		Table table = new Table();
		
		for(int i=0; i<5 ;i++)
		{
			System.out.println("음료 만드는 중...");
		}
		Robot deliver = new Robot();
		deliver.deliver();		
		
	}
}



