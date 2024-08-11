package manager;

import java.util.Scanner;

import membership.Book;

public class Admin {
	Book book = new Book();
//	List<Book> book = new ArrayList<>();

	public Admin() {	// 아이디 : admin, 비밀번호 :admin
		System.out.println("\n관리자 모드");	// 아이디 비밀번호 안 맞으면 반복
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.print("\n아이디 입력 : ");			
			String adminId = input.nextLine();
			
			System.out.print("비밀번호 입력 : ");
			String adminPw = input.nextLine();
			
			if(adminId.equals("admin")) {
				if(adminPw.equals("admin")) {
					break;
				}
			}
			System.out.println("아이디 또는 비밀번호가 다릅니다.");
		}
		
		while(true) {
			System.out.println("\n-- 관리자 서브메뉴 --");
			System.out.println("1. 도서 등록");
			System.out.println("2. 도서 수정");
			System.out.println("3. 도서 삭제");
			System.out.println("4. 종료");
			System.out.print("번호 선택 : ");
			int num = input.nextInt();			
		
			if(num==1) {
				register();
				//break;
			}
			else if(num==2) {
				modify();
				//break;
			}
			else if(num==3) {
				remove();
				//break;
			}
			else if(num==4) {
				System.out.println("\n종료");
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
		System.out.println(book.bookList);
	}

	void modify() {		// 도서 수정
		System.out.println("\n도서 수정");
		System.out.println(book.bookList);
		System.out.print("코드번호 입력 : ");
		Scanner input = new Scanner(System.in);
		String codeNum = input.nextLine();
		
		System.out.print("\n도서명 수정 : ");
		String reName = input.nextLine();
		book.modifyBook(codeNum, reName);
		System.out.println(book.bookList);
	}
	void remove() {		// 도서 삭제
		System.out.println("\n도서 삭제");
		System.out.println(book.bookList);
		System.out.print("코드번호 입력 : ");
		Scanner input = new Scanner(System.in);
		String codeNum = input.nextLine();
		
		book.remove(codeNum);
		System.out.println(book.bookList);
	}

}
