package homeProduct;

public class Aircon extends House{
	
	static final String[] windText={"미", "약", "강"};
	
	int wind=0;
	int temperature;
	
	Aircon(){}
	Aircon(String brand, int price)
	{
		super(brand, price);
	}
	
	void windControl()
	{
		this.wind++;
		if(this.wind==windText.length)
			this.wind=0;
		System.out.println("현재 바람세기 : "+windText[wind]);
		
		
	}
	void tempUp()
	{
		this.temperature++;
	}
	
	void tempDown()
	{
		this.temperature--;
	}
	void power()
	{
		super.onOff=!super.onOff;
		System.out.println("Aircon 전원 : "+super.onOff);
	}
}
