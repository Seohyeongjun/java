package homeProduct;

public class Aircon extends House{
	
	static final String[] windText={"��", "��", "��"};
	
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
		System.out.println("���� �ٶ����� : "+windText[wind]);
		
		
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
		System.out.println("Aircon ���� : "+super.onOff);
	}
}
