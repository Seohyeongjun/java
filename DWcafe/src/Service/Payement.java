package Service;

import DTO.Coffe;
import DTO.Tea;

public class Payement implements Kiosk {

	private Coffe orderCoffe;
	private Tea orderTea;
	
	public Payement(Object drink)
	{
		if(drink instanceof Coffe)
			this.orderCoffe=(Coffe)drink;
		
		if(drink instanceof Tea)
			this.orderTea=(Tea)drink;
	}
	
	public void action()
	{
		System.out.println("���� �����մϴ�.");
		int price = orderCoffe!=null ? orderCoffe.getPrice() : orderTea.getPrice();
		System.out.println("���� �ݾ� : "+price+"��");
	}
	
	
	
	
}
