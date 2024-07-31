package java_0703;

import java.util.Scanner;
public class Method_3 {

	public static void main(String[] args) {
		// 정수 두 개 입력 받아 합을 출력
		Calc calc=new Calc();
//		calc.sum();
//		calc.sum(10,20);
		
		// 세 과목의 총점을 구하여 출력하시오
		int kor=89, eng=74, mat=43;
		calc.sum(kor, eng, mat);
		
		// 메서드 호출하여 '메서트 dog쉽네~' 라고 출력
		calc.easy();
		calc.view();
		
		// 멤서드를 호출하여 이름과 나이를 출력하세요
		// 매개변수 없는 메서드, 키보드 입력 x
		calc.name();
		
		// 메서드를 호출하여 아래의 데이터를 출력
		String animal="골드리트리버";
		String 공고일 = "2024-07-01";
		TestMethod testMethod = new TestMethod();
		testMethod.animal(animal, 공고일);
		
		// 다음 날짜중에서 월과 일만 출력하시오
		// 문자열 메서드 substring 또는 split 사용
		String examDate="2024-08-13";
		testMethod.dateSubstring(examDate);
		
		// 네 사람의 나이 평균 값을 구하여 출력
		// 평균값은 정수
		int 흥민=31, 강인=23, 희찬=28, 재범=37;
		testMethod.age(흥민, 강인, 희찬, 재범);
	}

}

class TestMethod
{
	void age(int name1, int name2, int name3, int name4)
	{
		int totalAge;
		int aveAge;
		
		totalAge=name1+name2+name3+name4;
		aveAge=(int)totalAge/4;
		
		System.out.println("나이 총합 : "+totalAge+"세");
		System.out.printf("평균나이 : %d세",aveAge);
	}
	void dateSubstring(String date)
	{
		System.out.println(date.substring(5));
		String dates[]=date.split("-");			// 무조건 배열에 들어간다.
		
//		System.out.println(dates[0]);
		System.out.print(dates[1]+"월 ");	// 월
		System.out.print(dates[2]+"일\n");	// 일
		
	}
	
	void animal(String name, String date)
	{
		System.out.println("이 름 : "+name+"\n공고일 : "+date);
	}
}
class Calc
{	
	void name()
	{
		String name="서형준";
		int age=41;
		System.out.println(name+" : "+age+"세");
	}
	void view()
	{
		int a=10, b=20;
		System.out.printf("a : %d, b : %d\n",a, b);
		
	}
	void easy()
	{
		System.out.println("메서드 dog쉽네~");
	}
	void sum(int kor, int eng, int mat)
	{
		int result=kor+eng+mat;
		System.out.println("국어점수 : "+kor+"점, 영어점수 : "+eng+"점, 수학점수 : "+mat+"점");
		System.out.println("총 점 : "+result+"점");
		System.out.printf("평 점 : %.2f점\n",(float)result/3);
	}
	void sum(int num1, int num2)
	{
		int result=num1+num2;
		System.out.println("합 : "+result+"\n");
	}
	void sum()
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 : ");
		int num1=scan.nextInt();
		
		System.out.print("두 번째 정수 : ");
		int num2=scan.nextInt();
		
		int result=num1+num2;
		System.out.println("합 : "+result+"\n");
	}
}