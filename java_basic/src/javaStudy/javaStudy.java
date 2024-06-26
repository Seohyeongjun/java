package javaStudy;

import java.util.Scanner;

// 외부 패키지의 클래스를 불러오기 위함( import java.util. )
// import java.util.Scanner;
public class javaStudy {	// input study
	public static void main(String[] args)
	{
//		System.out.println("자바출력");
		
		// System.in - 입력;
		// 입력받을 수 있는 내장 클래스 - Scanner
		Scanner scan=new Scanner(System.in);
		
//		int a=scan.nextInt();
//		float b=scan.nextFloat();
//		String c=scan.nextLine();	// scan.next();
//		
//		System.out.println(a);
//		System.out.println(b);		
//		System.out.println(c);
		
		// 대게라면과 삼각김밥, 바나나우유를 먹었다
		// 점심값으로 지불한 금액은?
		
//		int noodleNum=0;
//		int kimbabNum=0;
//		int milkNum=0;
//		
//		int noodlePrice=0;
//		int kimbabPrice=0;
//		int milkPrice=0;
//		
//		int noodleTotal;
//		int kimbabTotal;
//		int milkTotal;
//		int total;
//		
//		System.out.print("대게라면의 수량 : ");
//		noodleNum=scan.nextInt();
//		System.out.print("대게라면 값 : ");
//		noodlePrice=scan.nextInt();
//		noodleTotal=noodleNum*noodlePrice;
//		
//		System.out.print("\n삼각김밥의 수량 : ");
//		kimbabNum=scan.nextInt();
//		System.out.print("삼각김밥 값 : ");
//		kimbabPrice=scan.nextInt();
//		kimbabTotal=kimbabNum*kimbabPrice;
//		
//		System.out.print("\n바나나우유의 수량 : ");
//		milkNum=scan.nextInt();
//		System.out.print("바나나우유 값 : ");
//		milkPrice=scan.nextInt();
//		milkTotal=milkNum*milkPrice;
//		
//		total=noodleTotal+kimbabTotal+milkTotal;
//			
//		System.out.printf("\n 대게라면 수량 : %d개, 대게라면 값 : %d원 : 합계 : %d원", noodleNum, noodlePrice, noodleTotal);
//		System.out.printf("\n 삼각김밥 수량 : %d개, 삼각김밥 값 : %d원 : 합계 : %d원" , kimbabNum, kimbabPrice, kimbabTotal);
//		System.out.printf("\n바나나우유 수량 : %d개, 바나나우유 값 : %d원 : 합계 : %d원", milkNum, milkPrice, milkTotal);
//		System.out.print("\n\n총 합 : "+total+"원");
		///////////////////////////////////////////////////////////////
		
		// 민수가 지갑을 놓고와서 집에 갔다왔다
		// 이번엔 신발을 짝작으로 신어 집에 갔다왔다
		// 민수의 집은 5층이다. 민수가 1층 올라가는데 3.4초가 걸린다
		// 민수가 집에 들어갔다 나왔다 하는데 걸린 총 시간은 몇 초?
		
//		int upDowncount=2;
//		int home=5;
//		float upDownSec=3.4f;
//		float homeInOutSec;
//		float upDowntotalTime=upDowncount*home*upDownSec;
//		
//		System.out.printf("민수의 집은 %d층\n한 층 올라가고 내려오는데 걸리는 시간 : %.1f초\n집에 갔다 온 횟수 : %d회\n",home, upDownSec, upDowncount);
//		System.out.println("\n1회, 민수가 1층에서 집(5층)까지 갔다 내려오는 시간 : "+(home-1)*upDownSec*upDowncount+"초");
//		System.out.println("총 2회 민수가 집에 갔다 온 시간 : "+upDowntotalTime*2+"초");
//		
//		System.out.print("\n집에 1회 들어갔나 나온 시간 : ");
//		homeInOutSec=scan.nextFloat();
//		System.out.print("\n***********************************************");
//		System.out.println("\n총 걸린 시간 : "+(upDowntotalTime+homeInOutSec)*2+"초");
////////////////////////////////////////////////////////////////////////////////////////
		/*********************************************************************
		  데이터의 종류는 정수, 실수, 문자, boolean(참, 거짓)
		 	데이터 타입
		 	정수 - byte, short, int, long
		 	문자 - char
		 	실수 - float, double
		 	참거짓 - boolean
		 	
		  변수 선언방법 - 데이터타입 변수이름
		   int num; - 정수타입 변수 선언
		   double dnum; - 실수타입 변수 선언
		   char ch; 문자 타입 변수 선언
		   boolean bool; 참 거짓 변수 선언
		   
		   변수의 초기화
		   int num=10; 변수 선언과 함께 데이터 저장
		   
		   출력방법
		   System.out.println(출력내용); 자동 줄바꿈
		   System.out.print(출력내용); 
		   System.out.printf(출력내용); 
		   
		   printf 사용시 함께 사용하는 형식 지정자
		   	%d, %u - 정수
		   	%f - 실수
		   	%c - 문자
		   	%s - 문자열
		   	
		   	
		   age=89;	
		   System.out.printf("%s 마을의 나이가 %d살인 폭군 지도자 %c씨", "코딩빌", age, '박');
		   
		   입력방법
		   Scanner 클래스 객체 필요
		   Scanner 변수 = new Scanner(System.in);
		    Scanner클래스는 내장외부클래스이미로 import 해야 된다
		    변수.nextInt(); int타입 정수만 입력
		    변수.nextByte(); byte타입 정수만 입력
		    변수.nextShort(); sort타입 정수만 입력
		    변수.nextLong(); long타입 정수
		    변수.nextFloat(); Float타입 실수
		    변수.nextDouble(); Double타입 실수
		    변수.next(); 문자열 입력
		    변수.nextLine(); 문자열	 
		 ***************************************************************/
		
		// c언어, 자바, 건축학개론 시험 성적을 입력하세요
		// 세 과목의 총점과 평균을 각각 출력하세요
		
		float cLan;
		float javaLan;
		float built;
		float total;
		
		System.out.print("c언어 점수 : ");
		cLan=scan.nextFloat();
		System.out.print("자바 점수 : ");
		javaLan=scan.nextFloat();
		System.out.print("건축학개론 점수 : ");
		built=scan.nextFloat();
		
		total=cLan+javaLan+built;
		System.out.println("\n총 점 : "+total+"점");
		System.out.printf("평 균 : %.2f점",total/3);
		
		
		
		
		
	}
}
