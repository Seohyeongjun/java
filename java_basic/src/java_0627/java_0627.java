package java_0627;

public class java_0627 {
	public static void main(String[] args)
	{
		System.out.println(10/(float)4);
		System.out.println(10 == 5);	// �񱳿��� ����� true, false�� ���´�.
		String name1="������";
		String name2="�̼���";
		System.out.println(name1.equals(name2));	// ���ڿ� �񱳹��
		System.out.println(5&3);	// AND ����
		System.out.println(4|6);	// OR
		System.out.println(7^2);	// XOR
		System.out.println(~5);		// 0101 -> 1010 
		System.out.println(~-5);	// 1011 -> 0100
		
		int red=188;
		int green=229;
		int blue=92;
		
		int color=(red<<16) | (green<<8) | blue;	// #BCE55C
		System.out.printf("#%06X \n", color);		//16���� 6�ڸ�
		System.out.printf("#%06o \n", color);		// 8���� 
		System.out.printf("#%06d \n", color);		// 10���� 
		System.out.print(color);
	}
}
