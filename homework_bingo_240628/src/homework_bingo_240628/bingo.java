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
		
		int rowCount=0;		// 가로 빙고 
		int verCount=0;		// 세로 빙고
		int diagonal1=0;	// 대각선 빙고
		int diagonal2=0;	// 대각선 빙고
		
		int rowBingo1=0;	// 가로 빙고 카운트
		int rowBingo2=0;
		int rowBingo3=0;
		int rowBingo4=0;
		int rowBingo5=0;
		
		int verBingo1=0;	// 세로 빙고 카운트
		int verBingo2=0;
		int verBingo3=0;
		int verBingo4=0;
		int verBingo5=0;

		int diaBingo1=0;	// 대각선 빙고 카운트
		int diaBingo2=0;
		
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
			System.out.println("  >> user                     computer <<");
			for(int i=0; i<randomNumUser.length/5; i++)
			{
				for(int j=0; j<randomNumUser.length/5; j++)		// print user biongo number
				{
					if(randomNumUser[j+(i*5)]<10)
					 System.out.print("  "+randomNumUser[j+(i*5)]);
					else
					 System.out.print(" "+randomNumUser[j+(i*5)]);
				}
				System.out.print("           ");
				for(int j=0; j<randomNumCom.length/5; j++)		// print computer biongo number
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
//			comNum=input.nextInt();			// 컴퓨터 빙고 숫자 입력
			comNum=(int)(Math.random()*randomNum)+1;
			
			for(int i=0; i<randomNumCom.length; i++)
			{
				if(comNum==randomNumCom[i])
					break;
				
				if(i==(randomNumCom.length)-1)
				{
					comNum=(int)(Math.random()*randomNum)+1;
					i=0;
				}
			}
///////////////////////////////////////////////////////////////////////////////////////////			
			System.out.println(comNum);
			
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
				for(int j=0; j<randomNumUser.length/5; j++)	// 가로 빙고 확인
				{
					if(randomNumUser[i*5+j]==0)
						rowCount++;
				}
				if(rowCount==5)
					bingoCountUser++;

				for(int j=0; j<randomNumUser.length/5; j++)	// 세로 빙고 확인
				{
					if(randomNumUser[i+j*5]==0)
						verCount++;
				}
				if(verCount==5)
					bingoCountUser++;
				
				if(randomNumUser[i*6]==0)		// 대각선 빙고 확인(좌->우, 0->24)
					diagonal1++;
				
				if(diagonal1==5)
					bingoCountUser++;

				if(randomNumUser[(i+1)*4]==0) 	// 대각선 빙고 확인(우->좌, 4->20)
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
				for(int j=0; j<randomNumCom.length/5; j++)	// 가로 빙고 확인
				{
					if(randomNumCom[i*5+j]==0)
					{
						rowCount++;
						
						if(i==0)
							rowBingo1++;
						else if(i==1)
							rowBingo2++;
						else if(i==2)
							rowBingo3++;
						else if(i==3)
							rowBingo4++;
						else if(i==4)
							rowBingo5++;						
					}
				}
				if(rowCount==5)
					bingoCountCom++;

				for(int j=0; j<randomNumCom.length/5; j++)	// 세로 빙고 확인
				{
					if(randomNumCom[i+j*5]==0)
					{
						verCount++;
						
						if(i==0)
							verBingo1++;
						else if(i==1)
							verBingo2++;
						else if(i==2)
							verBingo3++;
						else if(i==3)
							verBingo4++;
						else if(i==4)
							verBingo5++;												
					}
				}
				if(verCount==5)
					bingoCountCom++;
				
				if(randomNumCom[i*6]==0)		// 대각선 빙고 확인(좌->우, 0->24)
				{
					diagonal1++;
					diaBingo1++;
				}
				
				if(diagonal1==5)
					bingoCountCom++;

				if(randomNumCom[(i+1)*4]==0) 	// 대각선 빙고 확인(우->좌, 4->20)
				{
					diagonal2++;
					diaBingo2=0;
				}
				
				if(diagonal2==5)
					bingoCountCom++;
				
				 rowCount=0;
				 verCount=0;
			}
			diagonal1=0;	// 대각선 빙고 초기화
			diagonal2=0;
			bingoCountUser=0;	// 유저 빙고 초기화
			bingoCountCom=0;	// 컴퓨터 빙고 초기화
			
/*			rowBingo1=0;	// 가로 빙고 카운트 초기화
			rowBingo2=0;
			rowBingo3=0;
			rowBingo4=0;
			rowBingo5=0;
			
			verBingo1=0;	// 세로 빙고 카운트 초기화
			verBingo2=0;
			verBingo3=0;
			verBingo4=0;
			verBingo5=0;

			diaBingo1=0;	// 대각선 빙고 카운트 초기화
			diaBingo2=0;		
*/			
			System.out.println("--     user bingo : "+ bingoCountUser +"\n-- computer bingo : "+bingoCountCom);
			System.out.println("\n");				
		}
		
	}

}
