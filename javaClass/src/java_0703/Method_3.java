package java_0703;

import java.util.Scanner;
public class Method_3 {

	public static void main(String[] args) {
		// ���� �� �� �Է� �޾� ���� ���
		Calc calc=new Calc();
//		calc.sum();
//		calc.sum(10,20);
		
		// �� ������ ������ ���Ͽ� ����Ͻÿ�
		int kor=89, eng=74, mat=43;
		calc.sum(kor, eng, mat);
		
		// �޼��� ȣ���Ͽ� '�޼�Ʈ dog����~' ��� ���
		calc.easy();
		calc.view();
		
		// �⼭�带 ȣ���Ͽ� �̸��� ���̸� ����ϼ���
		// �Ű����� ���� �޼���, Ű���� �Է� x
		calc.name();
		
		// �޼��带 ȣ���Ͽ� �Ʒ��� �����͸� ���
		String animal="��帮Ʈ����";
		String ������ = "2024-07-01";
		TestMethod testMethod = new TestMethod();
		testMethod.animal(animal, ������);
		
		// ���� ��¥�߿��� ���� �ϸ� ����Ͻÿ�
		// ���ڿ� �޼��� substring �Ǵ� split ���
		String examDate="2024-08-13";
		testMethod.dateSubstring(examDate);
		
		// �� ����� ���� ��� ���� ���Ͽ� ���
		// ��հ��� ����
		int ���=31, ����=23, ����=28, ���=37;
		testMethod.age(���, ����, ����, ���);
	}

}

class TestMethod
{
	void age(int name1, int name2, int name3, int name4)
	{
		int totalAge;
		int aveAge;
		
		totalAge=name1+name2+name3+name4;
		aveAge=(int)totalAge/4;
		
		System.out.println("���� ���� : "+totalAge+"��");
		System.out.printf("��ճ��� : %d��",aveAge);
	}
	void dateSubstring(String date)
	{
		System.out.println(date.substring(5));
		String dates[]=date.split("-");			// ������ �迭�� ����.
		
//		System.out.println(dates[0]);
		System.out.print(dates[1]+"�� ");	// ��
		System.out.print(dates[2]+"��\n");	// ��
		
	}
	
	void animal(String name, String date)
	{
		System.out.println("�� �� : "+name+"\n������ : "+date);
	}
}
class Calc
{	
	void name()
	{
		String name="������";
		int age=41;
		System.out.println(name+" : "+age+"��");
	}
	void view()
	{
		int a=10, b=20;
		System.out.printf("a : %d, b : %d\n",a, b);
		
	}
	void easy()
	{
		System.out.println("�޼��� dog����~");
	}
	void sum(int kor, int eng, int mat)
	{
		int result=kor+eng+mat;
		System.out.println("�������� : "+kor+"��, �������� : "+eng+"��, �������� : "+mat+"��");
		System.out.println("�� �� : "+result+"��");
		System.out.printf("�� �� : %.2f��\n",(float)result/3);
	}
	void sum(int num1, int num2)
	{
		int result=num1+num2;
		System.out.println("�� : "+result+"\n");
	}
	void sum()
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("ù ��° ���� : ");
		int num1=scan.nextInt();
		
		System.out.print("�� ��° ���� : ");
		int num2=scan.nextInt();
		
		int result=num1+num2;
		System.out.println("�� : "+result+"\n");
	}
}