package java_0704;

import java.util.Scanner;

public class Method5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//////////////////////////////////////////////////////
//		사각형의 너비와 높이를 설정하고 넓이를 출력하시오
//	 	넓이는 main메서드에서 출력되게 하시오
//		Area getQuadArea=new Area();
//		
//		int area=getQuadArea.getArea();
//		System.out.println("넓이 : "+area);
//		
		//////////////////////////////////////////////////////
//		로그인 가능한 아이디는 skyblue, 비밀번호는 1234sea
//		login 메서드를 실행하여 로그인 여부를 철력
//		아이디 비밀번호가 일치하면 로그인 성공 출력
//		하나라도 불일치면 로그인 실패 출력
//		로그인 여부 출력은 main에서
//		GetLogin getLogin = new GetLogin();
//		boolean isFail = getLogin.login();
//		if(isFail)
//			System.out.println("로그인 성공");
//		else
//			System.out.println("로그인 실패");	
		
		/////////////////////////////////////////////////////
		// 정수 세 개를 키보드를 통해 입력 받으시오
		// 입력한 세 정수의 합이 100을 넘으면
		// (100 - 합의 결과) 를 출력
		// 100을 넘지 않으면 세 정수의 합을 출력
		// main메서드에서 출력
		
		Calc calc = new Calc();
		int sum=calc.add();
		int result=100-sum;
		
		if(sum>100)
			System.out.println("결과 : "+result);
		else
			System.out.println("결과 : "+sum);		
	}
}

class Calc
{
	int num1, num2, num3, sum;
	
	int add()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("세 정수를 입력 하시오");
		
		System.out.print("1번 : ");
		this.num1=input.nextInt();
		
		System.out.print("2번 : ");
		this.num2=input.nextInt();
		
		System.out.print("3번 : ");
		this.num3=input.nextInt();
		
		this.sum=num1+num2+num3;
		
		return sum;		              		
	}
}

class GetLogin
{
	boolean login()
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String id = input.nextLine();
		
		System.out.print("패스워드 : ");
		String password = input.nextLine();
		
		if(id.equals("skyblue"))
		{
			if(password.equals("1234sea"))
				return true;
		}		
		return false;		
	}
}

class Area
{
	int width;
	int height;
	int area;
	
	int getArea()
	{
		Scanner input=new Scanner(System.in);
		
		System.out.println("사각형의 넓이 구하기");
		
		System.out.print("너비 : ");
		this.width=input.nextInt();
		
		System.out.print("높이 : ");
		this.height=input.nextInt();
		
		this.area=width*height;
		return area;
	}	
}