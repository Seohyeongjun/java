package javaStudy;

import java.util.Scanner;

public class java_0626 {

	public static void main(String[] args) {
		/* 
		 * �ڵ� �ۼ� �� �ؾ� �� �� : �����ľ�, �䱸���׵���
		 * ���ڿ� - " " ū�ٿ�ǥ�� ǥ���Ͽ� �ۼ��Ѵ�.
		 * ���ڿ��� String Ŭ����Ÿ���� ����ؾ� �Ѵ�.
		 * 
		 * 
		 * ����
		 * �����̸�, �ҼӺμ���, �� �޿����� Ű���带 ���� �Է¹޴´�.
		 * ������ 8%�� ����. �Ǽ��ɾ��� ������ ����Ѵ�.
		 * �̸�, �μ�, �Ǽ��ɾ��� ����Ѵ�.
		 * �� ���� ������ ���� ����Ѵ�.
		*/
		
		Scanner scan=new Scanner(System.in);
		
		String name1;
		String name2;
		String teamName1;
		String teamName2;
		
		int monthSalary1;
		int monthSalary2;
		
		float tex=0.08f;
		int realSalary1;
		int realSalary2;
		
		System.out.println("< ���� 1 >");
		System.out.print("�̸� : ");
		name1=scan.nextLine();
		System.out.print("�ҼӺμ��� : ");
		teamName1=scan.nextLine();
		System.out.print("�� �޿��� : ");
		monthSalary1=scan.nextInt();
		
		scan.nextLine();			// ���� �ʱ�ȭ, �Էºκ��� ���۸� �ʱ�ȭ �Ѵ�. �����Է� ������ �����Է��� �޴� ��� Ư�� �� �ʱ�ȭ�� �ؾ� ��
		System.out.println("\n< ���� 2 >");
		System.out.print("�̸� : ");
		name2=scan.nextLine();
		System.out.print("�ҼӺμ��� : ");
		teamName2=scan.nextLine();
		System.out.print("�� �޿��� : ");
		monthSalary2=scan.nextInt();
		
		realSalary1=(int)(monthSalary1-(monthSalary1*tex));
		realSalary2=(int)(monthSalary2-(monthSalary2*tex));
		
		System.out.println("\n*****************  ���� 1  ********************");
		System.out.printf("�̸� : %s, �ҼӺμ��� : %s, �� �޿��� : %d�� \n", name1, teamName1, monthSalary1);
		System.out.printf("�Ǽ��ɾ� : %d��\n", realSalary1);
		
		System.out.println("\n*****************  ���� 2  ********************");
		System.out.printf("�̸� : %s, �ҼӺμ��� : %s, �� �޿��� : %d�� \n", name2, teamName2, monthSalary2);
		System.out.printf("�Ǽ��ɾ� : %d��\n", realSalary2);
	
		/*
		 * next() - �����̽�Ű, ��Ű, ����Ű�� ������ �Է� ��
		 * next() - ����Ű ������ �Է� ��
		 */
	
		
	}

}
