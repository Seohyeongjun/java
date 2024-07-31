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
			throw new ErrorException("20������ ����");
		if(info.length()<10)
			throw new ErrorException("�ڱ�Ұ� 10������ ����");
	}
	public static void main(String[] args) {
	
		String name=null;
		int age=0;
		String userInfo=null;

		try
		{
			System.out.print("�̸� : ");
			name = scan.nextLine();
			// isEmpty() - ���ڿ��� ���̰� 0�ΰ�� true
			// isBlank() - ���ڿ��� ����ְų� �� ������ ��� true "", " "
			if(name.isBlank())
				throw new ErrorException("�̸��� �Է��Ͻÿ�");
		}
		catch(ErrorException a)
		{
			System.out.println(a.getMessage());
		}
		
//		try
		{
			System.out.print("���� : ");	
			age = scan.nextInt();	
			
			
		}
//		catch(ErrorException b)
		{
//			System.out.println(b.getMessage());
		}
		
		scan.nextLine();
		
		if(age>=20)
		{
			System.out.print("�ڱ�Ұ� : ");
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
		
		System.out.println(age+"�� "+name+"���� ");
		try
		{
			System.out.println(userInfo.substring(0,10));
		}
		catch(StringIndexOutOfBoundsException e1)
		{
			System.out.println("�ڱ�Ұ� 10�� �̻� �ۼ�");
		}
	}
}
