package membership;

import java.util.Scanner;

import manager.MemberActive;

public class Booking {

	public Booking() {
		System.out.println("\n----------------");
		System.out.println("���� �뿩 �� �ݳ�");
		
		System.out.print("\nȸ������ �Է� : ");
		Scanner input = new Scanner(System.in);
		int memberNum = input.nextInt();
		
		Member member = new Member(memberNum);
		
		System.out.println("\n1. �뿩  2. �ݳ� ");

		MemberActive memberActive = new MemberActive();
		
		while(true) {
			
			System.out.print("��ȣ�� �����ϼ���: ");
			int num = input.nextInt();
			
			if(num==1) {		// �뿩
				memberActive.bookLoan();
				break;
			}
			else if(num==2) {	// �ݳ�
				memberActive.bookLoan();
				break;
			}
			else {
				System.out.println("1�� �Ǵ� 2���� ��������");
			}
		}
	}
}
