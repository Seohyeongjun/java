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
		System.out.print("�ֹ� ��ȣ : ");
		order=scan.nextLine();	
		System.out.println("-----------------------------------");
		orderChicken(order);
	}

	static void SayHi() {
		System.out.println("�ȳ��ϼ���! DWġŲ ���� ��ȭ���Դϴ�.");
		System.out.println("ġŲ�� �ֹ��� �ּ���\n");
		System.out.println("1�� : �Ķ��̵�, 2�� : ������, 3�� : ���þ��");
			
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
		
		System.out.println("���ִ� "+making.getName()+" �غ� �ϰڽ��ϴ�.");		
		System.out.println(mainChicken.getChainName());
		
	}
}
