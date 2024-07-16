package Control;

import java.util.TreeMap;

import Service.Kiosk;
import Service.SelectDrink;

public class MainControl {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> tree = new TreeMap<>();
		
		//	put(key, value);	key�� �ߺ� �ȵ�.
		tree.put(20, "�ڵ�");
		tree.put(54, "���");
		tree.put(9, "����");
		tree.put(33, "����");
		tree.put(5, "�丶��");
		
		System.out.println(tree); // key���� �������� ����(1->10)
		System.out.println(tree.headMap(21));//headMap : �Է��� ������ ���� �� ���
		System.out.println(tree.tailMap(21));//tailMap : �Է��� ������ ū �� ���
		System.out.println(tree.floorKey(33));//floorkey : �Է��� ���� ���ų�, ���� ���� ������ ���� �� �߿��� ���� ū ��(key)
		System.out.println(tree.floorEntry(32));//floorEntry : floorkey�� ������ value���� ���
		System.out.println(tree.subMap(10, 40));//subMap : �Է��� �� ����(10<=key<40)
		System.out.println(tree.lowerKey(33));//lowerKey : �Է��� ������ ���� �� �� ���� ū ��(�Է��� �� ������)
		System.out.println(tree.higherKey(33));//higherKey : �Է��� ������ ū �� �� ���� ���� ��(�Է��� �� ������)
		
		
		
		
//		System.out.println("--- DW ī�� �ֹ� Ű����Ʈ ---\n");
//		System.out.println("--- ȭ���� ��ġ���� ������ ---\n");
//		Kiosk kiosk =  new SelectDrink();
//		
//		kiosk.action();
//		
	}
}
