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
		System.out.println("결제 진행합니다.");
		int price = orderCoffe!=null ? orderCoffe.getPrice() : orderTea.getPrice();
		System.out.println("결제 금액 : "+price+"원");
	}
	
	
	
	
}
