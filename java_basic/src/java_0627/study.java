package java_0627;

import java.util.Scanner;

// ���
public class study {
	public static void main(String[] args)
	{
		// ���� �հ� ���� - �հ�(60�� �̻�), ���հ�(60�� �̸�)
		
		int score=72;
		
		if(score>=60)
			System.out.printf("���� : %d������ �հ�\n", score);
		else
			System.out.printf("���� : %d������ ���հ�\n", score);

		////////////////////////////////////////////////////////////
		String button="����";
		
		switch(button)
		{
			case "����" : System.out.println("���� ����\n");
						break;
			case "����" : System.out.println("���� ����\n");
						break;
			case "����" : System.out.println("���� ����\n");
						break;
		}
		////////////////////////////////////////////////////////////
		// ���ο� ������ ���̸� Ű����� �Է��ϼ���.
		// ���� �Ǵ� ������ ���̰� ũ�ٸ� �����簢��
		// ���ο� ������ ���̰� ���ٸ� ���簢�� �̶�� ���
		// switch������ (if�� ���x)
		Scanner input=new Scanner(System.in);
		int width;
		int height;
		int result;
		
		System.out.print("���� ���� : ");
		width=input.nextInt();
		System.out.print("���� ���� : ");
		height=input.nextInt();
		
		result=width-height;
		switch(result)
		{
			case 0 : System.out.println(">> ���簢��");
					break;

			default : System.out.println(">> ���簢��");
					break;
		}
		
		
		
	}
	
}
