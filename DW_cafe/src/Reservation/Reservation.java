package Reservation;

import java.util.ArrayList;
import java.util.Scanner;

import Check.Drink;

public class Reservation {	
	
	public static void customer(){
		
		Scanner input = new Scanner(System.in);

		ArrayList<Member> customerList = new ArrayList<>();
		
		System.out.println("================  ���ͳ� ���� �ֹ�  ================");
		System.out.print("��¥ : ");
		String date=input.nextLine();
		
		System.out.print("�ð� : ");
		String time=input.nextLine();

		System.out.print("���� �Է� : ");
		String name=input.nextLine();
		
		System.out.print("��ȭ��ȣ �Է� : ");
		String phoneNum=input.nextLine();		

		System.out.print("���̺��ȣ �Է� : ");
		String tableNum=input.nextLine();		

		Member member = new Member(date, time, name, phoneNum, tableNum);
		customerList.add(member);
		
		Pay pay = new Pay(member);

	}
	
}

class Pay
{
	Member member;
	public Pay(Member member)
	{
		this.member=member;
//		System.out.println(member);
	}
	

}