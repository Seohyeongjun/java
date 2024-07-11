package java_0711_1;

import java.util.Scanner;

class ErrorException extends Exception
{
	public ErrorException(String msg)
	{
		super(msg);
	}
	
}
public class ExceptionQuestion {

	static Scanner scan = new Scanner(System.in);
	
	static void Error(int age, String info) throws ErrorException
	{
		if(age<20)
			throw new ErrorException("20살이하 오류");
		if(info.length()<10)
			throw new ErrorException("자기소개 10자이하 오류");
	}
	public static void main(String[] args) {
	
		String name=null;
		int age=0;
		String userInfo=null;

		try
		{
			System.out.print("이름 : ");
			name = scan.nextLine();
			// isEmpty() - 문자열의 길이가 0인경우 true
			// isBlank() - 문자열이 비어있거나 빈 공백인 경우 true "", " "
			if(name.isBlank())
				throw new ErrorException("이름을 입력하시오");
		}
		catch(ErrorException a)
		{
			System.out.println(a.getMessage());
		}
		
//		try
		{
			System.out.print("나이 : ");	
			age = scan.nextInt();	
			
			
		}
//		catch(ErrorException b)
		{
//			System.out.println(b.getMessage());
		}
		
		scan.nextLine();
		
		if(age>=20)
		{
			System.out.print("자기소개 : ");
			userInfo = scan.nextLine();
		}
		
		try
		{	
			Error(age, userInfo);
		}
		catch(Exception a)
		{
			System.out.println(a.getMessage());
		}
		
		System.out.println(age+"살 "+name+"님은 ");
		try
		{
			System.out.println(userInfo.substring(0,10));
		}
		catch(StringIndexOutOfBoundsException e1)
		{
			System.out.println("자기소개 10자 이상 작성");
		}
	}
}
