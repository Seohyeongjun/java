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
		int bingoCountUser=0;
		int bingoCountCom=0;
		int rowCount=0;		// ���� ���� 
		int verCount=0;		// ���� ����
		int diagonal1=0;	// �밢�� ����
		int diagonal2=0;	// �밢�� ����
		
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
			System.out.print("user ���� �Է� : ");
			userNum=input.nextInt();
			
			for(int i=0; i<randomNumUser.length; i++)
			{
				if(randomNumUser[i]==userNum)
					randomNumUser[i]=0;

				if(randomNumCom[i]==userNum)
					randomNumCom[i]=0;
			}
			
			/* select computer bingo number */
			System.out.print("com ���� �Է� : ");
			comNum=input.nextInt();
			
			for(int i=0; i<randomNumCom.length; i++)
			{
				if(randomNumUser[i]==comNum)
					randomNumUser[i]=0;
				
				if(randomNumCom[i]==comNum)
					randomNumCom[i]=0;
			}
			
			// user bingoCount
			for(int i=0; i<randomNumUser.length/5; i++)
			{
				for(int j=0; j<randomNumUser.length/5; j++)	// ���� ���� Ȯ��
				{
					if(randomNumUser[i*5+j]==0)
						rowCount++;
				}
				if(rowCount==5)
					bingoCountUser++;

				for(int j=0; j<randomNumUser.length/5; j++)	// ���� ���� Ȯ��
				{
					if(randomNumUser[i+j*5]==0)
						verCount++;
				}
				if(verCount==5)
					bingoCountUser++;
				
				if(randomNumUser[i*6]==0)		// �밢�� ���� Ȯ��(��->��, 0->24)
					diagonal1++;
				
				if(diagonal1==5)
					bingoCountUser++;

				if(randomNumUser[(i+1)*4]==0) 	// �밢�� ���� Ȯ��(��->��, 4->20)
					diagonal2++;
				
				if(diagonal2==5)
					bingoCountUser++;

				 rowCount=0;
				 verCount=0;				 
			}
			diagonal1=0;
			diagonal2=0;

			// computer bingoCount
			for(int i=0; i<randomNumCom.length/5; i++)
			{
				for(int j=0; j<randomNumCom.length/5; j++)	// ���� ���� Ȯ��
				{
					if(randomNumCom[i*5+j]==0)
						rowCount++;
				}
				if(rowCount==5)
					bingoCountCom++;

				for(int j=0; j<randomNumCom.length/5; j++)	// ���� ���� Ȯ��
				{
					if(randomNumCom[i+j*5]==0)
						verCount++;
				}
				if(verCount==5)
					bingoCountCom++;
				
				if(randomNumCom[i*6]==0)		// �밢�� ���� Ȯ��(��->��, 0->24)
					diagonal1++;
				
				if(diagonal1==5)
					bingoCountCom++;

				if(randomNumCom[(i+1)*4]==0) 	// �밢�� ���� Ȯ��(��->��, 4->20)
					diagonal2++;
				
				if(diagonal2==5)
					bingoCountCom++;
				
				 rowCount=0;
				 verCount=0;
			}
			diagonal1=0;
			diagonal2=0;

		System.out.println("user : "+bingoCountUser+" come: "+bingoCountCom);
		bingoCountUser=0;
		bingoCountCom=0;
				
		}
		
	}

}
