package java_0704;

import java.util.Scanner;
public class Method6 {

	public static void main(String[] args) {
		
		// ��ǻ�Ϳ� ����������
		// ��ǻ���� ���������� ���� comInput�޼��带 ���
		// ������ ������������ �ѱ۷� �Է�
		// ��, ��, �п� ���� ���
		// �޼��� - ���� ���������� �Է� �ϰ� �����ϴ� �޼���
		// 		- ��ǻ�Ϳ� ���Ͽ� ��� ����ϴ� �޼���
		// Game Ŭ������ �ʿ��� ������ �޼��� �ۼ�
		// main�޼��忡���� Game Ŭ���� ��ü�� �޼���鸸 ����
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
			case 0 : this.com="����"; 				
					break;
			case 1 : this.com="����"; 				
					break;
			case 2 : this.com="��";					
					break;
		}
	}
	
	boolean userInput()
	{
		System.out.print("����, ����, �� ���� : ");
		this.user=input.nextLine();
		
		if(!user.equals("����") && !user.equals("����") && !user.equals("��"))
		{	
			System.out.printf("���� ���� �� �Է� ����!!");
			return false;
		}
		return true;
	}
	
	void result()
	{
//		System.out.println("com : "+com);
//		System.out.println("user : "+user);
		
		if(com.equals(user))
			System.out.printf("com : %s, user : %s -> ���", com, user);
		
		else if(com.equals("����"))
		{
			if(user.equals("����"))
				System.out.printf("com : %s, user : %s -> user ��", com, user);
			else if(user.equals("��"))
				System.out.printf("com : %s, user : %s -> com ��", com, user);
		}
		else if(com.equals("����"))
		{
			if(user.equals("����"))
				System.out.printf("com : %s, user : %s -> com ��", com, user);
			else if(user.equals("��"))
				System.out.printf("com : %s, user : %s -> user ��", com, user);
		}
		else if(com.equals("��"))
		{
			if(user.equals("����"))
				System.out.printf("com : %s, user : %s -> user ��", com, user);
			else if(user.equals("����"))
				System.out.printf("com : %s, user : %s -> com ��", com, user);
		}
	
	}
	
	
}