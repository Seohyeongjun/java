package java_0715_3;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetStudy {

	public static void main(String[] args) {
		
		TreeSet<Integer> tree = new TreeSet<>();
		tree.add(34); tree.add(45); tree.add(20);
		tree.add(9); tree.add(40); tree.add(15);
		tree.add(48); tree.add(2); tree.add(11);
		tree.add(39); tree.add(4);
		
		
		System.out.println(tree);
		System.out.println(tree.first());
		System.out.println(tree.last());
		
		// �Է°����� ū �� �߿��� ���� ����� �� �˻�
		System.out.println(tree.higher(25));
		System.out.println(tree.lower(44));
		
		// �Է°����� ���� ��� ��
		System.out.println(tree.headSet(35));
		System.out.println(tree.tailSet(30));
		
		System.out.println(tree.subSet(10, 39));
		System.out.println(tree);
		
		TreeSet<String> word = new TreeSet<>();
		word.add("�̼���");	word.add("������");
		word.add("�庸��");	word.add("������");
		word.add("������");	word.add("���س�");
		word.add("���깮");	word.add("������");
		word.add("���ƾ�");
		
		System.out.println(word.higher("��"));
		System.out.println(word.headSet("���"));
		System.out.println(word.subSet("��", "��"));
		
		System.out.println(word.subSet("��", "��"));	// ����ȵ�
		
		System.out.println(word);
		
		/////////////////////////////////////////
		//
		// 90�� �̻� - ����10%, 
		// 70�� �̻� - ���� 30%
		// 40�� �̻� - ���� 80%
		//
		
		Scanner sc =  new Scanner(System.in);
		
		TreeSet<Integer> rank = new TreeSet<>();
		rank.add(90); rank.add(70); rank.add(40);
		
		// ���� ������ �Է��Ͽ� ���� �� �������� ���
		
		System.out.print("\n���� ���� �Է� : ");
		int num = sc.nextInt();
		
		System.out.println(rank.lower(num+1));	// +1 ����� ��
		if(num>=rank.last())
			System.out.println("���� 10%");

		else if(rank.lower(num+1)>=70)		// +1 ����� ��
			System.out.println("���� 30%");

		else if(num+1 >= rank.first())
			System.out.println("���� 80%");
		
		else
			System.out.println("���� ��");

		/////////////////////////////////////
		
		TreeSet<String> score = new TreeSet<>();
		
		score.add("89�� �̼���");	score.add("67�� ������");
		score.add("45�� ������");	score.add("98�� �Ѽ���");
		score.add("72�� �ڹ���");	score.add("81�� ������");
		score.add("59�� �̼���");	score.add("32�� �����");
		// �� ������ �Է��ϰ� ������ ������ ���� ����� ���
		sc.nextLine();
		System.out.print("\n���� ���� �Է� : ");
		String num2 = sc.nextLine();
		
		System.out.println(score.tailSet(num2));
			
		
		
	}
}


/*
	Tree ������ �̿��Ͽ� ���� �����Ű�� TreeSet
	- ���������� ������ �������� �ʴ´�.
	- �ߺ�������� ����
	- ����Ʈ���� ����ϱ� ������ �����Ͱ� ���ĵǾ� ���
	- ���� �˻� �Ǵ� ������ �ߺ����� �� ���Ŀ� �����ϴ�.
	
 
 */
