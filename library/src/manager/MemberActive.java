package manager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import membership.Book;

public class MemberActive implements ManagerActive{

	public MemberActive() {}
	Book book = new Book();	
	List<Book> bookList = new ArrayList<>();
	
	@Override
	public void bookLoan(int memberNum, String memberName) {	// 대여모드
		System.out.println("\n대여모드");
		while(true) {
			System.out.print("책 코드 입력 : ");
			Scanner input = new Scanner(System.in);
			String bookCode = input.nextLine();
			
			book.BookCode(bookCode, memberNum, memberName);		
			
			System.out.print("\n추가 대여 하시겠습니까. \n1 : 추가대여  2 : 대여종료 : ");
			int num = input.nextInt();
			
			if(num==2) {
				break;
			}
			else if(num!=1 && num>2) {
				System.out.println("1, 2번 중 선택하세요.");
			}
		
		}
	}
	
	private void book(String bookCode) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bookReturn() {	// 반납모드
		System.out.println("\n반납모드");
		System.out.println("1. 전부 반납");
		System.out.println("2. 일부 반납");
		System.out.print("선택 : ");
		
		Scanner input = new Scanner(System.in);
		int bookRet = input.nextInt();
		
		while(true) {
			
			if(bookRet==1) {	// 전부 반납
				System.out.println("전부 반납입니다.");
				System.out.println("대여한 책의 코드번호를 확인하세요\n");
				
				for(Book list:bookList) {
					System.out.println(list);
				}
				
				System.out.println();
				System.out.println("전부 맞으면 1번 누르세요");
				int num = input.nextInt();
				
				break;
			}
			else if(bookRet==2) {	// 일부 반납
				System.out.println("일부 반납입니다.");
				System.out.println("책 코드 입력 : ");		
				String bookCode = input.nextLine();
				Book book = new Book(bookCode);
								
				break;
			}
			else {
				System.out.println("1번 또는 2번을 누르세요");
			}
			
			
		}
	}
}
