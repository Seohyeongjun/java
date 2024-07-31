package membership;

import java.util.Scanner;

import manager.MemberActive;

public class Booking {

	public Booking() {
		System.out.println("\n----------------");
		System.out.println("도서 대여 및 반납");
		
		System.out.print("\n회원정보 입력 : ");
		Scanner input = new Scanner(System.in);
		int memberNum = input.nextInt();
		
		Member member = new Member(memberNum);
		
		System.out.println("\n1. 대여  2. 반납 ");

		MemberActive memberActive = new MemberActive();
		
		while(true) {
			
			System.out.print("번호를 선택하세요: ");
			int num = input.nextInt();
			
			if(num==1) {		// 대여
				memberActive.bookLoan();
				break;
			}
			else if(num==2) {	// 반납
				memberActive.bookLoan();
				break;
			}
			else {
				System.out.println("1번 또는 2번을 누르세요");
			}
		}
	}
}
