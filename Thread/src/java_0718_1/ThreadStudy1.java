package java_0718_1;

import java.util.Scanner;

public class ThreadStudy1 {

	public static void main(String[] args) {
		
		MyThread th = new MyThread();	// ������ ��ü ����
		th.start();		// ������ ����
		
		for(int i=0; i<10; i++)
		{
			System.out.println("      ���� main "+(i+1));
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
//		Scanner sc = new Scanner(System.in);
//		System.out.print("���� �Է� : ");
//		int num = sc.nextInt();
//		System.out.println(num);
		
	}
}

class MyThread extends Thread
{
	@Override
	public void run()
	{
		for(int i=0; i<10; i++)
		{
			System.out.println("������~~ "+(i+1));
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}


/*
 	���μ��� - cpu�� ���� �޸�(ram)�� �ε� �Ǿ��ִ� ���α׷��� ���Ѵ�.
 		��, �������� ���α׷� ���� ���μ����̴�.
 		102���� ���μ����� �ִٶ�� ���� 102���� ���α׷��� �������̴ٶ�� ����̴�.
 		
 		�� ��ǻ�Ϳ� �������� ���μ��� Ȯ���ϴ� ���
 		1. �ϴܿ� �۾�ǥ���ٿ��� ������ ���콺 Ŭ���Ͽ� �۾������� ����
 			���μ������ ���� �ִ�. 
 		2. ���������Ʈâ�� ����(cmd �˻� �Ǵ� ctrl+r �� cmd)	
 			������ - tasklikst ��ɾ�
 			
 			���μ��� ���� - taskkill/pid[pid��]		pid : ���μ��� id
 			
 	������ - ���μ����ȿ��� ���� ������ �����ϴ� ����	
 			�����带 �߰��ϸ� ���ÿ� �������� ������ ���� �� �� �ִ�.
 			
 		�ڹ� ������
 		������ ������
 		Thread() : ���ο� ������ ��ü �Ҵ�
 		Thread("�̸�") : ���ο� ������ ��ü�� �Ҵ� �ϸ鼭 �̸� �ο�	
 			
 			
 */ 
 
