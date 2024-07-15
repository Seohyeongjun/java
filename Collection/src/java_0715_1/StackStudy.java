package java_0715_1;

import java.util.Scanner;
import java.util.Stack;

public class StackStudy {
	
	public static void main(String[] args) {
		
//		Stack<String> st = new Stack<>();
//		
//		st.add("이순신");
//		st.push("김유신");
//		st.push("김춘추");
//		st.push("장보고");
//		st.push("김종서");
//		
//		System.out.println(st);
//		System.out.println(st.pop());
//		System.out.println(st);
//		System.out.println(st.search("김춘추"));
//		
//		System.out.println(st.size());
//		
//		for(int i=0; i<(st.size()-st.search("김춘추")); i++)
//		{
//			st.pop();
//			System.out.println(st);
//		}
//		
//		System.out.println(st.isEmpty());
		
		Stack<String> pre = new Stack<>();
		Stack<String> back = new Stack<>();
		String now = "네이버";
		
		Scanner sc =  new Scanner(System.in);
		
		while(true)
		{
			System.out.print("\n이동페이지 입력 (1.뒤, 2.앞) : ");
			String temp = sc.nextLine();
			
			if(temp.equals("1") && !back.isEmpty())	// 이전 페이지 이동
			{
				pre.push(now);
				now=back.pop();			
			}
			else if(temp.equals("2") && !pre.isEmpty())	// 앞 페이지 이동
			{
				back.push(now);
				now=pre.pop();
			}
			else	// 새 페이지 이동
			{
				back.push(now);
				pre.clear();
				now = temp;
			}
			
			System.out.println("\n현재 페이지 : "+now);
			System.out.println("back 페이지 : "+back);
			System.out.println("pre 페이지 : "+pre);
		}
	}

}

/* 
	stack
	
	데이터를 저장하기 위한 입구와 출력하기 이한 출구가 같다.
	
	한곳을 통해 저장과 출력이 이루어지는 구조
	

*/
