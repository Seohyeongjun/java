package Check;

import java.util.Scanner;

public class Pay {

	Scanner input = new Scanner(System.in);
	
	public Pay(int totalPrice)
	{
		System.out.printf("\n�� ���� �ݾ��� : %d�� �Դϴ�.", totalPrice );
		System.out.print("\n���� ��� 1. ���ݰ���, 2. ī�� ���� : ");
		int payMethde = input.nextInt();
		
		if(payMethde==1)
		{
			System.out.println("\n���ݰ��� ���� �մϴ�.");
			System.out.print("���� ���� : ");
			int payMoney = input.nextInt();
			
			while(true)
			{
				if(totalPrice<=payMoney)
				{
					System.out.printf("�ܱ��� %d���Դϴ�. ", payMoney-totalPrice);
					break;
				}
				else
				{
					System.out.println("���� �ݾ��� �����մϴ�.");
					System.out.println("�߰� �������� : ");
					payMoney+=input.nextInt();
				}
			}
		}
		else
		{
			System.out.println("\nī����� ���� �մϴ�.");
			System.out.printf("���� %d�� �߽��ϴ�.", totalPrice);
		}
	}
}

