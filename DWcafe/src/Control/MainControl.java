package Control;

import java.util.TreeMap;

import Service.Kiosk;
import Service.SelectDrink;

public class MainControl {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> tree = new TreeMap<>();
		
		//	put(key, value);	key는 중복 안됨.
		tree.put(20, "자두");
		tree.put(54, "사과");
		tree.put(9, "수박");
		tree.put(33, "참외");
		tree.put(5, "토마토");
		
		System.out.println(tree); // key값을 기준으로 정렬(1->10)
		System.out.println(tree.headMap(21));//headMap : 입력한 값보다 작은 값 출력
		System.out.println(tree.tailMap(21));//tailMap : 입력한 값보다 큰 값 출력
		System.out.println(tree.floorKey(33));//floorkey : 입력한 값과 같거나, 같은 수가 없으면 작은 수 중에서 가장 큰 수(key)
		System.out.println(tree.floorEntry(32));//floorEntry : floorkey와 같으나 value값도 출력
		System.out.println(tree.subMap(10, 40));//subMap : 입력한 값 사이(10<=key<40)
		System.out.println(tree.lowerKey(33));//lowerKey : 입력한 값보다 작은 수 중 가장 큰 값(입력한 값 미포함)
		System.out.println(tree.higherKey(33));//higherKey : 입력한 값보다 큰 수 중 가장 작은 값(입력한 값 미포함)
		
		
		
		
//		System.out.println("--- DW 카페 주문 키오스트 ---\n");
//		System.out.println("--- 화면을 터치하지 마세요 ---\n");
//		Kiosk kiosk =  new SelectDrink();
//		
//		kiosk.action();
//		
	}
}
