package java_0717_3;

public class CartItem <T extends Product> {

	private int quantity;		// 수량
	T item;
	
	public CartItem(T item, int quantity)
	{
		this.item=item;
		this.quantity=quantity;
	}
	
	@Override
	public String toString()
	{
		return "상품 : "+item+", 수량 : "+quantity;
	}
	
	public int getQuantity()
	{
		return this.quantity;
	}
	
	public T getItem()
	{
		return this.item;
	}
	
}
