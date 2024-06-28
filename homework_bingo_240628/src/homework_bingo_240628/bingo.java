package homework_bingo_240628;

import java.util.Scanner;

public class bingo {

	static Scanner input=new Scanner(System.in);
	
	public static void main(String[] args) {

		int randomNum=50;
		int [] randomNumUser = new int[25];
		int [] randomNumCom = new int[25];
		int userNum=0;
		int comNum=0;
		int count=0;
		int bingoCount=0;
		
		/*  get user bingo number		*/
		for(int i=0; i<randomNumUser.length; i++)
		{
			randomNumUser[i] = (int)(Math.random()*randomNum)+1;
			while(count<i)
			{
				if(randomNumUser[count]==randomNumUser[i] )
				{
					randomNumUser[i] = (int)(Math.random()*randomNum)+1;
					count=-1;
				}			
				count++;
			}
			count=0;
		}	
		
		/*  get computer bingo number		*/
		for(int i=0; i<randomNumCom.length; i++)
		{
			randomNumCom[i] = (int)(Math.random()*randomNum)+1;
			while(count<i)
			{
				if(randomNumCom[count]==randomNumCom[i] )
				{
					randomNumCom[i] = (int)(Math.random()*randomNum)+1;
					count=-1;
				}			
				count++;
			}
			count=0;
		}	

		while(true) 
		{
			for(int i=0; i<randomNumUser.length/5; i++)
			{
				for(int j=0; j<randomNumUser.length/5; j++)
				{
					if(randomNumUser[j+(i*5)]<10)
					 System.out.print("  "+randomNumUser[j+(i*5)]);
					else
					 System.out.print(" "+randomNumUser[j+(i*5)]);
				}
				System.out.print("           ");
				for(int j=0; j<randomNumCom.length/5; j++)
				{
					if(randomNumCom[j+(i*5)]<10)
						 System.out.print("  "+randomNumCom[j+(i*5)]);
						else
						 System.out.print(" "+randomNumCom[j+(i*5)]);
				}
	
				System.out.print("\n");
			}
			
			/* select user bingo number */
			System.out.print("user 숫자 입력 : ");
			userNum=input.nextInt();
			
			for(int i=0; i<randomNumUser.length; i++)
			{
				if(randomNumUser[i]==userNum)
					randomNumUser[i]=0;

				if(randomNumCom[i]==userNum)
					randomNumCom[i]=0;
			}
			
			/* select computer bingo number */
			System.out.print("com 숫자 입력 : ");
			comNum=input.nextInt();
			
			for(int i=0; i<randomNumCom.length; i++)
			{
				if(randomNumUser[i]==comNum)
					randomNumUser[i]=0;
				
				if(randomNumCom[i]==comNum)
					randomNumCom[i]=0;
			}
			
			// bingoCount

		
		}
		
	}

}
