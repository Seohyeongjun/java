package java_0710_3;

public class ExceptionTest1 {
	
	public static void main(String[] args) {
		
		
		
		try		// ������ �߻��� �� ���� �κ��� try�ȿ� �ִ´�.
		{
			String name=null;
			String a="aaa";
			String b="bbb";
			String c="ccc";
			
			name.length();			
			a.length();
			b.length();
			c.length();
			
			System.out.println(10/0);			
			
		}
		
		// catch�� else if�� ���� ������ �� �� �ִ�.
		catch(NullPointerException b)
		{
			b.printStackTrace();	// �����޽��� Ȯ�� - �׽�Ʈ��
			System.out.println(b.getMessage());
			System.out.println(b.getClass());
			
			System.out.println("���ڿ��� �Է� �Ͻÿ�");
		}
	
		catch(Exception a)	// 10/0�� ����ó��(����)��  ArithmeticException������ �ֻ��� ����ó���� Exception���� �ص� �ȴ�. a�� ��������
		{
			System.out.println("0���� ������ �ϸ� �ȵ�");
		}
		
	
		System.out.println("���Ⱑ ���α׷� ��");
		
		
	}
}

/*
 * ����ó��
 * - ���α׷� ���� �߿� ������ �߻��ϸ� ��� ���α׷� ����
 * 		����ó���� ���ָ� ������ ����ϵ� ���α׎C�� ������� �ʴ´�.
 * 
 * - ����ڰ� �߸��� ���� �Է��ϴ� ��쿡 �˷��� �� �ִ�.
 * 
 * - ������ ������ �ذ��ϴ� ����� �ƴϰ�, ȸ���ϴ� ����̴�. 
 *  
 */
