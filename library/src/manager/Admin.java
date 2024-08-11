package manager;

import java.util.Scanner;

import membership.Book;

public class Admin {
	Book book = new Book();
//	List<Book> book = new ArrayList<>();

	public Admin() {	// ���̵� : admin, ��й�ȣ :admin
		System.out.println("\n������ ���");	// ���̵� ��й�ȣ �� ������ �ݺ�
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.print("\n���̵� �Է� : ");			
			String adminId = input.nextLine();
			
			System.out.print("��й�ȣ �Է� : ");
			String adminPw = input.nextLine();
			
			if(adminId.equals("admin")) {
				if(adminPw.equals("admin")) {
					break;
				}
			}
			System.out.println("���̵� �Ǵ� ��й�ȣ�� �ٸ��ϴ�.");
		}
		
		while(true) {
			System.out.println("\n-- ������ ����޴� --");
			System.out.println("1. ���� ���");
			System.out.println("2. ���� ����");
			System.out.println("3. ���� ����");
			System.out.println("4. ����");
			System.out.print("��ȣ ���� : ");
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
				System.out.println("\n����");
				break;
			}
			else {
				System.out.println("1~4���� ��������");
			}			
		}		
	}
	
	void register() {	// �������
		System.out.println("\n���� ���");
		System.out.print("�ڵ��ȣ �Է� : ");
		Scanner input = new Scanner(System.in);
		String codeNum = input.nextLine();
		
		System.out.print("������ �Է� : ");
		String bookName = input.nextLine();
		
		book.addBook(codeNum, bookName);
		System.out.println(book.bookList);
	}

	void modify() {		// ���� ����
		System.out.println("\n���� ����");
		System.out.println(book.bookList);
		System.out.print("�ڵ��ȣ �Է� : ");
		Scanner input = new Scanner(System.in);
		String codeNum = input.nextLine();
		
		System.out.print("\n������ ���� : ");
		String reName = input.nextLine();
		book.modifyBook(codeNum, reName);
		System.out.println(book.bookList);
	}
	void remove() {		// ���� ����
		System.out.println("\n���� ����");
		System.out.println(book.bookList);
		System.out.print("�ڵ��ȣ �Է� : ");
		Scanner input = new Scanner(System.in);
		String codeNum = input.nextLine();
		
		book.remove(codeNum);
		System.out.println(book.bookList);
	}

}
