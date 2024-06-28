package java_0627;

import java.util.Scanner;

public class loop {
	public static void main(String[] args)
	{
//		int a;
//		int i;
//		
//		for(i=0, a=1; i<10; i++, a+=2)
//		{
//			System.out.println("반복문 "+a);
//		}
		
		//////////
//		for(i=1, a=1; i<20; a++)
//		{
//			i=i+a;
//			System.out.println(i);
//		}
		
		// 1부터 내가 입력한 숫자까지의 총합을 구한다.
//		int num;
//		int i;
//		int total=0;
//
//		Scanner input=new Scanner(System.in);
//		System.out.print("숫자 입력 : ");
//		num=input.nextInt();
//		
//		for(i=1; i<=num; i++)
//			total+=i;
//
//		System.out.println(num+"까지의 총합은 : "+total);
		
//		double random=Math.floor(Math.random()*10)+1;
//		System.out.printf("%.0f\n",random);
//
//		int random1=(int)Math.floor(Math.random()*10)+1;
//		System.out.printf("%d",random1);

////////////////////////////////////////////////////////
		// 랜덤의 범위 1~50
		// 랜덤 값 계속 출력
		// 랜덤값이 11의 배수일 경우 반복문 종료
//		int random=0;
//		
//		for(int i=0; ;i++)
//		{
//			random=(int)(Math.random()*50)+1;
//			System.out.print("("+i+")"+random+" ");
//			
//			if(random%11==0)
//					break;
//		}
//		
////////////////////////////////////////////////////////
		// up & down 만들기
		// 컴퓨터가 제시한 숫자 맞추기
		// 컴퓨터가 제시하는 숫자는 랜덤으로(랜덤범위 20~100)
		// 컴퓨터가 제시한 숫자가 74라면
		// 내가 입력한 숫자가 40일 경우 up이라고 출력
		// 내가 입력한 숫자가 80일 경우 down이라고 출력
		
//		int comNum;
//		int userNum;
//		
//		Scanner input=new Scanner(System.in);
//		comNum=(int)(Math.random()*8)+20;
//		
//		for(int i=0; ; i++)
//		{
//			System.out.print("숫자 입력(20~80) : ");
//			userNum=input.nextInt();
//			
//			if(userNum==comNum)
//			{	System.out.printf("컴퓨터 : %d, 유저 : %d\n", comNum, userNum);
//				break;
//			}
//			else if(userNum<comNum)
//				System.out.println("UP\n");
//			else
//				System.out.println("DOWN\n");
//		}
		
//////////////////////////////////////////////////////
//		// 이름이 있는 반복문
//		int num=0;
//		
//
//		if(num==0)
//		{ 
//			
//			for(int i=0; i<20; i++)
//			{
//				num+=i;
//				System.out.print(i+" ");
//				if(num>=40)
//					break;
//				System.out.println("(1) "+num);
//			}
//			
//			System.out.println("(2) "+num);
//
//		}
//		
//		else
//		{
//			System.out.println("(3) "+num);
//		}

//////////////////////////////////////////////////////
		// 베스킨라빈스 31
		// 컴퓨터와 나와 둘이 한다
		// 한 번에 제시할 수 있는 숫자는 최소 1개, 최대 3개
		// 31을 입력하면 패배
		Scanner input=new Scanner(System.in);
		
		int u,c;
		int count=1;
		aa:
		for(;;) 
		{
			System.out.print("\n숫자 몇개(1~3): ");
			u=input.nextInt();
			
			for(int i=1; i<=u; i++)
			{
				if(count==31)
				{
					System.out.print("\n유저패배");
					break aa;
				}
				System.out.print(" "+count++);
			}
	
			c=(int)(Math.random()*3)+1;
			System.out.print("\n컴 : ");
			for(int j=1; j<c; j++)
			{
				if(count==31)
				{	
					System.out.print("\n컴퓨터패배");
					break aa;
				}
				System.out.print(" "+count++);
				
			}
			System.out.print(" ");
		}
	
	}
}
