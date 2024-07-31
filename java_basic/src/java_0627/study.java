package java_0627;

import java.util.Scanner;

// 제어문
public class study {
	public static void main(String[] args)
	{
		// 시험 합격 기준 - 합격(60점 이상), 불합격(60점 미만)
		
		int score=72;
		
		if(score>=60)
			System.out.printf("점수 : %d점으로 합격\n", score);
		else
			System.out.printf("점수 : %d점으로 불합격\n", score);

		////////////////////////////////////////////////////////////
		String button="종료";
		
		switch(button)
		{
			case "시작" : System.out.println("게임 시작\n");
						break;
			case "저장" : System.out.println("게임 저장\n");
						break;
			case "종료" : System.out.println("게임 종료\n");
						break;
		}
		////////////////////////////////////////////////////////////
		// 가로와 세로의 길이를 키보드로 입력하세요.
		// 가로 또는 세로의 길이가 크다면 직각사각형
		// 가로와 세로의 길이가 같다면 정사각형 이라고 출력
		// switch문으로 (if문 사용x)
		Scanner input=new Scanner(System.in);
		int width;
		int height;
		int result;
		
		System.out.print("가로 길이 : ");
		width=input.nextInt();
		System.out.print("세로 길이 : ");
		height=input.nextInt();
		
		result=width-height;
		switch(result)
		{
			case 0 : System.out.println(">> 정사각형");
					break;

			default : System.out.println(">> 직사각형");
					break;
		}
		
		
		
	}
	
}
