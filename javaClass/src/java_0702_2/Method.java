package java_0702_2;

public class Method {

	public static void main(String[] args) {
		
		int num=300;
		output(num);
		
		JavaMethod ja=new JavaMethod();
		ja.output();
		
//		gender(990101-123456);

	}
	
	static void output(int num)
	{
		System.out.println("���� �޼��� �Դϴ�.(1)"+num);
	}
}

class JavaMethod
{	
	static void output()
	{
		System.out.println("���� �޼��� �Դϴ�.(2)");	
	}
}
// main �޼��� -> JVM




// �ڹ� �޼���
// ��ȯŸ�� �޼����̸�(�Ű�����){ }
// ��ȯŸ�� - int, short, float, double, char, boolean, void, String
//		�޼����� return ������ Ÿ��
//		
/*
	990101-123456
	�ֹι�ȣ�� �������� �������� ����
*/	
/*
public static String gender(String junmin)
{
	String gen = junmin.substring(7, 8);
	
	if(gen.equals("1") || gen.equals("3"))
		return "����";
	else if(gen.equals("2") || gen.equals("4"))
		return "����";
	
	return "ȥ��";
}
*/
