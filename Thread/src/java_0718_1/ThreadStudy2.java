package java_0718_1;

import java.util.Scanner;

public class ThreadStudy2 {

	public static void main(String[] args) throws InterruptedException {
		
		AAA aaa = new AAA();		// �Ϲ� Ŭ���� ��ü ����
		new Thread(aaa).start();	// ������ ��ü ����
		
		for(int i=0; i<5; i++)
		{
			System.out.println("AAA - "+(i+1));
			Thread.sleep(2000);
		}
	}
}


class AAA implements Runnable
{
	@Override
	public void run() {
		System.out.print("���� �Է� : ");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("�Է� ���� : "+num);
		
		
		
	}
	
}