package java_0704;

import java.util.Scanner;
public class Method6 {

	public static void main(String[] args) {
		
		// 컴퓨터와 가위바위보
		// 컴퓨터의 가위바위보 값은 comInput메서드를 사용
		// 유저의 가위바위보는 한글로 입력
		// 승, 무, 패에 대해 출력
		// 메서드 - 유저 가위바위보 입력 하고 저장하는 메서드
		// 		- 컴퓨터와 비교하여 결과 출력하는 메서드
		// Game 클래스에 필요한 변수나 메서드 작성
		// main메서드에서는 Game 클래스 객체로 메서드들만 실행
		boolean userOk = true;

		Game game = new Game(5, 10);
		
		game.comInput();
		userOk = game.userInput();
		if(userOk)
			game.result();
//		game.Game(5,10);
	}

}
class Game
{
	String com;
	String user;
	Scanner input=new Scanner(System.in);


	Game(int a)
	{
		this(a, 0);
	}
	Game(int a, int b)
	{
		System.out.println(a+" "+b);
	}
	void comInput(int num)
	{
		
	}
	void comInput(int num, char a)
	{
		
	}
	void comInput()
	{
		int temp = (int)(Math.random()*3);
		
		switch(temp)
		{
			case 0 : this.com="가위"; 				
					break;
			case 1 : this.com="바위"; 				
					break;
			case 2 : this.com="보";					
					break;
		}
	}
	
	boolean userInput()
	{
		System.out.print("가위, 바위, 보 선택 : ");
		this.user=input.nextLine();
		
		if(!user.equals("가위") && !user.equals("바위") && !user.equals("보"))
		{	
			System.out.printf("가위 바위 보 입력 실패!!");
			return false;
		}
		return true;
	}
	
	void result()
	{
//		System.out.println("com : "+com);
//		System.out.println("user : "+user);
		
		if(com.equals(user))
			System.out.printf("com : %s, user : %s -> 비김", com, user);
		
		else if(com.equals("가위"))
		{
			if(user.equals("바위"))
				System.out.printf("com : %s, user : %s -> user 승", com, user);
			else if(user.equals("보"))
				System.out.printf("com : %s, user : %s -> com 승", com, user);
		}
		else if(com.equals("바위"))
		{
			if(user.equals("가위"))
				System.out.printf("com : %s, user : %s -> com 승", com, user);
			else if(user.equals("보"))
				System.out.printf("com : %s, user : %s -> user 승", com, user);
		}
		else if(com.equals("보"))
		{
			if(user.equals("가위"))
				System.out.printf("com : %s, user : %s -> user 승", com, user);
			else if(user.equals("바위"))
				System.out.printf("com : %s, user : %s -> com 승", com, user);
		}
	
	}
	
	
}