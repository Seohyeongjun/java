package Check;

import java.util.Scanner;
import Reservation.Member;

public class Table {

	public Table()
	{
//		Member member;
		
		Scanner input = new Scanner(System.in);
		System.out.println("\n�湮���ּż� �����մϴ�.");
		System.out.print("\n�湮�� Ȯ���ϰڽ��ϴ�. \n�ڵ��� ��ȣ�� �Է��� �ּ��� : ");
		String phoneNumCheck = input.nextLine();
		
		while(true)
		{
			if(phoneNumCheck.equals(Member.getPhoneNum()))
			{
				System.out.println("�̸� : "+Member.getName());
				System.out.println("���̺��ȣ : "+Member.getTableNum());
				System.out.println("�ֹ��Ͻ� ���� ������ �帮�ڽ��ϴ�. ���ݸ� ��ٷ� �ּ���\n");
				break;
			}
			else
			{
				System.out.print("�ڵ��� ��ȣ�� �ٸ��ϴ�. \n�ٽ� �Է����ּ��� : ");
			}
		}
	}
}


