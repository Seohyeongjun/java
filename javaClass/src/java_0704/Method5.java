package java_0704;

import java.util.Scanner;

public class Method5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//////////////////////////////////////////////////////
//		�簢���� �ʺ�� ���̸� �����ϰ� ���̸� ����Ͻÿ�
//	 	���̴� main�޼��忡�� ��µǰ� �Ͻÿ�
//		Area getQuadArea=new Area();
//		
//		int area=getQuadArea.getArea();
//		System.out.println("���� : "+area);
//		
		//////////////////////////////////////////////////////
//		�α��� ������ ���̵�� skyblue, ��й�ȣ�� 1234sea
//		login �޼��带 �����Ͽ� �α��� ���θ� ö��
//		���̵� ��й�ȣ�� ��ġ�ϸ� �α��� ���� ���
//		�ϳ��� ����ġ�� �α��� ���� ���
//		�α��� ���� ����� main����
//		GetLogin getLogin = new GetLogin();
//		boolean isFail = getLogin.login();
//		if(isFail)
//			System.out.println("�α��� ����");
//		else
//			System.out.println("�α��� ����");	
		
		/////////////////////////////////////////////////////
		// ���� �� ���� Ű���带 ���� �Է� �����ÿ�
		// �Է��� �� ������ ���� 100�� ������
		// (100 - ���� ���) �� ���
		// 100�� ���� ������ �� ������ ���� ���
		// main�޼��忡�� ���
		
		Calc calc = new Calc();
		int sum=calc.add();
		int result=100-sum;
		
		if(sum>100)
			System.out.println("��� : "+result);
		else
			System.out.println("��� : "+sum);		
	}
}

class Calc
{
	int num1, num2, num3, sum;
	
	int add()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("�� ������ �Է� �Ͻÿ�");
		
		System.out.print("1�� : ");
		this.num1=input.nextInt();
		
		System.out.print("2�� : ");
		this.num2=input.nextInt();
		
		System.out.print("3�� : ");
		this.num3=input.nextInt();
		
		this.sum=num1+num2+num3;
		
		return sum;		              		
	}
}

class GetLogin
{
	boolean login()
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("���̵� : ");
		String id = input.nextLine();
		
		System.out.print("�н����� : ");
		String password = input.nextLine();
		
		if(id.equals("skyblue"))
		{
			if(password.equals("1234sea"))
				return true;
		}		
		return false;		
	}
}

class Area
{
	int width;
	int height;
	int area;
	
	int getArea()
	{
		Scanner input=new Scanner(System.in);
		
		System.out.println("�簢���� ���� ���ϱ�");
		
		System.out.print("�ʺ� : ");
		this.width=input.nextInt();
		
		System.out.print("���� : ");
		this.height=input.nextInt();
		
		this.area=width*height;
		return area;
	}	
}