package java_0717_2;

public class Rental<T extends Media> {

	private T item;
	private String renter;

	public Rental(T item, String renter)
	{
		this.item=item;
		this.renter=renter;
	}

	public T getItem()
	{
		return this.item;
	}

	public String getRenter()
	{
		return this.renter;
	}
	
	@Override
	public String toString()
	{		
		return "�뿩�� : "+renter+", "+item.toString();
	}
	
}
