package java_0718_1;

import java.util.Scanner;

public class ThreadStudy2 {

	public static void main(String[] args) throws InterruptedException {
		
		AAA aaa = new AAA();		// 일반 클래스 객체 생성
		new Thread(aaa).start();	// 쓰레드 객체 생성
		
		for(int i=0; i<5; i++)
		{
			System.out.println("AAA - "+(i+1));
			Thread.sleep(2000);
		}
	}
}


class AAA implements Runnable
{
	@Override
	public void run() {
		System.out.print("숫자 입력 : ");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("입력 숫자 : "+num);
		
		
		
	}
	
}