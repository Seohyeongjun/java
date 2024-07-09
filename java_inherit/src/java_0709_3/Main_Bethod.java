package java_0709_3;

public class Main_Bethod {
	public static void main(String[] args)
	{
		move d = new dog();
		move c = new cat();
		
		d.moving();
		c.moving();
	}
}

class dog implements move
{
	@Override
	public void moving()
	{
		System.out.println("성큼성큼 이동한다.");
	}
}
class cat implements move
{
	@Override
	public void moving()
	{
		System.out.println("사뿐 사뿐 이동한다.");
	}
}

interface move
{
	static int a=10;	// static변수 선언 가능
	public void moving(); // static메서드 선언 가능
}

/*
	인터페이스 - 추상클래스의 한 종류
	- 추상메서드만 가능
	- 인스턴스변수 불가
	- static변수, static메서드 선언 가능
	- 객체 생성불가
	- 클래스들에 연결되어 사용
	- 다형성 구현을 위해 사용
	- 프로그램의 기본틀을 구축할 수 있다.
	
	서버에서 클라이언트에게 페이지를 제공한다.
	- 클라이언트의 요청을 받아 주는 메서드
	- 클라이언트가 원하는 페이지를 제공하는 메서드
	
	

 */