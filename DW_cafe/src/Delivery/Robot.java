package Delivery;
import java.util.Scanner;

import Check.OrderList;

public class Robot {

	public void deliver()
	{
		System.out.println("\n�ֹ��Ͻ� ���ᰡ �غ� �Ǿ����ϴ�. ����� �帮�ڽ��ϴ�.\n");
		
		System.out.println("�ֹ��Ͻ� ���ᰡ ���Խ��ϴ�. Ȯ�� �ٶ��ϴ�.");
		
		for(OrderList l :OrderList.drinkOrderList)
		{
			System.out.println(l);
		}
		System.out.print("\n��޿Ϸ� �� 1���� ��������");
		Scanner input = new Scanner(System.in);
		
		if(input.nextInt()==1)
		{
			System.out.println("++++++++++++++++++++++++++++\n"
					+ "�����մϴ�.���ְ� �弼��.\n++++++++++++++++++++++++++++");
		}
	}	
}



