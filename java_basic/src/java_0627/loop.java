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
//			System.out.println("�ݺ��� "+a);
//		}
		
		//////////
//		for(i=1, a=1; i<20; a++)
//		{
//			i=i+a;
//			System.out.println(i);
//		}
		
		// 1���� ���� �Է��� ���ڱ����� ������ ���Ѵ�.
//		int num;
//		int i;
//		int total=0;
//
//		Scanner input=new Scanner(System.in);
//		System.out.print("���� �Է� : ");
//		num=input.nextInt();
//		
//		for(i=1; i<=num; i++)
//			total+=i;
//
//		System.out.println(num+"������ ������ : "+total);
		
//		double random=Math.floor(Math.random()*10)+1;
//		System.out.printf("%.0f\n",random);
//
//		int random1=(int)Math.floor(Math.random()*10)+1;
//		System.out.printf("%d",random1);

////////////////////////////////////////////////////////
		// ������ ���� 1~50
		// ���� �� ��� ���
		// �������� 11�� ����� ��� �ݺ��� ����
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
		// up & down �����
		// ��ǻ�Ͱ� ������ ���� ���߱�
		// ��ǻ�Ͱ� �����ϴ� ���ڴ� ��������(�������� 20~100)
		// ��ǻ�Ͱ� ������ ���ڰ� 74���
		// ���� �Է��� ���ڰ� 40�� ��� up�̶�� ���
		// ���� �Է��� ���ڰ� 80�� ��� down�̶�� ���
		
//		int comNum;
//		int userNum;
//		
//		Scanner input=new Scanner(System.in);
//		comNum=(int)(Math.random()*8)+20;
//		
//		for(int i=0; ; i++)
//		{
//			System.out.print("���� �Է�(20~80) : ");
//			userNum=input.nextInt();
//			
//			if(userNum==comNum)
//			{	System.out.printf("��ǻ�� : %d, ���� : %d\n", comNum, userNum);
//				break;
//			}
//			else if(userNum<comNum)
//				System.out.println("UP\n");
//			else
//				System.out.println("DOWN\n");
//		}
		
//////////////////////////////////////////////////////
//		// �̸��� �ִ� �ݺ���
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
		// ����Ų��� 31
		// ��ǻ�Ϳ� ���� ���� �Ѵ�
		// �� ���� ������ �� �ִ� ���ڴ� �ּ� 1��, �ִ� 3��
		// 31�� �Է��ϸ� �й�
		Scanner input=new Scanner(System.in);
		
		int u,c;
		int count=1;
		aa:
		for(;;) 
		{
			System.out.print("\n���� �(1~3): ");
			u=input.nextInt();
			
			for(int i=1; i<=u; i++)
			{
				if(count==31)
				{
					System.out.print("\n�����й�");
					break aa;
				}
				System.out.print(" "+count++);
			}
	
			c=(int)(Math.random()*3)+1;
			System.out.print("\n�� : ");
			for(int j=1; j<c; j++)
			{
				if(count==31)
				{	
					System.out.print("\n��ǻ���й�");
					break aa;
				}
				System.out.print(" "+count++);
				
			}
			System.out.print(" ");
		}
	
	}
}
