package manager;

import java.util.Scanner;

import membership.Book;

public class Admin {
	Book book = new Book();

	public Admin() {
		System.out.println("\n관리자 모드");
		System.out.print("아이디 입력 : ");
		Scanner input = new Scanner(System.in);
		String adminId = input.nextLine();
		
		System.out.print("비밀번호 입력 : ");
		String adminPw = input.nextLine();
		
		System.out.println("\n-- 관리자 서브메뉴 --");
		System.out.println("1. 도서 등록");
		System.out.println("2. 도서 수정");
		System.out.println("3. 도서 삭제");
		System.out.println("4. 종료");
		System.out.print("번호 선택 : ");
		int num = input.nextInt();
		
		while(true) {
			if(num==1) {
				register();
				break;
			}
			else if(num==2) {
				modify();
				break;
			}
			else if(num==3) {
				remove();
				break;
			}
			else if(num==4) {
				end();
				break;
			}
			else {
				System.out.println("1~4번을 누르세요");
			}			
		}		
	}
	
	void register() {	// 도서등록
		System.out.println("\n도서 등록");
		System.out.print("코드번호 입력 : ");
		Scanner input = new Scanner(System.in);
		String codeNum = input.nextLine();
		
		System.out.print("도서명 입력 : ");
		String bookName = input.nextLine();
		
		book.addBook(codeNum, bookName);
	}

	void modify() {		// 도서 수정
		System.out.println("\n도서 수정");
		System.out.println("코드번호 입력 : ");
		Scanner input = new Scanner(System.in);
		String codeNum = input.nextLine();
		
		System.out.println("\n도서명 수정 : ");
		String reName = input.nextLine();
		book.modifyBook(codeNum, reName);
	}
	void remove() {		// 도서 삭제
		System.out.println("\n도서 삭제");
		System.out.println("코드번호 입력 : ");
		Scanner input = new Scanner(System.in);
		String codeNum = input.nextLine();
		
		book.remove(codeNum);
	}
	void end() {		// 종료
		System.out.println("\n종료");
	}
}
