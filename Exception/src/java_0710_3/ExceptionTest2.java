package java_0710_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num=0;		
		boolean is = true;
		
		do{
			try 
			{				
				System.out.print("���� �Է� : ");
				num=scan.nextInt();	// ������ ���� �ٷ� catch�� ����(is=true, ���ѷ���)
				is=false;			// ������ ���� ������ is=false
				
			}
			
			catch(InputMismatchException a)
			{
//				a.printStackTrace();
//				System.out.println(a.getMessage());
//				System.out.println(a.getClass());
				System.out.println("������ �Է��Ͻÿ�");
//				scan.nextLine();	// ���� �Է½� �߸��� �Է�(����, ���ڿ�)�Ǿ� �ʱ�ȭ �ʿ�
			}
			
			finally		// ���� ������ ���� ������ ���� 
			{
				scan.nextLine();	// �����Է� �� �����Է�(��Ÿ ��)�� ���� ���� �ʱ�ȭ
			}
			
		} while(is);
		
		System.out.println(num+100);
		System.out.print("�̸� : ");
		String name=scan.nextLine();	// scan.nextLine()�� ���� ������ ���� �ʱ�ȭ�� ���� �ʾ� �Է��� �ȵ�
		System.out.println(name);
	}
}
