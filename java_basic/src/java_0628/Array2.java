package java_0628;

import java.util.Scanner;
import java.util.Arrays;

public class Array2 {

	static Scanner input=new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		// ���� �迭�� �����ϴ� ������ �ǸŰ����� Ű����� �Է��Ͽ� ����
		// ���� �迭�� ����� �ǸŰ��ݵ��� ���հ� ����� ���Ͻÿ�.
		
//		int[] cookies=new int[5];
//		int cookiesPrice=0;
//		int cookiesPriceSum=0;
//		int cookiesPriceAvr=0;
//		String[] cookiesName=new String[cookies.length];
//		
//		for(int i=0; i<cookies.length; i++)
//		{
//			System.out.print((i+1)+"�� ��Ű �̸� : ");
//			cookiesName[i]=input.nextLine();
//			
//			System.out.print("   ��Ű ���� : ");
//			cookiesPrice=input.nextInt();
//			cookies[i]=cookiesPrice;	
//			
//			cookiesPriceSum+=cookies[i];
//			input.nextLine();
//		}
//		
//		cookiesPriceAvr=cookiesPriceSum/cookies.length;
//		
//		for(int i=0; i<cookies.length; i++)
//		{
//			System.out.printf("%d�� ��Ű : %s, ���� : %d\n",i+1, cookiesName[i], cookies[i]);
//		}
//		System.out.printf("\n��Ű %d���� �� �� : %d��\n", cookies.length, cookiesPriceSum);
//		System.out.printf("��Ű %d���� �� �� : %d��", cookies.length, cookiesPriceAvr);
		
////////////////////////////////////////////////////////////////////////////////////////
//		// 6���� Ű�� tall�迭�� ����
//		// Ű 175 �̸��� ���
//		float[] tall = new float[] {173.4f, 175.1f, 169.5f, 181.4f, 185.3f};
//		
//		System.out.println(Arrays.toString(tall));
//		System.out.println("\n175 �̸� : ");
//		
//		for(int i=0; i<tall.length; i++)
//		{
//			if(tall[i]<175)
//				System.out.print("- "+(i+1)+"�� : "+tall[i]+"\n");
//		}
////////////////////////////////////////////////////////////////////////////////////////		
//		// name �迭�� ���ڿ� �߿��� �̼���, ������, ������, �ֿ��� ���ߴ� �迭�� �����ϰ� ���
//		
//		String[] name=new String[] {"�̼���", "������", "�̼���", "������", "������", "�ֿ�", "�縸��"};
//		String[] ���ߴ�=new String[4];
//		
//		System.arraycopy(name, 2, ���ߴ�, 0, 4);
////		for(int i=0, j=0; i<name.length; i++)
////		{
////			if(name[i]=="�̼���")
////				���ߴ�[j++]=name[i];
////			else if(name[i]=="������")
////				���ߴ�[j++]=name[i];
////			else if(name[i]=="������")
////				���ߴ�[j++]=name[i];
////			else if(name[i]=="�縸��")
////				���ߴ�[j]=name[i];
////		}
//		System.out.print(Arrays.toString(���ߴ�));
////////////////////////////////////////////////////////////////////////////////////////
//		
//		String word="i like banana";
//		// indexOf ���ڿ��� ��ġ ã��
//		int num=word.indexOf("like");
//		System.out.println(num);  // 2���
//		
////		for(int i=num; ; i++)
////		{	
////			System.out.println(word);
////		}	
//		System.out.println(word.contains("ba"));	// Ư�� ���ڰ� �ִٸ� true, ������ false
//
//		String a[]=new String[] {"banana", "orange"};
//		System.out.println(a[0]);
//		System.out.println(a[0].indexOf("na"));
//		System.out.println(a[1].contains("ro"));
//		
//////////////////////////////////////////////////////////////////////////////////		
//		
//		String[] name=new String[] {"������", "�Ѽ���", "�縸��", "������", "������", "�����", "�̼���", "�̻��", "�̻��", "�Ѱ���"};
//		System.out.print("�̸��˻� : ");
//		String search=input.nextLine();
//		
//		for(int i=0; i<name.length; i++)
//		{
//			if(name[i].contains(search))
//				System.out.println("��� : "+name[i]);
//		}
//		
//////////////////////////////////////////////////////////////////////////////////
		// ���� �˻��Ͽ� �����̸��� �ݾ��� ��µǰ� �� ��
		// ī�� �迭�� ���� ���� �˻��� "�˼��մϴ�. �غ����Դϴ�." ��� ���
		
		String[] cafe=new String[] {"�Ƹ޸�ī�� : 2000��", "ȭ��Ʈ �Ƹ޸�ī�� : 2500��", "ī��� : 3000��", 
				"��ü�� : 3800��", "ī���ī : 4000��", "�����ֽ� : 4000��", "��Ӿ��̽�Ƽ : 2900��", 
				"�����ƾ��̽�Ƽ : 2800��", "�ڵξ��̽�Ƽ : 2800��", "���ڿ��̵� : 3500��", "���ܿ��̵� : 3500��" ,"û�������̵� : 3500��"}; 
		
		System.out.print("���� �˻� : ");
		String search=input.nextLine();
		char flag='f';
		
		for(int i=0; i<cafe.length; i++)
		{
			if(cafe[i].contains(search))
			{
				System.out.println(cafe[i]);
				flag='t';
			}
		}

		if(flag=='f')
			System.out.println("�˼��մϴ�. �غ����Դϴ�.");

			
		
		
		
		
		
		
		
	}
}
