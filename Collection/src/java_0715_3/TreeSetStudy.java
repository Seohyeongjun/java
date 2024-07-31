package java_0715_3;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetStudy {

	public static void main(String[] args) {
		
		TreeSet<Integer> tree = new TreeSet<>();
		tree.add(34); tree.add(45); tree.add(20);
		tree.add(9); tree.add(40); tree.add(15);
		tree.add(48); tree.add(2); tree.add(11);
		tree.add(39); tree.add(4);
		
		
		System.out.println(tree);
		System.out.println(tree.first());
		System.out.println(tree.last());
		
		// 입력값보다 큰 값 중에서 가장 가까운 값 검색
		System.out.println(tree.higher(25));
		System.out.println(tree.lower(44));
		
		// 입력값보다 작은 모든 값
		System.out.println(tree.headSet(35));
		System.out.println(tree.tailSet(30));
		
		System.out.println(tree.subSet(10, 39));
		System.out.println(tree);
		
		TreeSet<String> word = new TreeSet<>();
		word.add("이순신");	word.add("문익점");
		word.add("장보고");	word.add("김유신");
		word.add("정도전");	word.add("박팽년");
		word.add("성산문");	word.add("마골피");
		word.add("나훈아");
		
		System.out.println(word.higher("아"));
		System.out.println(word.headSet("라면"));
		System.out.println(word.subSet("나", "자"));
		
		System.out.println(word.subSet("ㄴ", "ㅈ"));	// 적용안됨
		
		System.out.println(word);
		
		/////////////////////////////////////////
		//
		// 90점 이상 - 상위10%, 
		// 70점 이상 - 상위 30%
		// 40점 이상 - 상위 80%
		//
		
		Scanner sc =  new Scanner(System.in);
		
		TreeSet<Integer> rank = new TreeSet<>();
		rank.add(90); rank.add(70); rank.add(40);
		
		// 나의 점수를 입력하여 상위 몇 프로인지 출력
		
		System.out.print("\n나의 점수 입력 : ");
		int num = sc.nextInt();
		
		System.out.println(rank.lower(num+1));	// +1 해줘야 함
		if(num>=rank.last())
			System.out.println("상위 10%");

		else if(rank.lower(num+1)>=70)		// +1 해줘야 함
			System.out.println("상위 30%");

		else if(num+1 >= rank.first())
			System.out.println("상위 80%");
		
		else
			System.out.println("순위 밖");

		/////////////////////////////////////
		
		TreeSet<String> score = new TreeSet<>();
		
		score.add("89점 이순신");	score.add("67점 김유신");
		score.add("45점 문익점");	score.add("98점 한석봉");
		score.add("72점 박문수");	score.add("81점 김춘추");
		score.add("59점 이성계");	score.add("32점 정약용");
		// 내 점수를 입력하고 나보다 점수가 높은 사람들 출력
		sc.nextLine();
		System.out.print("\n나의 점수 입력 : ");
		String num2 = sc.nextLine();
		
		System.out.println(score.tailSet(num2));
			
		
		
	}
}


/*
	Tree 구조를 이용하여 값을 저장시키는 TreeSet
	- 순차적으로 데이터 저장하지 않는다.
	- 중복허용하지 않음
	- 이진트리를 사용하기 때문에 데이터가 정렬되어 출력
	- 범위 검색 또는 데이터 중복방지 및 정렬에 용이하다.
	
 
 */
