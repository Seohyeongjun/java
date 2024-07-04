package homeProduct;

public class TV extends House{
	
	int channel=10;
	int vol=5;
	
	TV()
	{ super();}
	
	TV(String brand, int price)
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
}
