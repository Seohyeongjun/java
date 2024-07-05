package homeProduct;

public class Computer extends House{

	Computer(){}
	Computer(String brand, int price)
	{
		super(brand, price);
	}
	void power()
	{
		super.onOff=!super.onOff;
		System.out.println("Computer Àü¿ø : "+super.onOff);
	}
}
