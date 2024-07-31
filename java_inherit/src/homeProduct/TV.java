package homeProduct;

public class TV extends House{
	
	private int channel=10;
	private int vol=5;
	
	TV()
	{ super();}
	
	public TV(String brand, int price)
	{
		super(brand, price);	// super() 부모클래스(House)
	}
	
	void channelUp()
	{
		channel++;
	}

	void channelDown()
	{
		channel--;
	}
	
	void volUp()
	{
		vol++;
	}
	
	void volDown()
	{
		vol--;
	}
	
	@Override
	protected void power()
	{
		super.onOff=!super.onOff;
		System.out.println("TV 전원 : "+super.onOff);
	}
	
}
// 오버로딩 - 새로운 메서드를 정의
// 오버라이딩 -  기존의 메서드를 재정의 하는 것

// 오버라이딩 조건
// 부모클래스에 해당 메서드가 존재해야 한다.
// 오버라이딩 메서드는 반드시 반환타입. 메서드 이름, 매개변수 모두 똑같이 작성해야 한다.
// 메서드의 {}내용은 달라도 된다. 