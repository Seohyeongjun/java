package java_0718_1;

import java.util.Scanner;

public class ThreadStudy1 {

	public static void main(String[] args) {
		
		MyThread th = new MyThread();	// 쓰레드 객체 생성
		th.start();		// 쓰레드 실행
		
		for(int i=0; i<10; i++)
		{
			System.out.println("      나는 main "+(i+1));
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자 입력 : ");
//		int num = sc.nextInt();
//		System.out.println(num);
		
	}
}

class MyThread extends Thread
{
	@Override
	public void run()
	{
		for(int i=0; i<10; i++)
		{
			System.out.println("쓰레드~~ "+(i+1));
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}


/*
 	프로세스 - cpu에 의해 메모리(ram)에 로드 되어있는 프로그램을 말한다.
 		즉, 실행중인 프로그램 들이 프로세스이다.
 		102개의 프로세스가 있다라는 얘기는 102개의 프로그램이 실행중이다라는 얘기이다.
 		
 		내 컴퓨터에 실행중인 프로세스 확인하는 방법
 		1. 하단에 작업표시줄에서 오른쪽 마우스 클릭하여 작업관리자 선택
 			프로세스라는 탭이 있다. 
 		2. 명령프롬프트창을 열기(cmd 검색 또는 ctrl+r 후 cmd)	
 			윈도우 - tasklikst 명령어
 			
 			프로세스 종료 - taskkill/pid[pid값]		pid : 프로세서 id
 			
 	쓰레드 - 프로세스안에서 실제 동작을 수행하는 단위	
 			쓰레드를 추가하면 동시에 여러개의 동작을 수행 할 수 있다.
 			
 		자바 쓰레드
 		쓰레드 생성자
 		Thread() : 새로운 쓰레드 객체 할당
 		Thread("이름") : 새로운 쓰레드 객체를 할당 하면서 이름 부여	
 			
 			
 */ 
 
