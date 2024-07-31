package java_0717_1;

import java.util.ArrayList;

public class GenericStudy1 {

	public static void main(String[] args) {
	
		FruitBox <Apple> appleBox = new FruitBox<>();
		appleBox.setFruit(new Apple());
		
		FruitBox <Banana> bananaBox = new FruitBox<>();
		bananaBox.setFruit(new Banana());
		
		// ���׸��� ����ؼ� ����ȯ�� �ʿ����.
		Apple apple = appleBox.getFruit();
		
		FruitBox <Fruit> fruitBox = new FruitBox<>();
		fruitBox.setFruit(new Apple());
		
		Juice j = new Juice();
		j.makeJuice(appleBox);
		j.makeJuice(bananaBox);
		
		
		
//		FruitBox <Toy> toyBox = new FruitBox<>();
//		toyBox.setFruit(new Toy());
		
		
		
		
		
//		A<String> a = new A<>();
//		// A<String> -> AŬ������ ���׸�Ÿ�� T�� String���� ����
//		// item ������ String item���� �����.
//		a.item="�̼���";
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
	
	- Ŭ���� ������ Ÿ���� �����ϴ� ���
	
	���׸� Ÿ�� ǥ��
	T - type
	E - element
	K - key
	V - value
	N - number
	
	
	- Ŭ������ ���׸� ǥ�����
		class A<T>
	
	- ���׸� Ÿ���� Ŭ���� Ÿ�Ը� ������ �� �ִ�.
		A<Tea> a = new A<Tea>();
		
	- ���� ���� Ŭ������� ��� �����ϴ�.
	
	- ���׸�Ÿ������ ��� ������ Ŭ���� ������ �δ� ���
		class A<T extends Parents>
		-> Parent Ŭ������ �ڽ� Ŭ������ ParentŬ������
			���׸����� Ÿ�� ������ �����ϴ�
			�̿� �ٸ� Ŭ�������� �Ұ�
		-> ���� Ÿ������ ������ ���� �� �� �ִ�.
			�������̽��� ���� Ÿ�� ���� ����, Ŭ������ �ȵ�
		
	- ���׸� ���ϵ� ī�� <?>
	- ���׸� Ÿ���� �Ѱ踦 �����ϱ� ���� ����ϴ� ���
	- �޼����� �Ű�����Ÿ������ ���׸� Ÿ�� ǥ���Ǵ� Ŭ������ ����Ѵٸ�
	 Ŭ������ ǥ���� ���׸��� ����� ǥ������ �ʱ� ������ �ٽ� �ѹ�
	 ���׸� �����ؾ� �Ѵ�.
	  �̶� ���Ǵ� ���� ���� ����Ѵٰ� �ؼ� ?�� ���
	  
	- ���ϵ� ī���� ����
	<? extends T> : TŬ������ �� �ڽı��� ����
	<? super T> : TŬ������ �� ������� ����(�ڽ� �ȵ�)
		
	
	
	
	
	
	
	
	
	
	
 */