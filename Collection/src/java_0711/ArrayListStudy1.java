package java_0711;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListStudy1 {

	public static void main(String[] args) {
		
//		Member member = new Member("�̼���", 32, "1999. 06. 18");
//		System.out.println(member);
		
		ArrayList<Member> list = new ArrayList<>();
		
		list.add(new Member("�����", 34, "19980805"));
		list.add(new Member("������", 32, "19940306"));
		list.add(new Member("�庸��", 23, "20000901"));
		list.add(new Member("�̼���", 40, "19901111"));
		list.add(new Member("�Ѽ���", 50, "19801005"));
		
		System.out.println(list);
		for(Member m :list)
		{
			if(m.getAge()>=30)
				System.out.println(m);
		}
		
		System.out.println("1995�� ���Ŀ� �¾ ��� : ");
		for(Member m : list)
		{
			String temp = (m.getBirth().substring(0, 4));
			int year = Integer.parseInt(temp);
			if(year >= 1995)
				System.out.println(m);
		}
		
		// 8��, 9��, 10��, 11���� �¾ ����� ���
		System.out.println();
		System.out.println("8��, 9��, 10��, 11���� �¾ ����� ���");
		for(Member m:list)
		{
			String temp = m.getBirth().substring(4, 6);
			int month = Integer.parseInt(temp);
			if(month>=8 && month<12)
				System.out.println(m);
		}
		
		list.add(2, new Member("������", 41, ""));
		System.out.println(list);
		
		// ��������� ���� ����� ã�Ƽ� �� ����� ���̸� ���� �⵵�� �ְ�
		// 0�� 0�Ϸ� ����ǰ� �Ͻÿ�.
		
		for(Member m:list)
		{
			if(m.getBirth().isBlank())
			{
				int year=2024-m.getAge();
				m.setBirth(year+"0000");
			}				
		}
		
		System.out.println(list);
		System.out.println();
		
		Member t = new Member("�庸��", 0, "0");
		
		System.out.println(list.indexOf(t));	// equals�� �� �� ����(����ڰ� Override�� equals �޼���)
		System.out.println(list.contains(t));	// equals�� �� �� ����
		
		list.forEach(m -> System.out.println(m));
		System.out.println();
			
		Member[] mem = list.toArray(new Member[list.size()]);
		
		for(Member mm : mem)
			System.out.println(mm);
		
		// ����
//		Collections.sort(list);
		System.out.println("���� ��");
		list.forEach(m -> System.out.println(m));
		
		
		
		
		
		
		
		
		
		
	}
}
