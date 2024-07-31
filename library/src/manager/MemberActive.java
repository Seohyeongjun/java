package manager;

import java.util.Scanner;

import membership.Book;

public class MemberActive implements ManagerActive{

	public MemberActive() {}
	
	
	@Override
	public void bookLoan() {	// �뿩���
		System.out.println("\n�뿩���");
		while(true) {
			System.out.print("å �ڵ� �Է� : ");
			Scanner input = new Scanner(System.in);
			String bookCode = input.nextLine();
			
			Book book = new Book(bookCode);		
			
			System.out.print("\n�߰� �뿩 �Ͻðڽ��ϱ�. \n1 : �߰��뿩  2 : �뿩���� : ");
			int num = input.nextInt();
			
			if(num==2) {
				break;
			}
			else if(num!=1 && num>2) {
				System.out.println("1, 2�� �� �����ϼ���.");
			}
		
		}
	}
	
	@Override
	public void bookReturn() {	// �ݳ����
		System.out.println("\n�ݳ����");
		System.out.println("1. ���� �ݳ�");
		System.out.println("2. �Ϻ� �ݳ�");
		System.out.print("���� : ");
		
		Scanner input = new Scanner(System.in);
		int bookRet = input.nextInt();
		
		while(true) {
			
			if(bookRet==1) {	// ���� �ݳ�
				System.out.println("���� �ݳ��Դϴ�.");
				System.out.println("�뿩�� å�� �ڵ��ȣ�� Ȯ���ϼ���");
				
				System.out.println("���� ������ 1�� ��������");
				int num = input.nextInt();
				
				break;
			}
			else if(bookRet==2) {	// �Ϻ� �ݳ�
				System.out.println("�Ϻ� �ݳ��Դϴ�.");
				System.out.println("å �ڵ� �Է� : ");		
				String bookCode = input.nextLine();
				Book book = new Book(bookCode);
								
				break;
			}
			else {
				System.out.println("1�� �Ǵ� 2���� ��������");
			}
			
			
		}
	}
}
