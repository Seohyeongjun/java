package homework_dice_240703;

import java.util.Scanner;

public class diceGame {

//	public static void main(String[] args) {
		
//		Init init=new Init();
//		
//		init.getDice();
//		init.runDice();
//		init.outDice();		


	public static void main(String[] args) {
		
//		 주사위 게임
//		 
//		 j형준과 s석완이가 주사위 게임을 한다.
//		 주사위는 하나, 육면이다.
//		 주사위의 값이 큰 사람이 이긴다.(랜덤)
//		 
//		 주사위 값 구하는 메서드
//		 
//		 주사위 값 비교하여 누가 이겼는지 출력하는 메서드	 		 
//		
		Dice dice = new Dice();
		
		String name1="j형준";
		String name2="s석완";
		
		int nameNum1=dice.getDice();
		int nameNum2=dice.getDice();
		
		dice.outDice(name1, nameNum1, name2, nameNum2);

	}

}


class Dice
{
	int getDice()
	{
		int diceNum=(int)(Math.random()*6)+1;
		return diceNum;		
	}
	
	void outDice(String name1, int nameNum1, String name2, int nameNum2)
	{
		int result=nameNum1-nameNum2;
		
		if(result<0)
			System.out.printf("%s 패 : %d\n%s 승 : %d\n",name1, nameNum1, name2, nameNum2);
		else if(result>0)
			System.out.printf("%s 승 : %d\n%s 패 : %d\n",name1, nameNum1, name2, nameNum2);
		else
			System.out.printf("%s : %d\n%s : %d \n비김",name1, nameNum1, name2, nameNum2);
	}
}


class Init
{
	String name[];
	int num[];
	
	void getDice()
	{
		Scanner input=new Scanner(System.in);
		System.out.print("참가 인원 : ");
		int gamePerson=input.nextInt();
		this.name = new String[gamePerson];
		this.num = new int[gamePerson];
		input.nextLine();
		
		for(int i=0; i<name.length; i++)
		{
			System.out.print("("+(i+1)+")번 참가자 : ");
			this.name[i]=input.nextLine();			
		}
	}
	
	void runDice()
	{
		System.out.println();
		for(int i=0; i<name.length; i++)
		{
			System.out.print(name[i]+" 주사위 번호 : ");
			this.num[i]=(int)(Math.random()*6)+1;
			System.out.println(num[i]);
		}
	}
	void outDice()
	{	// 가장 큰 주사위 값 찾기
		int max=0;
		for(int number:num)
		{
			if(max<number) 
				max=number;			
		}
		System.out.println("\nmax number : "+max);
		// 모든 참가자 주사위 값이 같다면
		boolean isSame=true;
		for(int number:num)
		{
			if(number!=max) 
				isSame=false;
		}
		if(isSame)
		{
			System.out.println("모두가 같은 수 - 비김-");
			return;
		}
		
		
		System.out.println("\n결과 ");

		// 가장 큰 자사위값 가지고 있는 사람이 이긴다.
		for(int i=0; i<num.length; i++)
		{
			if(num[i]==max)
				System.out.println(name[i]+" : 승");
//			else
//				System.out.println(name[i]+" : 패");
		}

	}
}
