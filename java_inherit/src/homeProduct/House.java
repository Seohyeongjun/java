package homeProduct;

public class House {

	boolean onOff;
	String brand;	// 제품 브랜드
	int price;		// 제품 가격
	
	House()
	{
		this.onOff=false;	
	}
	
	House(String brand, int price)
	{
		this.brand=brand;
		this.price=price;
	}
	
	void power()
	{
		this.onOff=!this.onOff;
		System.out.println("전원 : "+this.onOff);
	}	
}
