package java_0628;

import java.util.Scanner;
import java.util.Arrays;

public class Array2 {

	static Scanner input=new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		// 과자 배열에 좋아하는 과자의 판매가격을 키보드로 입력하여 저장
		// 과자 배열에 저장된 판매가격들의 총합과 평균을 구하시오.
		
//		int[] cookies=new int[5];
//		int cookiesPrice=0;
//		int cookiesPriceSum=0;
//		int cookiesPriceAvr=0;
//		String[] cookiesName=new String[cookies.length];
//		
//		for(int i=0; i<cookies.length; i++)
//		{
//			System.out.print((i+1)+"번 쿠키 이름 : ");
//			cookiesName[i]=input.nextLine();
//			
//			System.out.print("   쿠키 가격 : ");
//			cookiesPrice=input.nextInt();
//			cookies[i]=cookiesPrice;	
//			
//			cookiesPriceSum+=cookies[i];
//			input.nextLine();
//		}
//		
//		cookiesPriceAvr=cookiesPriceSum/cookies.length;
//		
//		for(int i=0; i<cookies.length; i++)
//		{
//			System.out.printf("%d번 쿠키 : %s, 가격 : %d\n",i+1, cookiesName[i], cookies[i]);
//		}
//		System.out.printf("\n쿠키 %d개의 총 합 : %d원\n", cookies.length, cookiesPriceSum);
//		System.out.printf("쿠키 %d개의 평 균 : %d원", cookies.length, cookiesPriceAvr);
		
////////////////////////////////////////////////////////////////////////////////////////
//		// 6명의 키를 tall배열에 저장
//		// 키 175 미만을 출력
//		float[] tall = new float[] {173.4f, 175.1f, 169.5f, 181.4f, 185.3f};
//		
//		System.out.println(Arrays.toString(tall));
//		System.out.println("\n175 미만 : ");
//		
//		for(int i=0; i<tall.length; i++)
//		{
//			if(tall[i]<175)
//				System.out.print("- "+(i+1)+"번 : "+tall[i]+"\n");
//		}
////////////////////////////////////////////////////////////////////////////////////////		
//		// name 배열의 문자열 중에서 이성계, 문익점, 정도전, 최영을 선발대 배열에 저장하고 출력
//		
//		String[] name=new String[] {"이순신", "김유신", "이성계", "문익점", "정도전", "최영", "양만춘"};
//		String[] 선발대=new String[4];
//		
//		System.arraycopy(name, 2, 선발대, 0, 4);
////		for(int i=0, j=0; i<name.length; i++)
////		{
////			if(name[i]=="이성계")
////				선발대[j++]=name[i];
////			else if(name[i]=="문익점")
////				선발대[j++]=name[i];
////			else if(name[i]=="정도전")
////				선발대[j++]=name[i];
////			else if(name[i]=="양만춘")
////				선발대[j]=name[i];
////		}
//		System.out.print(Arrays.toString(선발대));
////////////////////////////////////////////////////////////////////////////////////////
//		
//		String word="i like banana";
//		// indexOf 문자열의 위치 찾기
//		int num=word.indexOf("like");
//		System.out.println(num);  // 2출력
//		
////		for(int i=num; ; i++)
////		{	
////			System.out.println(word);
////		}	
//		System.out.println(word.contains("ba"));	// 특정 문자가 있다면 true, 없으면 false
//
//		String a[]=new String[] {"banana", "orange"};
//		System.out.println(a[0]);
//		System.out.println(a[0].indexOf("na"));
//		System.out.println(a[1].contains("ro"));
//		
//////////////////////////////////////////////////////////////////////////////////		
//		
//		String[] name=new String[] {"김유신", "한석봉", "양만춘", "김춘추", "정도전", "정약용", "이순신", "이사부", "이사람", "한가인"};
//		System.out.print("이름검색 : ");
//		String search=input.nextLine();
//		
//		for(int i=0; i<name.length; i++)
//		{
//			if(name[i].contains(search))
//				System.out.println("결과 : "+name[i]);
//		}
//		
//////////////////////////////////////////////////////////////////////////////////
		// 음료 검색하여 음료이름과 금액이 출력되게 할 것
		// 카페 배열에 없는 음료 검색시 "죄송합니다. 준비중입니다." 라고 출력
		
		String[] cafe=new String[] {"아메리카노 : 2000원", "화이트 아메리카노 : 2500원", "카페라떼 : 3000원", 
				"돌체라떼 : 3800원", "카페모카 : 4000원", "수박주스 : 4000원", "써머아이스티 : 2900원", 
				"복숭아아이스티 : 2800원", "자두아이스티 : 2800원", "유자에이드 : 3500원", "레콘에이드 : 3500원" ,"청포도에이드 : 3500원"}; 
		
		System.out.print("음료 검색 : ");
		String search=input.nextLine();
		char flag='f';
		
		for(int i=0; i<cafe.length; i++)
		{
			if(cafe[i].contains(search))
			{
				System.out.println(cafe[i]);
				flag='t';
			}
		}

		if(flag=='f')
			System.out.println("죄송합니다. 준비중입니다.");

			
		
		
		
		
		
		
		
	}
}
