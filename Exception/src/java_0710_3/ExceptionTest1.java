package java_0710_3;

public class ExceptionTest1 {
	
	public static void main(String[] args) {
		
		
		
		try		// 오류가 발생할 것 같은 부분은 try안에 넣는다.
		{
			String name=null;
			String a="aaa";
			String b="bbb";
			String c="ccc";
			
			name.length();			
			a.length();
			b.length();
			c.length();
			
			System.out.println(10/0);			
			
		}
		
		// catch는 else if와 같이 조건을 줄 수 있다.
		catch(NullPointerException b)
		{
			b.printStackTrace();	// 오류메시지 확인 - 테스트용
			System.out.println(b.getMessage());
			System.out.println(b.getClass());
			
			System.out.println("문자열을 입력 하시오");
		}
	
		catch(Exception a)	// 10/0의 예외처리(오류)는  ArithmeticException이지만 최상위 예외처리인 Exception으로 해도 된다. a는 참조변수
		{
			System.out.println("0으로 나누기 하면 안돼");
		}
		
	
		System.out.println("여기가 프로그램 끝");
		
		
	}
}

/*
 * 예외처리
 * - 프로그램 실행 중에 에러가 발생하면 즉시 프로그램 종료
 * 		예외처리를 해주면 에러가 밸생하도 프로그랢은 종료되지 않는다.
 * 
 * - 사용자가 잘못된 값을 입력하는 경우에 알려줄 수 있다.
 * 
 * - 에러나 오류를 해결하는 방법이 아니고, 회피하는 방법이다. 
 *  
 */
