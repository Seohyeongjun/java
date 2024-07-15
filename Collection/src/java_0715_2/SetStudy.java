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
//		hash.add("짜장면");
//		hash.add("짬뽕");
//		hash.add("순대국밥");
//		hash.add("들깨칼국수");
//		hash.add("맑은곰탕");
//		hash.add("짜장면");	// 짜장면이 이미 있으므로 덮어쓰기가 된다. 오류발생 안함.
//		
//		System.out.println(hash);
//
//		hash.remove("짬뽕");
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
		
//		HashSet<String> 재학 = new HashSet<>();
//		HashSet<String> 상민 = new HashSet<>();
//		
//		재학.add("짜장면"); 재학.add("볶음밥");
//		재학.add("돈가스"); 재학.add("쭈꾸미볶음");
//		
//		상민.add("김치볶음밥"); 상민.add("떡볶이");
//		상민.add("짜장면"); 상민.add("돈가스");
//		
//		// 교집합 - 두개 이상의 그룹에 공통적인 값의 집합
//		HashSet<String> 공통 = new HashSet<>();
//				
//		// 1회용, 재사용시에는 참조변소 재선언.
//		Iterator<String> it = 재학.iterator();	// 원본데이터 손상안함. it의 참조변수가 바뀐다
//		while(it.hasNext())
//		{
//			String food = it.next();
//			if(상민.contains(food))
//			{
////				System.out.println(food);
//				공통.add(food);
//			}
//		}
//		System.out.println("재학, 상민의 교집합 : "+공통);
//		
//		// 차집합
//		HashSet<String> 비공통 = new HashSet<>();
////		Iterator<String> its = 재학.iterator();
//		it=재학.iterator();
//		while(it.hasNext())
//		{
//			String food = it.next();
//			if(!상민.contains(food))
//			{
//				비공통.add(food);
//			}
//		}
//		System.out.println("상민에 대한 재학의 차집합 : "+비공통);
//		
//		// 합집합, A집합과 B집합의 합(중복없이)
//		HashSet<String> 합집합 = new HashSet<>();
//		합집합 = (HashSet<String>)재학.clone();
//		합집합.addAll(상민);
//		System.out.println(합집합);
		
		// 중복허용 안됨
		// 합집합 - addAll
		// 교집합 - retainAll 재학.retainAll(상민)
		// 차집합 - removeAll 재학.removeAll(상민)
		
//		HashSet<Integer> num1 = new HashSet<>();
//		
//		while(num1.size()<=10)
//		{
//			num1.add(Integer.valueOf((int)(Math.random()*50)));			
//		}
//		System.out.println(num1);
//		
		/////////////////////////////////////
		// num1, num2, num3 세개의 집합을 만들고
		// 각각 1~50까지의 랜덤값 15개 저장
		// num1과 num3의 교집합
		// num1과 num2의 차집합
		// num2와 num3의 교집합
		// num1, num2, num3의 합집합
		
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
		
		System.out.println("\n-- num1과 num3의 교집합 --");
		HashSet<Integer> 교집합 = new HashSet<>();
//		Iterator<Integer> num = num1.iterator();
		
		교집합 = (HashSet)num1.clone();
		교집합.retainAll(num3);
//		while(num.hasNext())
//		{
//			int a = num.next();
//			if(num3.contains(a))
//				교집합.add(a);
//		}
		System.out.println(교집합);
		
		System.out.println("\n-- num1과 num2의 차집합 --");
		HashSet<Integer> 차집합 = new HashSet<>();
//		num = num1.iterator();
		
		차집합 = (HashSet)num1.clone();
		차집합.removeAll(num2);
//		while(num.hasNext()) 
//		{
//			int b = num.next();
//			if(!num2.contains(b))
//				차집합.add(b);
//		}
		System.out.println(차집합);
		
		System.out.println("\n-- num2와 num3의 교집합 --");
		HashSet<Integer> 교집합2 = new HashSet<>();
//		num = num2.iterator();
		
		교집합2=(HashSet)num2.clone();
		교집합2.retainAll(num3);
//		while(num.hasNext())
//		{
//			int c = num.next();
//			if(num3.contains(c))
//				교집합2.add(c);
//		}
		System.out.println(교집합2);
		
		System.out.println("\n-- num1, num2, num3의 합집합 --");
		HashSet<Integer> 합집합2 = new HashSet<>();
//		num = num1.iterator();
		
		합집합2 = (HashSet<Integer>)num3.clone();
		합집합2.addAll(num2);
		합집합2.addAll(num1);
		System.out.println(합집합2);		
			
	}
}


/*
	Set 인터페이스
	- HashSet, TreeSet
	- 순차대로 저장되지 않는다.
	- 중복 허용하지 않는다.
	- 인덱스가 없다.
	- Set은 집합(데이터의 그룹)을 다룰 때 사용
	- HashSet -> 집합을 표현
	- TreeSet -> 검색에 특화
	- 

*/