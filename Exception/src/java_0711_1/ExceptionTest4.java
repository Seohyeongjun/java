package java_0711_1;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionTest4 {
	
	public static void main(String[] args) {

		// ���Ͽ� ����
		// br.close()�� ���ϴ� ���
		try(BufferedReader br = new BufferedReader(new FileReader("c:/test/data.txt"))) // ���� ����
		{
			String text = br.readLine();	// readLine() - ������ ���پ� �д´�.
			System.out.println(text);
		}
		catch(Exception e)
		{
			System.out.println("���� ���� ���� �� ���� ���� ����");
		}
		
//		BufferedWriter br=null;
//		try
//		{
//			br = new BufferedWriter(new FileWriter("C:/test/data.txt"));
//			String name="�̼���";
//			br.write("�̼��� 34 ����"+name.substring(10));
//			br.close();	// close�� �ؾ� �ޱ�(����)�� �ȴ�.
//		}
//		catch(Exception e)
//		{
//			System.out.println("���� ���� ���� �Ǵ� ���� ���� ����");
//			try
//			{
//				br.close();	// close()�� �ؾ� �޸𸮿��� 
//			}
//			catch(IOException e1)
//			{
//				e1.printStackTrace();
//			}			
//		}
	}
}

// ���� ó�� - �ڵ��ڿ���ȯ
// ���� �б�, ���⸦ �Ϸ��� ������ ����� �Ѵ�.
// ������ ��� ����� �������� ���� �ڿ��� �ݳ��ؾ� �Ѵ�.
// ���� �ݱ⸦ ����� �Ѵ�.
// �����ͺ��̽��� �����͸� �����ϰų� �������� ������ �ߴٸ� �ݱ⸦ ����� �Ѵ�.