package manager;

import java.util.Scanner;

import membership.Book;
import membership.Booking;

public class Manager {

	public static void main(String[] args) {
		
		open();
		
	}
	
	public static void open() {
		System.out.println("DW ������ �Դϴ�.");

		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.println("\n1 : ���� �뿩 �� �ݳ�");
			System.out.println("2 : �����ڸ��");
			System.out.println("0 : ����");

			System.out.print("��ȣ�� �����ϼ��� : ");
			int selMode = input.nextInt();
			
			if(selMode==1) {	// �뿩 �� �ݳ�
				
				Booking booking = new Booking();
				
				//break;
			}
			else if(selMode==2){	// ������ ���
				Admin admin = new Admin();
				
				//break;
			}	
			else if(selMode==0) {
				System.out.println("����");
				break;
			}
			else {
				System.out.println("1�� �Ǵ� 2���� ��������");
			}
		}
//		System.out.println("\n���� �մϴ�...");
	}
}

