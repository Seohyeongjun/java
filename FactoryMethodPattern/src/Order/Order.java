package Order;

import java.util.Scanner;

import FactoryMethod.ChainChicken;
import FactoryMethod.MainChicken;
import chickenType.ChickenType;
import recipe.Making;

public class Order {
		
	public static void main(String[] args) {

		SayHi();
		
		String order;
		Scanner scan = new Scanner(System.in);
		System.out.print("주문 번호 : ");
		order=scan.nextLine();	
		System.out.println("-----------------------------------");
		orderChicken(order);
	}

	static void SayHi() {
		System.out.println("안녕하세요! DW치킨 대전 선화점입니다.");
		System.out.println("치킨을 주문해 주세요\n");
		System.out.println("1번 : 후라이드, 2번 : 간장양념, 3번 : 마늘양념");
			
	}	
	
	static void orderChicken(String order)
	{
		MainChicken mainChicken = new ChainChicken();
		Making making = null;
		
		if(order.contains("1"))		
			making = mainChicken.create(ChickenType.Fried);

		else if(order.contains("2"))
			making = mainChicken.create(ChickenType.SoySauce);			

		else if(order.contains("3"))
			making = mainChicken.create(ChickenType.Garlic);			
		
		System.out.println("맛있는 "+making.getName()+" 준비 하겠습니다.");		
		System.out.println(mainChicken.getChainName());
		
	}
}
