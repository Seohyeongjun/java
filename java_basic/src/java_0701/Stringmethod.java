package java_0701;

import java.util.Scanner;
import java.util.Arrays;
public class Stringmethod {

	public static void main(String[] args) {
		// �ڹٿ��� ���ڿ��� ����Ϸ��� String Ŭ������ ����ؾ� �Ѵ�.
		// String Ŭ������ ���������� char �⺻ ������Ÿ���� �迭�� �����ǵ��� �Ǿ��ִ�.
		// char Ÿ������ ������ �迭�� ���� �迭�� ������ �Ѵ�.
		// ���α׷����� ���Ǵ� ������ �� 70%������ ���ڿ� �������̴�.
		// ���ڿ� ���� �޼���� ���� �� ������ �Ѵ�.
		
		// ���ڿ� �����͸� �����ϴ� ���
		String word = "i like banana";
//		System.out.printf("%s\n",word);
//		
//		// ���ڿ� �� -  �������ڿ��ΰ�?
//		// equals
//		System.out.println("equals : "+word.equals("i like orange"));	// i like banana�� ���� ���ƾ� true, �ƴϸ� false
//		
//		// ���ڿ� ���Կ���
//		System.out.println("contains: "+word.contains("banana"));	// i like banana �� banana�� ���Ե� �ִ°� ������ true, �ƴϸ� false
//		System.out.println("indexOf : "+word.indexOf("banana"));	// i like banana���� banana�� 7��° �ε���, ���� ���ڰ� ������ -1 ��ȯ
//		
//		// ���ڿ� ��ġ��
//		System.out.println(word+"��ġ��");
//		System.out.println(word.concat("��ġ��"));
//		
//		// Ư�� ���� �Ǵ� ���ڿ� ��ġ ã��
//		System.out.println(word.indexOf('b'));		// i like banana���� b�� 7��° �ε���
//		System.out.println(word.lastIndexOf('a'));	// ������ ���� a�� ��ġ
//		
//		// ���ڿ����� Ư�� ���� ����
//		System.out.println(word.charAt(5));		// 5��° �ε����� ����
//		
//		Scanner sc=new Scanner(System.in);
//		
//		// Ű����� �����Է� �ޱ�
//		System.out.print("���ĺ� �ϳ� �Է� : ");
//		char alp= sc.nextLine().charAt(0);		// �Է¹��� ���� �Ǵ� ���ڿ��� ù��° ����
//		System.out.println("�Է��� ���� : "+alp);
//		
//		
//		// �����ڵ� �߿��� �⺻ �����ڵ�� �ƽ�Ű�ڵ��̴�.
//		// �ƽ�Ű�ڵ�ǥ�� �� 128������
//		// �ƽ�Ű�ڵ忡�� 65�� �빮�� A, 97�� �ҹ��� a
//		// �����ڵ忡�� '��'�� 0xac00
//		char ch='��';		// �빮�� A
//		System.out.printf("%x\n",ch+0);		// ������ �ƽ�Ű�ڵ�, �����ڵ� ��ȣ�� �� �� �ִ�.
//		
//		// ���ڿ��� ����
//		System.out.println("���ڿ� ���ڼ� : "+word.length());
//		
//		// �빮�� �ҹ��� ��ȯ
//		String �빮�� = word.toUpperCase();
//		String �ҹ��� = word.toLowerCase();
//		
//		System.out.println(�빮��);
//		System.out.println(�ҹ���);
//		
//		// ���� ����
//		String word2 = ("  i hate jaava 1");
//		System.out.println(word2);
//		System.out.println(word2.trim());
//		
//		// �� �޼��� �� ���� ���� ���Ǵ� �͵�
//		// equals, contains
//		
		// ���ڿ� ����
//		System.out.println(Arrays.toString(word.split(" ")));
//		String name="�̼���@������@������@";
		
//		String[] names=name.split("@");		// @�������� ���ڿ��� ������.
//		System.out.println(names[1]);
//		
//		// word = "i like banana";
//		
//		// ���ڿ� �ڸ���(����)
//		System.out.println(word.substring(2));		// 2�� �ε��� ���� ����
//		System.out.println(word.substring(6));		// 6�� �ε��� ���� ����
//		System.out.println(word.substring(2, 6));	// 2�� �ε������� 6�� �ε��� ������(5���ε�������) ����
//		
//		// ���ڿ� ��ȯ
//		String �ǻǻ� = "�ƺ��� ����� �� �ǻǻ� ������ �Ⱦ��൵ �ǻǻ� ������ �ݰ��ٰ� �ǻǻ�";
//		
//		String ���� = �ǻǻ�.replace("�ǻǻ�", "�׻׻�");
//		System.out.println(����);
//		
//		���� = ����.replaceAll("�׻׻�", "������");
//		System.out.println(����);
//		
//		// replaceAll������ ����ǥ���� ��밡��
//		/*
//		  < ����ǥ���� >
//		  ^ - ���ڿ��� ����
//		  $ - ���ڿ��� ����
//		  . - ������ �� ����
//		  * - �� ���ڰ� �ְų� ���ų� (*�� -> '��'�� ������ �ܾ�)
//		  + - �� ���ڰ� �ϳ� �̻�
//		  ? - �� ���ڰ� ���ų� �ϳ� ����
//		  [] - ������ �����̳� ������ ��Ÿ��
//		  {} - Ƚ�� �Ǵ� ����
//		  () - �Ұ�ȣ�� ���ڸ� �ϳ��� ���ڷ� �ν�
//		  | - ���� �ȿ��� �Ǵ� ���� ����
//		  \s - ���鹮��
//		  \S - ���鹮�ڰ� �ƴ� ������ ����
//		  \w - ���ĺ��̳� ����
//		  \W - ���ĺ��̳� ���ڸ� ������ ����
//		  \d - ����
//		  \D - ���ڸ� ������ ��� ���� 
//		 */
//		
//		// ���ڿ����� ���ڸ� ���� - replace("[0-9]","")
//		// ����ó - ^010-\d{4}-\d{4}$
//		// �ѱ۸� �ۼ� Ȯ�� - ^[��-�H]
//		
//		String a ="abc78jd456fd";
//		System.out.println(a);
//		System.out.println(a.replaceAll("[0-9]",""));
//		System.out.println(a.replaceAll("[\\D]",""));
		 
		
		String str = "�� �̸��� [ȫ�浿]�Դϴ�. ���̴� [15]�� �Դϴ�.";
		String name;
		int age;
		
		System.out.println("ȫ�� index ��ȣ : "+str.indexOf('ȫ'));
		System.out.println("���� index ��ȣ : "+str.lastIndexOf('��'));
		name=str.substring(str.indexOf('ȫ'),str.lastIndexOf('��')+1);
		System.out.println(name);
		
		System.out.println("[15] �� 1�� index ��ȣ : "+str.indexOf('1'));
		System.out.println("[15] �� 5�� index ��ȣ : "+str.lastIndexOf(']'));
		age=Integer.parseInt(str.substring(str.lastIndexOf('[')+1,str.lastIndexOf(']')));
		System.out.println(age);
		
		
//		System.out.println(name);
//		System.out.println(age);
//		
	}

}
