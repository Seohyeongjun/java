package manager;

import java.util.Scanner;

import membership.Book;

public class Admin {
	Book book = new Book();

	public Admin() {
		System.out.println("\n������ ���");
		System.out.print("���̵� �Է� : ");
		Scanner input = new Scanner(System.in);
		String adminId = input.nextLine();
		
		System.out.print("��й�ȣ �Է� : ");
		String adminPw = input.nextLine();
		
		System.out.println("\n-- ������ ����޴� --");
		System.out.println("1. ���� ���");
		System.out.println("2. ���� ����");
		System.out.println("3. ���� ����");
		System.out.println("4. ����");
		System.out.print("��ȣ ���� : ");
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
	}

	void modify() {		// ���� ����
		System.out.println("\n���� ����");
		System.out.println("�ڵ��ȣ �Է� : ");
		Scanner input = new Scanner(System.in);
		String codeNum = input.nextLine();
		
		System.out.println("\n������ ���� : ");
		String reName = input.nextLine();
		book.modifyBook(codeNum, reName);
	}
	void remove() {		// ���� ����
		System.out.println("\n���� ����");
		System.out.println("�ڵ��ȣ �Է� : ");
		Scanner input = new Scanner(System.in);
		String codeNum = input.nextLine();
		
		book.remove(codeNum);
	}
	void end() {		// ����
		System.out.println("\n����");
	}
}
