package Check;

import java.util.Scanner;

public class Pay {

	Scanner input = new Scanner(System.in);
	
	public Pay(int totalPrice)
	{
		System.out.printf("\n총 결제 금액은 : %d원 입니다.", totalPrice );
		System.out.print("\n겔제 방식 1. 현금결제, 2. 카드 결제 : ");
		int payMethde = input.nextInt();
		
		if(payMethde==1)
		{
			System.out.println("\n현금결제 결제 합니다.");
			System.out.print("지급 현금 : ");
			int payMoney = input.nextInt();
			
			while(true)
			{
				if(totalPrice<=payMoney)
				{
					System.out.printf("잔금은 %d원입니다. ", payMoney-totalPrice);
					break;
				}
				else
				{
					System.out.println("결제 금액이 부족합니다.");
					System.out.println("추가 현금지급 : ");
					payMoney+=input.nextInt();
				}
			}
		}
		else
		{
			System.out.println("\n카드결제 결제 합니다.");
			System.out.printf("결제 %d원 했습니다.", totalPrice);
		}
	}
}

