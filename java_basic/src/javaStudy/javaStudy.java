package javaStudy;

import java.util.Scanner;

// �ܺ� ��Ű���� Ŭ������ �ҷ����� ����( import java.util. )
// import java.util.Scanner;
public class javaStudy {	// input study
	public static void main(String[] args)
	{
//		System.out.println("�ڹ����");
		
		// System.in - �Է�;
		// �Է¹��� �� �ִ� ���� Ŭ���� - Scanner
		Scanner scan=new Scanner(System.in);
		
//		int a=scan.nextInt();
//		float b=scan.nextFloat();
//		String c=scan.nextLine();	// scan.next();
//		
//		System.out.println(a);
//		System.out.println(b);		
//		System.out.println(c);
		
		// ��Զ��� �ﰢ���, �ٳ��������� �Ծ���
		// ���ɰ����� ������ �ݾ���?
		
//		int noodleNum=0;
//		int kimbabNum=0;
//		int milkNum=0;
//		
//		int noodlePrice=0;
//		int kimbabPrice=0;
//		int milkPrice=0;
//		
//		int noodleTotal;
//		int kimbabTotal;
//		int milkTotal;
//		int total;
//		
//		System.out.print("��Զ���� ���� : ");
//		noodleNum=scan.nextInt();
//		System.out.print("��Զ�� �� : ");
//		noodlePrice=scan.nextInt();
//		noodleTotal=noodleNum*noodlePrice;
//		
//		System.out.print("\n�ﰢ����� ���� : ");
//		kimbabNum=scan.nextInt();
//		System.out.print("�ﰢ��� �� : ");
//		kimbabPrice=scan.nextInt();
//		kimbabTotal=kimbabNum*kimbabPrice;
//		
//		System.out.print("\n�ٳ��������� ���� : ");
//		milkNum=scan.nextInt();
//		System.out.print("�ٳ������� �� : ");
//		milkPrice=scan.nextInt();
//		milkTotal=milkNum*milkPrice;
//		
//		total=noodleTotal+kimbabTotal+milkTotal;
//			
//		System.out.printf("\n ��Զ�� ���� : %d��, ��Զ�� �� : %d�� : �հ� : %d��", noodleNum, noodlePrice, noodleTotal);
//		System.out.printf("\n �ﰢ��� ���� : %d��, �ﰢ��� �� : %d�� : �հ� : %d��" , kimbabNum, kimbabPrice, kimbabTotal);
//		System.out.printf("\n�ٳ������� ���� : %d��, �ٳ������� �� : %d�� : �հ� : %d��", milkNum, milkPrice, milkTotal);
//		System.out.print("\n\n�� �� : "+total+"��");
		///////////////////////////////////////////////////////////////
		
		// �μ��� ������ ����ͼ� ���� ���ٿԴ�
		// �̹��� �Ź��� ¦������ �ž� ���� ���ٿԴ�
		// �μ��� ���� 5���̴�. �μ��� 1�� �ö󰡴µ� 3.4�ʰ� �ɸ���
		// �μ��� ���� ���� ���Դ� �ϴµ� �ɸ� �� �ð��� �� ��?
		
//		int upDowncount=2;
//		int home=5;
//		float upDownSec=3.4f;
//		float homeInOutSec;
//		float upDowntotalTime=upDowncount*home*upDownSec;
//		
//		System.out.printf("�μ��� ���� %d��\n�� �� �ö󰡰� �������µ� �ɸ��� �ð� : %.1f��\n���� ���� �� Ƚ�� : %dȸ\n",home, upDownSec, upDowncount);
//		System.out.println("\n1ȸ, �μ��� 1������ ��(5��)���� ���� �������� �ð� : "+(home-1)*upDownSec*upDowncount+"��");
//		System.out.println("�� 2ȸ �μ��� ���� ���� �� �ð� : "+upDowntotalTime*2+"��");
//		
//		System.out.print("\n���� 1ȸ ���� ���� �ð� : ");
//		homeInOutSec=scan.nextFloat();
//		System.out.print("\n***********************************************");
//		System.out.println("\n�� �ɸ� �ð� : "+(upDowntotalTime+homeInOutSec)*2+"��");
////////////////////////////////////////////////////////////////////////////////////////
		/*********************************************************************
		  �������� ������ ����, �Ǽ�, ����, boolean(��, ����)
		 	������ Ÿ��
		 	���� - byte, short, int, long
		 	���� - char
		 	�Ǽ� - float, double
		 	������ - boolean
		 	
		  ���� ������ - ������Ÿ�� �����̸�
		   int num; - ����Ÿ�� ���� ����
		   double dnum; - �Ǽ�Ÿ�� ���� ����
		   char ch; ���� Ÿ�� ���� ����
		   boolean bool; �� ���� ���� ����
		   
		   ������ �ʱ�ȭ
		   int num=10; ���� ����� �Բ� ������ ����
		   
		   ��¹��
		   System.out.println(��³���); �ڵ� �ٹٲ�
		   System.out.print(��³���); 
		   System.out.printf(��³���); 
		   
		   printf ���� �Բ� ����ϴ� ���� ������
		   	%d, %u - ����
		   	%f - �Ǽ�
		   	%c - ����
		   	%s - ���ڿ�
		   	
		   	
		   age=89;	
		   System.out.printf("%s ������ ���̰� %d���� ���� ������ %c��", "�ڵ���", age, '��');
		   
		   �Է¹��
		   Scanner Ŭ���� ��ü �ʿ�
		   Scanner ���� = new Scanner(System.in);
		    ScannerŬ������ ����ܺ�Ŭ�����̷̹� import �ؾ� �ȴ�
		    ����.nextInt(); intŸ�� ������ �Է�
		    ����.nextByte(); byteŸ�� ������ �Է�
		    ����.nextShort(); sortŸ�� ������ �Է�
		    ����.nextLong(); longŸ�� ����
		    ����.nextFloat(); FloatŸ�� �Ǽ�
		    ����.nextDouble(); DoubleŸ�� �Ǽ�
		    ����.next(); ���ڿ� �Է�
		    ����.nextLine(); ���ڿ�	 
		 ***************************************************************/
		
		// c���, �ڹ�, �����а��� ���� ������ �Է��ϼ���
		// �� ������ ������ ����� ���� ����ϼ���
		
		float cLan;
		float javaLan;
		float built;
		float total;
		
		System.out.print("c��� ���� : ");
		cLan=scan.nextFloat();
		System.out.print("�ڹ� ���� : ");
		javaLan=scan.nextFloat();
		System.out.print("�����а��� ���� : ");
		built=scan.nextFloat();
		
		total=cLan+javaLan+built;
		System.out.println("\n�� �� : "+total+"��");
		System.out.printf("�� �� : %.2f��",total/3);
		
		
		
		
		
	}
}
