package java_0703;

public class Method_4 {

	public static void main(String[] args) {
		
		// �޼��带 ���ؼ� ����10�� �޾� ���
		ReturnMth returnMth=new ReturnMth();
		int num=returnMth.get();
		System.out.println(num);
		
		// �޼���κ��� �� ������ ���ϱ� ��� �޾Ƽ� ���
		num=returnMth.add();
		System.out.println(num);
		
		// ������ ����ǥ�� �� �ڵ带 �ۼ��Ͽ� �̸��� ���̰� ��µǰ� �� ��
		String userName = returnMth.getName();
		int age=34;
		System.out.println(userName +" "+age);
		System.out.println();
		// ����(89), ����(78), ����(50) �� ������ ������ ���ϴ� �޼���(1)
		// �� ������ ����� ���ϴ� �޼���(2)
		// ������ ����� ����Ͻÿ�
		int total=returnMth.total();
		int avg=returnMth.avg(total);
		System.out.println("���� : "+total+"\n��� : "+avg);

		/*
		 �ֻ��� ����
		 
		 j���ذ� s�����̰� �ֻ��� ������ �Ѵ�.
		 �ֻ����� �ϳ�, �����̴�.
		 �ֻ����� ���� ū ����� �̱��.(����)
		 
		 �ֻ��� �� ���ϴ� �޼���
		 
		 �ֻ��� �� ���Ͽ� ���� �̰���� ����ϴ� �޼���	 
		 
		 */
		

	}
}

class ReturnMth
{
	int avg(int total)
	{
		int avg = total/3;
		return avg;
	}
	int total()
	{
		int kor=89, eng=78, math=50;
		int total=kor+eng+math;
		System.out.println("���� : "+kor+", ���� : "+eng+", ���� : "+math);
		return total;
	}
	String getName()
	{
		String name="�̼���";
		return name;
	}
	int add()
	{
		int num1=30;
		int num2=40;
		
		return num1+num2;
	}
	int get()
	{	
		return 10;
	}
}
