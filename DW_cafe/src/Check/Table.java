package Check;

import java.util.Scanner;
import Reservation.Member;

public class Table {

	public Table()
	{
//		Member member;
		
		Scanner input = new Scanner(System.in);
		System.out.println("\n방문해주셔서 감사합니다.");
		System.out.print("\n방문자 확인하겠습니다. \n핸드폰 번호를 입력해 주세요 : ");
		String phoneNumCheck = input.nextLine();
		
		while(true)
		{
			if(phoneNumCheck.equals(Member.getPhoneNum()))
			{
				System.out.println("이름 : "+Member.getName());
				System.out.println("테이블번호 : "+Member.getTableNum());
				System.out.println("주문하신 음료 가져다 드리겠습니다. 조금만 기다려 주세요\n");
				break;
			}
			else
			{
				System.out.print("핸드폰 번호가 다릅니다. \n다시 입력해주세요 : ");
			}
		}
	}
}


