package java_basic;

public class basic {
	public static void main(String[] args)
	{
//		byte a=-128; //0111/1111 , -128~127
		int a=1400;
		float b=3.14f; // �Ǽ��� float, double
			
		boolean c=true;	// boolean Ÿ���� true �Ǵ� false�� ����
		
		String word="�̼���";	// String�� ������ Ÿ���� �ƴϳ� ���ڿ��� ���� �ڹٿ��� ���� Ÿ��. ���ο��� char������ �迭ȭ �Ǿ� �ִ�.
		System.out.println("String word : "+word);
		// 0000 0000 / 0000 0000 / 0000 0000 / 0000 0000
		
		System.out.println("java test "+b); /* System.out.println ����Ű syso + ( Left Ctrl + space bar ) */
		
		int width=50;
		int height=20;
		int area=width*height;
		
		System.out.println("���̴� �ʺ� "+width+" * ���� "+height+" = "+area);
		
		// Ű���带 30�� �����ؾ� �Ѵ�.
		// hp ���̹� Ű������ ������ 8000���̶�� �� ���űݾ��� ���ΰ�?
		int keyboardNum=30;
		int hpKeyboardPrice=8000;
		int total=keyboardNum*hpKeyboardPrice;
		System.out.println("Ű���� ���� : "+keyboardNum+"��, Ű���� ���� : "+hpKeyboardPrice+"��, ���� : "+total+"��");
		System.out.print("java ��¹�� : print ");
		System.out.print("����� �ڵ� �ٹٲ� �ȵ�");
		System.out.printf(" print \n �ٹٲ�\n"); // \n �� ������ Ư������, �ٸ� print�������� ��밡��
		// ���� ���� - ������������
		System.out.printf("Ű���� ���� : %d, Ű���� ���� : %d, ������ : %d", keyboardNum, hpKeyboardPrice, total);
		// %d : 10���� 
		// %u : 10���� ����
		// %f : 10���� �Ǽ�
		// %c : ����
		// %s : ���ڿ�
		// %b : boolean(true, false)
		// %o : 8���� ����
		// %x : 16���� ����
		
		System.out.printf("\n %.2f", 170.5658);	// printf�� println�̳� print�ʹ� �ٸ��� �ڸ����� ���� �� �ִ�(�Ҽ��� ���� �⺻6�ڸ�). %.(�ڸ���)f
		
		
	}
}
