package java_0711;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionStudy1 {

	public static void main(String[] args) {
		
		int [] a = new int[5];
		///////////////////////////////////
		//
		// 클래스형 		- 기본형
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
		
		// < > 타입지정(클래스형)
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Double> list2 = new ArrayList<Double>();
//		ArrayList<String> list3 = new ArrayList<String>();
		
		list1.add(89);
		list1.add(230);
		list1.add(23);		
		list1.add(2120);
		list1.add(233);

		list2.add(23.423);
//		list3.add("이순신");
		
		System.out.println(list1);	// ArrayList()안에 toString()이 구현되어 있음
		System.out.println(list2);
//		System.out.println(list3);
		System.out.println(list1.get(2));
		System.out.println();
		
		for(int i=0; i<list1.size(); i++)	// length()가 아닌 size()
		{
			System.out.print(list1.get(i)+"  ");
		}
		System.out.println();
		System.out.println(list1.indexOf(1235));	// 일치하는 값이 없다면 -1
		
		System.out.println();
		System.out.println(list1.contains(230));	// true or false
		
		list1.remove(2);				// 삭제
		System.out.println(list1);
		
		System.out.println();
		System.out.println(list1.isEmpty());	// list1에 데이터가 비었는지 확인, empty(true), not empty(false)
		
		System.out.println();
		list1.add(4, 230);				// 추가
		System.out.println(list1);
		
		System.out.println();			// 찾기
		System.out.println(list1.lastIndexOf(230));
		
		list1.forEach(n->System.out.println(n));
		for(Integer n :list1)		// forEach와 같음
			System.out.println(n);
		
		System.out.println();
		list1.set(0, 100);	// 인덱스값 변경
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
		// 김춘추, 장영실, 이성계, 정몽주, 정도전, 김정호
		// 위 이름을 ArrayList에 저장하고 출력하시오
		System.out.println();
		ArrayList<String> list3 = new ArrayList<String>();
		
		list3.add("김춘추");
		list3.add("장영실");
		list3.add("이성계");
		list3.add("정몽주");
		list3.add("정도전");
		list3.add("김정호");
		System.out.println(list3);
		
		ArrayList<String> name = new ArrayList<>(Arrays.asList(new String[] {"김춘추","정도전","장영실","김정호","이성계","정몽주"}));
		System.out.println(name);
		for(String names : name)
			System.out.println(names);
	
		name.forEach(names -> System.out.println(names));
		
		// 이름이 저장되어있는 ArrayList에 이순신이 없으면 추가저장하고
		// 있으면 저장 안하기
//		int fnd=name.indexOf("이순신");
		if(name.indexOf("이순신")==-1)
			name.add("이순신");
		
		if(!name.contains("이순신"))
			name.add("이순신");
		
		System.out.println(name);
		
		
	}
}


/*
	자바 콜렉션 프레임워크
	
	데이터를 저장, 관리하기 위한 자료구조와 
	데이터를 가공처리하는 알고리즘이 구현되어 있는 클래스들의 집합체
	
	Collection, Map 인터페이스
	
	┌ Collection 인터페이스
	│	├ List 인터페이스
	│	│	├ ArrayList 클래스
	│	│	├ Vector
	│	│	├ LinkedList
	│	│	├ Stack
	│	│	└ Queue
	│	└ Set 인터페이스
	│		├ HashSet
	│		├ TreeSet
	│		└ LinekedHashset
	└ Map 인터페이스
		├ HashMap
		├ TreeMap	
		└ LinkedHashMap

*/