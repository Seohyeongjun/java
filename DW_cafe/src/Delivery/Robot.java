package Delivery;
import java.util.Scanner;

import Check.OrderList;

public class Robot {

	public void deliver()
	{
		System.out.println("\n주문하신 음료가 준비 되었습니다. 배달해 드리겠습니다.\n");
		
		System.out.println("주문하신 음료가 나왔습니다. 확인 바랍니다.");
		
		for(OrderList l :OrderList.drinkOrderList)
		{
			System.out.println(l);
		}
		System.out.print("\n배달완료 시 1번을 누르세요");
		Scanner input = new Scanner(System.in);
		
		if(input.nextInt()==1)
		{
			System.out.println("++++++++++++++++++++++++++++\n"
					+ "감사합니다.맛있게 드세요.\n++++++++++++++++++++++++++++");
		}
	}	
}



