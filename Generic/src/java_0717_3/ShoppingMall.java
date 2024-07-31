package java_0717_3;

import java.util.ArrayList;

public class ShoppingMall {

	public static void main(String[] args) {
		
//		ArrayList<Electronics> elec = new ArrayList<>();
//		ArrayList<Clothing> clothing = new ArrayList<>();
//		
//		CartItem cartItem = new CartItem();
//		int num=0;
//		
		
//		elec.add(new Electronics("E120001d", "냉장고", 1702000, "삼성"));
//		elec.add(new Electronics("L17850D5", "세탁기", 856200, "LG"));
//		elec.add(new Electronics("대우"));
//		elec.add(new Electronics("소니"));
//		elec.add(new Electronics("마이크로소프트"));
//		elec.add(new Electronics("애플"));
		
//		clothing.add(new Clothing("C1250", "바지", 30000, "L"));
//		clothing.add(new Clothing("D1550", "자켘ㅅ", 150000, "L"));
//		clothing.add(new Clothing("90"));
//		clothing.add(new Clothing("95"));
//		clothing.add(new Clothing("100"));
//		clothing.add(new Clothing("105"));
//		clothing.add(new Clothing("110"));

		Electronics elec = new Electronics("E120001d", "냉장고", 1702000, "삼성");
		Clothing clt = new Clothing("C1250", "바지", 30000, "L");
		
		ShoppingCart shop = new ShoppingCart();
		
		shop.addCart(elec, 3);	// 상품과 수량
		shop.addCart(clt, 2);
		
		shop.showCartList();
		
//		System.out.println(elec);
//		System.out.println(clt);
//		cartItem.addCart(elec.get(0), num);		
		
	}
}
