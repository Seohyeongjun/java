package java_0711_1;

class PasswordException extends Exception
{
	public PasswordException(String msg)
	{
		super(msg);
	}
	
}

public class ExceptionTest5 {

	static void setPassword(String password) throws PasswordException
	{	// 오류 발생시 setPassword메서드 실행 중단 및 throw 실행
		if(password==null)
			throw new PasswordException("비밀번호를 입력하시오");
		if(password.length()<8)
			throw new PasswordException("8자 이상 입력하시오");
		if(password.matches("[a-zA-Z]+"))
			throw new PasswordException("비밀번호는 숫자나 특수문자 포함");
		// 위 if문 중에 하나라도 오류(throw)가 발생하지 앟으면 비밀번호 저장
	}
	public static void main(String[] args) {
		
		try
		{
			setPassword("asdfqwe12");
		}
		catch(PasswordException e)
		{
			System.out.println(e.getMessage());
		}
	}
}

// 사용자 정의 예외처리 클래스 만들기
