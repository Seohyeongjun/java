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
		int num;
		int i;
		int total=0;

		Scanner input=new Scanner(System.in);
		System.out.print("���� �Է� : ");
		num=input.nextInt();
		
		for(i=1; i<=num; i++)
			total+=i;

		System.out.println(num+"������ ������ : "+total);
		
	}
}
