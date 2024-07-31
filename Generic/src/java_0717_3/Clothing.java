package java_0717_3;

public class Clothing extends Product{

	private String size;
//	private String id;
//	private int price;
//	private String name;
	
	Clothing(String id, String name, int price, String size)
	{
		super(id, name, price);
		this.size=size;
//		this.id=id;
//		this.price=price;
//		this.name=name;
	}

	@Override
	public String toString()
	{
		return size;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
	
	
}
