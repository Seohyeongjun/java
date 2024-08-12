package reserve;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Camping {
/*
 * ķ���� ���� ���� ���α׷�
 * ķ���峻 ��Ʈ ������ �� 30��
 * ���� �������� �޹�
 * ���� ���α׷� ������ �Ǳ� ���� Ŭ������ �������̽����� ���� ���� * 
 * */
/*
 * ��¥(��, ��, ��)
 * ����(1�� 8����, 10����)
 * ����(2����Ʈ)
 * 
 * */	
	public static int reserveNum=0;
//	private final Reserve reserve ;
	public static Reserve reserve = new Reserve();
	
	static List<Reserve> list = new ArrayList<>();
	
	public Camping(Reserve reserve) {
		this.reserve=reserve;
	}
	
	public static void main(String[] args) {
		System.out.println("DWķ���忡 ���Ű��� ȯ���մϴ�.");		
		int checkR = 0;
		
		while(true) {
			checkR=check();
			
			if(checkR==1){
				System.out.print("\n�����ȣ�� ���� �ּ��� : ");
				Scanner input = new Scanner(System.in);
				int reserveNum=input.nextInt();
				
				reserveCheck(reserveNum);
			}
			else if(checkR==2) {
				campReserve();
			}
			else
				System.out.println("\n1 �Ǵ� 2�� �����ϼ���");
		}
	}
	
	private static void reserveCheck(int reserveNum) {
	
		for(Reserve r:list) {
			if(r.getReserveNum()==reserveNum) {
				System.out.println(r);
			}
		}		
	}
		
	private static void campReserve() {
		Scanner input = new Scanner(System.in);
		String day=null;
		int dayCount=0;
		boolean reserveOk=true;
		
		System.out.println("\n������ �����մϴ�.");
		System.out.println("-- �����ȣ : "+(++reserveNum));

		while(true) {
			System.out.print("\n���� �������� �޹�!!\n������� ���� : ");	
			day = input.nextLine();
			
			if(day.contains("��")) {
				System.out.println("�������� �������� �Դϴ�.");
			}
			else {	
				if(day.contains("��")) dayCount++;
				if(day.contains("ȭ")) dayCount++;
				if(day.contains("��")) dayCount++;
				if(day.contains("��")) dayCount++;
				if(day.contains("��")) dayCount++;
				if(day.contains("��")) dayCount++;

				break;
			}
		}
		
		while(true) {
			
			if(!list.isEmpty()) System.out.println(list);
			
			while(true) {
				reserveOk=true;
				System.out.print("\nķ�α��� ����(1~30��) : ");
				int site = input.nextInt();	
					
				if(site<=30) {
					for(Reserve r:list) {
						if(r.getSiteNum()== site) {
							if(day.contains(r.getDay())) {
								System.out.println("\n�����Ͻ� ��ҿ� �ٸ� ����� ���� ������ ���� �ֽ��ϴ�. ��Ҹ� �ٽ� ������ �ּ���");
								reserveOk=false;
								break;
							}
						}
					}					
					
					if(reserveOk) {
						System.out.println("��� ���� �Ϸ�");
						list.add(new Reserve(reserveNum, day, dayCount, site));
						break;
					}
				}
				else {
					System.out.println("\n1~30�� �� �����ϼ���");
					break;
				}
			}
			System.out.println(list);
			break;
		}
		
	}
	
	 static int check() {		
		
		System.out.print("\n1. ������ Ȯ��\n2. �����ϱ�");
		System.out.print("\n��ȣ�� �����ϼ��� : ");
		
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		return num;
	}

}