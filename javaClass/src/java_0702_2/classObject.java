package java_0702_2;

public class classObject {

	public static void main(String[] args) {
		System.out.println("< ������ > : "+Car.������);
		System.out.println();
		
		Car car1;		
		car1=new Car(0);
		
//		car1.������="���";
//		car1.carName="�Ÿ";
//		car1.��ⷮ=2000;
//		car1.����="�ֹ���";
		
		System.out.println("< ������ > : "+car1.������+"\n* �ڵ����� : "+car1.carName+"\n* ��ⷮ : "+car1.��ⷮ+"cc\n* ���� : "+car1.����); 	
		System.out.println();
		
		Car car2=new Car("�׷���", 3000, "�ֹ���");
		System.out.println("< ������ > : "+car2.������+"\n* �ڵ����� : "+car2.carName+"\n* ��ⷮ : "+car2.��ⷮ+"cc\n* ���� : "+car2.����); 	
//////////////////////////////////////////////////////////////////////////////////////
		/*
		������: 	�̸�		����Ʈ	����
				��ǿ�	4580	4.3
				�����	3485	4.1
				�����	90930	2.7
				������	19200	3.1
				
				���Ҽ� �۰����� ������ ������, �Ҽ� ��Ƚ���� �ٸ� ����Ʈ �����̴�.
				�� ������ ���� �� �� �ִ� Ŭ������ �����ϰ� ������ �Է� �� ����Ͻÿ�.
				(�Ű����� �ִ� ������ �޼���� �� �� �̻� ����)		
		*/
				
//		WebToon webToon1 = new WebToon("��ǿ�", 4580, 4.3f);
		WebToon webToon1_1 = new WebToon("��ǿ�");
		WebToon webToon1_2 = new WebToon(4580, (float)4.3);
		WebToon webToon2_1 = new WebToon("�����");
		WebToon webToon2_2 = new WebToon(3485, 4.1f);
		WebToon webToon3_1 = new WebToon("�����");
		WebToon webToon3_2 = new WebToon(90930, 2.7f);
		WebToon webToon4_1 = new WebToon("������");
		WebToon webToon4_2 = new WebToon(19200, (float)3.1);
		
		

		System.out.println("\n�̸�	����Ʈ	����");
		System.out.println(webToon1_1.name+"	"+ webToon1_2.point+"	"+ webToon1_2.score);
		System.out.println(webToon2_1.name+"	"+ webToon2_2.point+"	"+ webToon2_2.score);
		System.out.println(webToon3_1.name+"	"+ webToon3_2.point+"	"+ webToon3_2.score);
		System.out.println(webToon4_1.name+"	"+ webToon4_2.point+"	"+ webToon4_2.score);
		
//		System.out.println(webToon1);


//		System.out.println("\n�̸�	����Ʈ	����");
//		System.out.println("����������������������������������������");		
//		WebToon webToon1_1 = new WebToon("��ǿ�");
//		System.out.print(webToon1_1.name+"	");
//		webToon1_1 = new WebToon(4580, 4.3);
//		System.out.println(webToon1_1.point+"	"+ webToon1_1.score);
//		webToon1_1 = new WebToon("�����");
//		System.out.print(webToon1_1.name+"	");
//		webToon1_1 = new WebToon(3485, 4.1);
//		System.out.println(webToon1_1.point+"	"+ webToon1_1.score);
//		webToon1_1 = new WebToon("�����");
//		System.out.print(webToon1_1.name+"	");
//		webToon1_1 = new WebToon(90930, 2.7);
//		System.out.println(webToon1_1.point+"	"+ webToon1_1.score);
//		webToon1_1 = new WebToon("������");
//		System.out.print(webToon1_1.name+"	");
//		webToon1_1 = new WebToon(19200, 3.1);
//		System.out.println(webToon1_1.point+"	"+ webToon1_1.score);

	}
}

// Ŭ���� ���ο� ����Ǵ� ����(�Ǵ� �迭)�� �� ������ �ִ�
// Ŭ���� ����, �ν��Ͻ� ����
// �ν��Ͻ������� Ŭ���� ��ü ������ �޸� �Ҵ�ȴ�.
// Ŭ���� ��ü ������ new�����ڸ� ���Ѵ�.

// ������ �޼��� - ��ü(�ν��Ͻ�) ������ ������ �� ���� �ʱ�ȭ ���ִ� �޼���
// �����ε� - Ŭ������� Ŭ���� ���� �ټ��� �ż����� �̸��� ����.
// �����ε� - �����ε� ���� ����
//		1. ���� Ŭ���������� �����ϴ�.
//		2. �޼����� �̸��� ���ƾ� �Ѵ�.
//		3. �Ű������� Ÿ���� �ٸ��� ����Ǿ�� �Ѵ�.
//		4. �Ű������� ������ �޶�� �Ѵ�.
class Car{
	static String ������ = "����";	// Ŭ���� ����
	
	String carName; 		// �ν��Ͻ� ����
	int ��ⷮ;				// �ν��Ͻ� ����
	String ����;				// �ν��Ͻ� ����
	
	Car(int num)			// ������ �޼���
	{
		if(num==0)
		{
			carName="�Ÿ";
			��ⷮ=2000;
			����="�ֹ���";
		}
		else
		{
			carName="�׷���";
			��ⷮ=3000;
			����="�ֹ���";			
		}				
	}
	
	
	Car(String name, int cc, String fuel)
	{
		this.carName=name;
		this.��ⷮ=cc;
		this.����=fuel;
	}
}

class WebToon
{
	String name;
	int point;
	float score;
	
	WebToon(String name)
	{
		this.name=name;
	}
	
	WebToon(int point, float score)
	{
		this.point=point;
		this.score=score;
	}
	
	public String toString()
	{
		return name+"	"+ point+"	"+ score;
	}
}