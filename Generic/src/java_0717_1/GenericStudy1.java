package java_0717_1;

import java.util.ArrayList;

public class GenericStudy1 {

	public static void main(String[] args) {
	
		FruitBox <Apple> appleBox = new FruitBox<>();
		appleBox.setFruit(new Apple());
		
		FruitBox <Banana> bananaBox = new FruitBox<>();
		bananaBox.setFruit(new Banana());
		
		// 제네릭을 사용해서 형변환이 필요없다.
		Apple apple = appleBox.getFruit();
		
		FruitBox <Fruit> fruitBox = new FruitBox<>();
		fruitBox.setFruit(new Apple());
		
		Juice j = new Juice();
		j.makeJuice(appleBox);
		j.makeJuice(bananaBox);
		
		
		
//		FruitBox <Toy> toyBox = new FruitBox<>();
//		toyBox.setFruit(new Toy());
		
		
		
		
		
//		A<String> a = new A<>();
//		// A<String> -> A클래스의 제네릭타입 T에 String으로 지정
//		// item 변수는 String item으로 사용딘다.
//		a.item="이순신";
//		
//		A<Integer> b = new A<>();
//		b.item=233;
	}
	
}
//
//class A<T>
//{
//	T item;
//	T [] arr;
//	ArrayList<T> list = new ArrayList<>();
//	
//	void setItem(T item)
//	{
//		this.item=item;
//	}
//	
//}
//
//class B<T>
//{
//	T item1;
////	String item2;
////	float item3;
////	char item4;
//	
//	void setItem(T a)
//	{
//		this.item1=a;
//	}
//}
/*
	Generic
	
	- 클래스 내부의 타입을 지정하는 방법
	
	제네릭 타입 표현
	T - type
	E - element
	K - key
	V - value
	N - number
	
	
	- 클래스에 제네릭 표현방법
		class A<T>
	
	- 제네릭 타입은 클래스 타입만 지정할 수 있다.
		A<Tea> a = new A<Tea>();
		
	- 제한 없이 클래스라면 모두 가능하다.
	
	- 제네릭타입으로 사용 가능한 클래스 제한을 두는 방법
		class A<T extends Parents>
		-> Parent 클래스의 자식 클래스와 Parent클래스만
			제네릭으로 타입 지정이 가능하다
			이외 다른 클래스들은 불가
		-> 다중 타입으로 제한을 설정 할 수 있다.
			인터페이스만 다중 타입 설정 가능, 클래스는 안됨
		
	- 제네릭 와일드 카드 <?>
	- 제네릭 타입의 한계를 보완하기 이해 사용하는 방버
	- 메서드의 매개변수타입으로 제네릭 타입 표현되는 클래스를 사용한다면
	 클래스에 표현된 제네릭이 제대로 표현되지 않기 때문에 다시 한번
	 제네릭 지정해야 한다.
	  이때 사용되는 예외 없이 허용한다고 해서 ?로 사용
	  
	- 와일드 카드의 제한
	<? extends T> : T클래스와 그 자식까지 가능
	<? super T> : T클래스와 그 조상까지 가능(자식 안됨)
		
	
	
	
	
	
	
	
	
	
	
 */