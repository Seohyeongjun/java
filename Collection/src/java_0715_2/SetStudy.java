package java_0715_2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SetStudy {

	public static void main(String[] args) {
//
////////////////////////////////////////////////
//		HashSet<String> hash = new HashSet<>();
//		
//		hash.add("¥���");
//		hash.add("«��");
//		hash.add("���뱹��");
//		hash.add("���Į����");
//		hash.add("��������");
//		hash.add("¥���");	// ¥����� �̹� �����Ƿ� ����Ⱑ �ȴ�. �����߻� ����.
//		
//		System.out.println(hash);
//
//		hash.remove("«��");
//		System.out.println(hash);
//		
//		for(String str:hash)
//		{
//			System.out.println(str);
//		}
//		
//		ArrayList<String> list = new ArrayList<>(hash);
//		System.out.println(list);
//		System.out.println(list.get(3));
//////////////////////////////////////////////////
		
//		HashSet<String> ���� = new HashSet<>();
//		HashSet<String> ��� = new HashSet<>();
//		
//		����.add("¥���"); ����.add("������");
//		����.add("������"); ����.add("�޲ٹ̺���");
//		
//		���.add("��ġ������"); ���.add("������");
//		���.add("¥���"); ���.add("������");
//		
//		// ������ - �ΰ� �̻��� �׷쿡 �������� ���� ����
//		HashSet<String> ���� = new HashSet<>();
//				
//		// 1ȸ��, ����ÿ��� �������� �缱��.
//		Iterator<String> it = ����.iterator();	// ���������� �ջ����. it�� ���������� �ٲ��
//		while(it.hasNext())
//		{
//			String food = it.next();
//			if(���.contains(food))
//			{
////				System.out.println(food);
//				����.add(food);
//			}
//		}
//		System.out.println("����, ����� ������ : "+����);
//		
//		// ������
//		HashSet<String> ����� = new HashSet<>();
////		Iterator<String> its = ����.iterator();
//		it=����.iterator();
//		while(it.hasNext())
//		{
//			String food = it.next();
//			if(!���.contains(food))
//			{
//				�����.add(food);
//			}
//		}
//		System.out.println("��ο� ���� ������ ������ : "+�����);
//		
//		// ������, A���հ� B������ ��(�ߺ�����)
//		HashSet<String> ������ = new HashSet<>();
//		������ = (HashSet<String>)����.clone();
//		������.addAll(���);
//		System.out.println(������);
		
		// �ߺ���� �ȵ�
		// ������ - addAll
		// ������ - retainAll ����.retainAll(���)
		// ������ - removeAll ����.removeAll(���)
		
//		HashSet<Integer> num1 = new HashSet<>();
//		
//		while(num1.size()<=10)
//		{
//			num1.add(Integer.valueOf((int)(Math.random()*50)));			
//		}
//		System.out.println(num1);
//		
		/////////////////////////////////////
		// num1, num2, num3 ������ ������ �����
		// ���� 1~50������ ������ 15�� ����
		// num1�� num3�� ������
		// num1�� num2�� ������
		// num2�� num3�� ������
		// num1, num2, num3�� ������
		
		HashSet<Integer> num1 = new HashSet<>();
		HashSet<Integer> num2 = new HashSet<>();
		HashSet<Integer> num3 = new HashSet<>();
		
		while(num1.size()<15)
			num1.add(Integer.valueOf((int)(Math.random()*50)+1));

		while(num2.size()<15)
			num2.add(Integer.valueOf((int)(Math.random()*50)+1));
		while(num3.size()<15)
			num3.add(Integer.valueOf((int)(Math.random()*50)+1));

		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
		System.out.println("\n-- num1�� num3�� ������ --");
		HashSet<Integer> ������ = new HashSet<>();
//		Iterator<Integer> num = num1.iterator();
		
		������ = (HashSet)num1.clone();
		������.retainAll(num3);
//		while(num.hasNext())
//		{
//			int a = num.next();
//			if(num3.contains(a))
//				������.add(a);
//		}
		System.out.println(������);
		
		System.out.println("\n-- num1�� num2�� ������ --");
		HashSet<Integer> ������ = new HashSet<>();
//		num = num1.iterator();
		
		������ = (HashSet)num1.clone();
		������.removeAll(num2);
//		while(num.hasNext()) 
//		{
//			int b = num.next();
//			if(!num2.contains(b))
//				������.add(b);
//		}
		System.out.println(������);
		
		System.out.println("\n-- num2�� num3�� ������ --");
		HashSet<Integer> ������2 = new HashSet<>();
//		num = num2.iterator();
		
		������2=(HashSet)num2.clone();
		������2.retainAll(num3);
//		while(num.hasNext())
//		{
//			int c = num.next();
//			if(num3.contains(c))
//				������2.add(c);
//		}
		System.out.println(������2);
		
		System.out.println("\n-- num1, num2, num3�� ������ --");
		HashSet<Integer> ������2 = new HashSet<>();
//		num = num1.iterator();
		
		������2 = (HashSet<Integer>)num3.clone();
		������2.addAll(num2);
		������2.addAll(num1);
		System.out.println(������2);		
			
	}
}


/*
	Set �������̽�
	- HashSet, TreeSet
	- ������� ������� �ʴ´�.
	- �ߺ� ������� �ʴ´�.
	- �ε����� ����.
	- Set�� ����(�������� �׷�)�� �ٷ� �� ���
	- HashSet -> ������ ǥ��
	- TreeSet -> �˻��� Ưȭ
	- 

*/