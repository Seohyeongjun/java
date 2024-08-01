package membership;

import java.util.Scanner;

import manager.MemberActive;

public class Booking {

	public Booking() {
		Scanner input = new Scanner(System.in);
		Member member = new Member();
		boolean memberCk=false;
		
		System.out.println("\n----------------");
		System.out.println("도서 대여 및 반납");
		
		System.out.print("회원이 아니면 1번을 누르세요 : ");
		int num = input.nextInt();
		if(num==1)
			member.addMember();
		
		while(!memberCk) {
			System.out.print("\n회원번호 입력 : ");
			int memberNum = input.nextInt();
	
			input.nextLine();
			System.out.print("회원이름 입력 : ");
			String memberName = input.nextLine();
			
			memberCk=member.checkMember(memberNum, memberName);
		}
		
		System.out.println("\n1. 대여  2. 반납 ");

		MemberActive memberActive = new MemberActive();
		
		while(true) {
			
			System.out.print("번호를 선택하세요: ");
			num = input.nextInt();
			
			if(num==1) {		// 대여
				memberActive.bookLoan();
				break;
			}
			else if(num==2) {	// 반납
				memberActive.bookReturn();
				break;
			}
			else {
				System.out.println("\n1번 또는 2번을 누르세요");
			}
		}
	}

	private void member(int memberNum, String memberName) {
		// TODO Auto-generated method stub
		
	}
}
