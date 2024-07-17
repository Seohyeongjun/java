package java_0717_3;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	
	private List< CartItem<? extends Product> > list = new ArrayList<>();
	
	public <T extends Product> void addCart(T item, int num)
	{
		CartItem <T> buyItem = new CartItem<>(item, num);
		System.out.println(" ±¸¸Å -> "+buyItem);
	}
	
	public void showCartList()
	{
		for(CartItem<? extends Product> cart : list)
			System.out.println(cart);
	}
	
}
