package Reservation;

import java.util.ArrayList;
import java.util.Scanner;

import Check.Drink;

public class Reservation {	
	
	public static Member customer(){
		
		Scanner input = new Scanner(System.in);

		ArrayList<Member> customerList = new ArrayList<>();
		
		System.out.println("================  인터넷 예약 주문  ================");
		System.out.print("날짜 : ");
		String date=input.nextLine();
		
		System.out.print("시간 : ");
		String time=input.nextLine();

		System.out.print("고객명 입력 : ");
		String name=input.nextLine();
		
		System.out.print("전화번호 입력 : ");
		String phoneNum=input.nextLine();		

		System.out.print("테이블번호 입력 : ");
		String tableNum=input.nextLine();		

		Member member = new Member(date, time, name, phoneNum, tableNum);
		customerList.add(member);
//		System.out.println(member);
		
		return member;
	}	
}
