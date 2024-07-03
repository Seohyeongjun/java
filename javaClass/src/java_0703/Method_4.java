package java_0703;

public class Method_4 {

	public static void main(String[] args) {
		
		// 메서드를 통해서 숫자10을 받아 출력
		ReturnMth returnMth=new ReturnMth();
		int num=returnMth.get();
		System.out.println(num);
		
		// 메서드로부터 두 정수의 더하기 결과 받아서 출력
		num=returnMth.add();
		System.out.println(num);
		
		// 다음의 물음표에 들어갈 코드를 작성하여 이름과 나이가 출력되게 할 것
		String userName = returnMth.getName();
		int age=34;
		System.out.println(userName +" "+age);
		System.out.println();
		// 국어(89), 영어(78), 수학(50) 세 과목의 총점을 구하는 메서드(1)
		// 세 과목의 평균을 구하는 메서드(2)
		// 총점과 평균을 출력하시오
		int total=returnMth.total();
		int avg=returnMth.avg(total);
		System.out.println("총점 : "+total+"\n평균 : "+avg);

		/*
		 주사위 게임
		 
		 j형준과 s석완이가 주사위 게임을 한다.
		 주사위는 하나, 육면이다.
		 주사위의 값이 큰 사람이 이긴다.(랜덤)
		 
		 주사위 값 구하는 메서드
		 
		 주사위 값 비교하여 누가 이겼는지 출력하는 메서드	 
		 
		 */
		

	}
}

class ReturnMth
{
	int avg(int total)
	{
		int avg = total/3;
		return avg;
	}
	int total()
	{
		int kor=89, eng=78, math=50;
		int total=kor+eng+math;
		System.out.println("국어 : "+kor+", 영어 : "+eng+", 수학 : "+math);
		return total;
	}
	String getName()
	{
		String name="이순신";
		return name;
	}
	int add()
	{
		int num1=30;
		int num2=40;
		
		return num1+num2;
	}
	int get()
	{	
		return 10;
	}
}
