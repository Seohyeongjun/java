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
		
//		elec.add(new Electronics("E120001d", "�����", 1702000, "�Ｚ"));
//		elec.add(new Electronics("L17850D5", "��Ź��", 856200, "LG"));
//		elec.add(new Electronics("���"));
//		elec.add(new Electronics("�Ҵ�"));
//		elec.add(new Electronics("����ũ�μ���Ʈ"));
//		elec.add(new Electronics("����"));
		
//		clothing.add(new Clothing("C1250", "����", 30000, "L"));
//		clothing.add(new Clothing("D1550", "�ڱQ��", 150000, "L"));
//		clothing.add(new Clothing("90"));
//		clothing.add(new Clothing("95"));
//		clothing.add(new Clothing("100"));
//		clothing.add(new Clothing("105"));
//		clothing.add(new Clothing("110"));

		Electronics elec = new Electronics("E120001d", "�����", 1702000, "�Ｚ");
		Clothing clt = new Clothing("C1250", "����", 30000, "L");
		
		ShoppingCart shop = new ShoppingCart();
		
		shop.addCart(elec, 3);	// ��ǰ�� ����
		shop.addCart(clt, 2);
		
		shop.showCartList();
		
//		System.out.println(elec);
//		System.out.println(clt);
//		cartItem.addCart(elec.get(0), num);		
		
	}
}
