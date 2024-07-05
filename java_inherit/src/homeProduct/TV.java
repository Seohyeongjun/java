package homeProduct;

public class TV extends House{
	
	private int channel=10;
	private int vol=5;
	
	TV()
	{ super();}
	
	public TV(String brand, int price)
	{
		super(brand, price);	// super() �θ�Ŭ����(House)
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
		System.out.println("TV ���� : "+super.onOff);
	}
	
}
// �����ε� - ���ο� �޼��带 ����
// �������̵� -  ������ �޼��带 ������ �ϴ� ��

// �������̵� ����
// �θ�Ŭ������ �ش� �޼��尡 �����ؾ� �Ѵ�.
// �������̵� �޼���� �ݵ�� ��ȯŸ��. �޼��� �̸�, �Ű����� ��� �Ȱ��� �ۼ��ؾ� �Ѵ�.
// �޼����� {}������ �޶� �ȴ�. 