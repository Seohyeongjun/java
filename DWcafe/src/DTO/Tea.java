package DTO;

public class Tea {

	int price;
	String name;
	
	public Tea(String name, int price)
	{
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString()
	{
		return name+"("+price+"¿ø)";
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
