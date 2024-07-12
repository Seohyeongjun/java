package java_0711;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionStudy1 {

	public static void main(String[] args) {
		
		int [] a = new int[5];
		///////////////////////////////////
		//
		// Ŭ������ 		- �⺻��
		//		
		// Byte 	 ---- byte
		// Short 	 ---- short
		// Integer 	 ---- int
		// Long 	 ---- long
		// Float 	 ---- float
		// Double 	 ---- double
		// Character ---- char
		// Boolean 	 ---- boolean
		/////////////////////////////////////
		
		// < > Ÿ������(Ŭ������)
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Double> list2 = new ArrayList<Double>();
//		ArrayList<String> list3 = new ArrayList<String>();
		
		list1.add(89);
		list1.add(230);
		list1.add(23);		
		list1.add(2120);
		list1.add(233);

		list2.add(23.423);
//		list3.add("�̼���");
		
		System.out.println(list1);	// ArrayList()�ȿ� toString()�� �����Ǿ� ����
		System.out.println(list2);
//		System.out.println(list3);
		System.out.println(list1.get(2));
		System.out.println();
		
		for(int i=0; i<list1.size(); i++)	// length()�� �ƴ� size()
		{
			System.out.print(list1.get(i)+"  ");
		}
		System.out.println();
		System.out.println(list1.indexOf(1235));	// ��ġ�ϴ� ���� ���ٸ� -1
		
		System.out.println();
		System.out.println(list1.contains(230));	// true or false
		
		list1.remove(2);				// ����
		System.out.println(list1);
		
		System.out.println();
		System.out.println(list1.isEmpty());	// list1�� �����Ͱ� ������� Ȯ��, empty(true), not empty(false)
		
		System.out.println();
		list1.add(4, 230);				// �߰�
		System.out.println(list1);
		
		System.out.println();			// ã��
		System.out.println(list1.lastIndexOf(230));
		
		list1.forEach(n->System.out.println(n));
		for(Integer n :list1)		// forEach�� ����
			System.out.println(n);
		
		System.out.println();
		list1.set(0, 100);	// �ε����� ����
		System.out.println(list1);
		
		Integer[] number = list1.toArray(new Integer[list1.size()]);
		Integer[] aa = new Integer[3];
		aa[0] = 10;
		aa[1] = 20;
		aa[2] = 30;
		
		ArrayList<Integer> alist = new ArrayList<Integer>(Arrays.asList(aa));
		
		Collections.sort(list1);
		System.out.println(list1);

		list1.remove(Integer.valueOf(233));
		System.out.println(list1);
	
		///////////////////////////////////////////////////////
		// ������, �念��, �̼���, ������, ������, ����ȣ
		// �� �̸��� ArrayList�� �����ϰ� ����Ͻÿ�
		System.out.println();
		ArrayList<String> list3 = new ArrayList<String>();
		
		list3.add("������");
		list3.add("�念��");
		list3.add("�̼���");
		list3.add("������");
		list3.add("������");
		list3.add("����ȣ");
		System.out.println(list3);
		
		ArrayList<String> name = new ArrayList<>(Arrays.asList(new String[] {"������","������","�念��","����ȣ","�̼���","������"}));
		System.out.println(name);
		for(String names : name)
			System.out.println(names);
	
		name.forEach(names -> System.out.println(names));
		
		// �̸��� ����Ǿ��ִ� ArrayList�� �̼����� ������ �߰������ϰ�
		// ������ ���� ���ϱ�
//		int fnd=name.indexOf("�̼���");
		if(name.indexOf("�̼���")==-1)
			name.add("�̼���");
		
		if(!name.contains("�̼���"))
			name.add("�̼���");
		
		System.out.println(name);
		
		
	}
}


/*
	�ڹ� �ݷ��� �����ӿ�ũ
	
	�����͸� ����, �����ϱ� ���� �ڷᱸ���� 
	�����͸� ����ó���ϴ� �˰����� �����Ǿ� �ִ� Ŭ�������� ����ü
	
	Collection, Map �������̽�
	
	�� Collection �������̽�
	��	�� List �������̽�
	��	��	�� ArrayList Ŭ����
	��	��	�� Vector
	��	��	�� LinkedList
	��	��	�� Stack
	��	��	�� Queue
	��	�� Set �������̽�
	��		�� HashSet
	��		�� TreeSet
	��		�� LinekedHashset
	�� Map �������̽�
		�� HashMap
		�� TreeMap	
		�� LinkedHashMap

*/