package java_0710_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num=0;		
		boolean is = true;
		
		do{
			try 
			{				
				System.out.print("정수 입력 : ");
				num=scan.nextInt();	// 오류가 나면 바로 catch로 간다(is=true, 무한루프)
				is=false;			// 오류가 나지 않으면 is=false
				
			}
			
			catch(InputMismatchException a)
			{
//				a.printStackTrace();
//				System.out.println(a.getMessage());
//				System.out.println(a.getClass());
				System.out.println("정수만 입력하시오");
//				scan.nextLine();	// 정수 입력시 잘못된 입력(문자, 문자열)되어 초기화 필요
			}
			
			finally		// 오류 유무를 떠나 무조건 실행 
			{
				scan.nextLine();	// 숫자입력 후 문자입력(오타 등)을 위한 버퍼 초기화
			}
			
		} while(is);
		
		System.out.println(num+100);
		System.out.print("이름 : ");
		String name=scan.nextLine();	// scan.nextLine()을 하지 않으면 버퍼 초기화가 되지 않아 입력이 안됨
		System.out.println(name);
	}
}
