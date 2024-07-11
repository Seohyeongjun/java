package java_0711;

import java.util.ArrayList;
public class ArrayListStudy1 {

	public static void main(String[] args) {
		
//		Member member = new Member("이순신", 32, "1999. 06. 18");
//		System.out.println(member);
		
		ArrayList<Member> list = new ArrayList<>();
		
		list.add(new Member("김순신", 34, "19980805"));
		list.add(new Member("김춘추", 32, "19940306"));
		list.add(new Member("장보고", 23, "20000901"));
		list.add(new Member("이순신", 40, "19901111"));
		list.add(new Member("한석봉", 50, "19801005"));
		
		System.out.println(list);
		for(Member m :list)
		{
			if(m.getAge()>=30)
				System.out.println(m);
		}
		
		System.out.println("1995년 이후에 태어난 사람 : ");
		for(Member m : list)
		{
			String temp = (m.getBirth().substring(0, 4));
			int year = Integer.parseInt(temp);
			if(year >= 1995)
				System.out.println(m);
		}
		
		// 8월, 9월, 10월, 11월에 태어난 사람만 출력
		System.out.println();
		System.out.println("8월, 9월, 10월, 11월에 태어난 사람만 출력");
		for(Member m:list)
		{
			String temp = m.getBirth().substring(4, 6);
			int month = Integer.parseInt(temp);
			if(month>=8 && month<12)
				System.out.println(m);
		}
		
		list.add(2, new Member("김유신", 41, ""));
		System.out.println(list);
		
		// 생년월일이 없는 사람을 찾아서 그 사람의 나이를 보고 년도를 넣고
		// 0월 0일로 저장되게 하시오.
		
		for(Member m:list)
		{
			if(m.getBirth().isBlank())
			{
				int year=2024-m.getAge();
				m.setBirth(year+"0000");
			}				
		}
		
		System.out.println(list);
		
		
		
		
		
		
		
		
		
	}
}
