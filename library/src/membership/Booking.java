package membership;

import java.util.Scanner;

import manager.MemberActive;

public class Booking {

	public Booking() {
		Scanner input = new Scanner(System.in);
		Member member = new Member();
		boolean memberCk=false;
		
		System.out.println("\n----------------");
		System.out.println("���� �뿩 �� �ݳ�");
		
		System.out.print("ȸ���� �ƴϸ� 1���� �������� : ");
		int num = input.nextInt();
		if(num==1)
			member.addMember();
		
		while(!memberCk) {
			System.out.print("\nȸ����ȣ �Է� : ");
			int memberNum = input.nextInt();
	
			input.nextLine();
			System.out.print("ȸ���̸� �Է� : ");
			String memberName = input.nextLine();
			
			memberCk=member.checkMember(memberNum, memberName);
		}
		
		System.out.println("\n1. �뿩  2. �ݳ� ");

		MemberActive memberActive = new MemberActive();
		
		while(true) {
			
			System.out.print("��ȣ�� �����ϼ���: ");
			num = input.nextInt();
			
			if(num==1) {		// �뿩
				memberActive.bookLoan();
				break;
			}
			else if(num==2) {	// �ݳ�
				memberActive.bookReturn();
				break;
			}
			else {
				System.out.println("\n1�� �Ǵ� 2���� ��������");
			}
		}
	}

	private void member(int memberNum, String memberName) {
		// TODO Auto-generated method stub
		
	}
}
