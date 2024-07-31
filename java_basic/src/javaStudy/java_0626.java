package javaStudy;

import java.util.Scanner;

public class java_0626 {

	public static void main(String[] args) {
		/* 
		 * 코드 작성 전 해야 할 일 : 문제파악, 요구사항도출
		 * 문자열 - " " 큰다옴표로 표현하여 작성한다.
		 * 문자열은 String 클래스타입을 사용해야 한다.
		 * 
		 * 
		 * 문제
		 * 직원이름, 소속부서명, 월 급여액을 키보드를 통해 입력받는다.
		 * 세금은 8%를 낸다. 실수령액은 얼마인지 출력한다.
		 * 이름, 부서, 실수령액을 출력한다.
		 * 두 명의 직원에 대해 출력한다.
		*/
		
		Scanner scan=new Scanner(System.in);
		
		String name1;
		String name2;
		String teamName1;
		String teamName2;
		
		int monthSalary1;
		int monthSalary2;
		
		float tex=0.08f;
		int realSalary1;
		int realSalary2;
		
		System.out.println("< 직원 1 >");
		System.out.print("이름 : ");
		name1=scan.nextLine();
		System.out.print("소속부서명 : ");
		teamName1=scan.nextLine();
		System.out.print("월 급여액 : ");
		monthSalary1=scan.nextInt();
		
		scan.nextLine();			// 버퍼 초기화, 입력부분의 버퍼를 초기화 한다. 숫자입력 다음에 문자입력을 받는 경우 특히 더 초기화를 해야 함
		System.out.println("\n< 직원 2 >");
		System.out.print("이름 : ");
		name2=scan.nextLine();
		System.out.print("소속부서명 : ");
		teamName2=scan.nextLine();
		System.out.print("월 급여액 : ");
		monthSalary2=scan.nextInt();
		
		realSalary1=(int)(monthSalary1-(monthSalary1*tex));
		realSalary2=(int)(monthSalary2-(monthSalary2*tex));
		
		System.out.println("\n*****************  직원 1  ********************");
		System.out.printf("이름 : %s, 소속부서명 : %s, 월 급여액 : %d원 \n", name1, teamName1, monthSalary1);
		System.out.printf("실수령액 : %d원\n", realSalary1);
		
		System.out.println("\n*****************  직원 2  ********************");
		System.out.printf("이름 : %s, 소속부서명 : %s, 월 급여액 : %d원 \n", name2, teamName2, monthSalary2);
		System.out.printf("실수령액 : %d원\n", realSalary2);
	
		/*
		 * next() - 스페이스키, 탭키, 엔터키를 누르면 입력 끝
		 * next() - 엔터키 누르면 입력 끝
		 */
	
		
	}

}
