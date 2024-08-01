package manager;

import java.util.Scanner;

import membership.Book;
import membership.Booking;

public class Manager {

	public static void main(String[] args) {
		
		open();
		
	}
	
	public static void open() {
		System.out.println("DW 도서관 입니다.");

		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.println("\n1 : 도서 대여 및 반납");
			System.out.println("2 : 관리자모드");

			System.out.print("번호를 선택하세요 : ");
			int selMode = input.nextInt();
			
			if(selMode==1) {	// 대여 및 반납
				
				Booking booking = new Booking();
				
				//break;
			}
			else if(selMode==2){	// 관리자 모드
				Admin admin = new Admin();
				
				//break;
			}	
			else if(selMode==3) {
				System.out.println("종료");
			}
			else {
				System.out.println("1번 또는 2번을 누르세요");
			}
		}
//		System.out.println("\n종료 합니다...");
	}
}

