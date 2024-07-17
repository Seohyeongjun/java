package java_0717_3;

public class Electronics extends Product {

	private String brand;
//	private String id;
//	private int price;
//	private String name;
	
	Electronics(String id, String name, int price, String brand)
	{
		super(id, name, price);
		
		this.brand=brand;
//		this.id=id;
//		this.name=name;
//		this.price=price;
	}
	
	@Override
	public String toString()
	{
		return brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
}
