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
		
//		 �ֻ��� ����
//		 
//		 j���ذ� s�����̰� �ֻ��� ������ �Ѵ�.
//		 �ֻ����� �ϳ�, �����̴�.
//		 �ֻ����� ���� ū ����� �̱��.(����)
//		 
//		 �ֻ��� �� ���ϴ� �޼���
//		 
//		 �ֻ��� �� ���Ͽ� ���� �̰���� ����ϴ� �޼���	 		 
//		
		Dice dice = new Dice();
		
		String name1="j����";
		String name2="s����";
		
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
			System.out.printf("%s �� : %d\n%s �� : %d\n",name1, nameNum1, name2, nameNum2);
		else if(result>0)
			System.out.printf("%s �� : %d\n%s �� : %d\n",name1, nameNum1, name2, nameNum2);
		else
			System.out.printf("%s : %d\n%s : %d \n���",name1, nameNum1, name2, nameNum2);
	}
}


class Init
{
	String name[];
	int num[];
	
	void getDice()
	{
		Scanner input=new Scanner(System.in);
		System.out.print("���� �ο� : ");
		int gamePerson=input.nextInt();
		this.name = new String[gamePerson];
		this.num = new int[gamePerson];
		input.nextLine();
		
		for(int i=0; i<name.length; i++)
		{
			System.out.print("("+(i+1)+")�� ������ : ");
			this.name[i]=input.nextLine();			
		}
	}
	
	void runDice()
	{
		System.out.println();
		for(int i=0; i<name.length; i++)
		{
			System.out.print(name[i]+" �ֻ��� ��ȣ : ");
			this.num[i]=(int)(Math.random()*6)+1;
			System.out.println(num[i]);
		}
	}
	void outDice()
	{	// ���� ū �ֻ��� �� ã��
		int max=0;
		for(int number:num)
		{
			if(max<number) 
				max=number;			
		}
		System.out.println("\nmax number : "+max);
		// ��� ������ �ֻ��� ���� ���ٸ�
		boolean isSame=true;
		for(int number:num)
		{
			if(number!=max) 
				isSame=false;
		}
		if(isSame)
		{
			System.out.println("��ΰ� ���� �� - ���-");
			return;
		}
		
		
		System.out.println("\n��� ");

		// ���� ū �ڻ����� ������ �ִ� ����� �̱��.
		for(int i=0; i<num.length; i++)
		{
			if(num[i]==max)
				System.out.println(name[i]+" : ��");
//			else
//				System.out.println(name[i]+" : ��");
		}

	}
}
