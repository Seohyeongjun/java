package java_0718_1;

public class ThreadStudy3 {

	public static void main(String[] args) {
		
		MeThread thread1 = new MeThread(2000, "■");	// 쓰레드 선언 및 실행 시간
		MeThread thread2 = new MeThread(3000, "□");
		
		thread1.start();
		
		try {
			thread1.join();	// join() 대기(순차적 실행)
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		thread2.start();
//		
//		try {
//			thread2.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		thread2.start();
//		while(true)
//		{
//			System.out.print("");
//			int num = MeThread.num;
//			
//			if(MeThread.num==15)
//			{
//				thread1.stop();
//				thread2.stop();
//				break;
//			}
//		}	
		
	}
}

/*
 
 * sleep(ms) - 지정된 시간(ms)만큼 대기
 * start() - 쓰레드 시작, run 메서드 호출
 * join() - 해당 쓰레드가 끝날때까지 다음 쓰레드 대기
 * run() - 쓰레드가 실행하는 함수
 * stop() - 쓰레드를 중단 (미권장)
 * interrupt() - 쓰레드 중단
 * setPriority(정수값) - 쓰레드의 우선수위 
 * getPriority() - 설정된 쓰레드 우선순위 값
 * isAlive() - 현재 쓰레드가 살아있는지 확인(종료의 유무. 종료 - false)
 * 
 * suspend() - 쓰레드를 일시 정지 시킨다. (미권장)	
 * resume() - 일시정지된 쓰레드를 실행	(미권장)
 * 
 * yield() - 다른 쓰레드에게 실행 상태를 양보하고 대기
 * notify() - 대기 상태에 있는 쓰레드를 실행 대기로 변환
 * 			  실행 대기에 있는 쓰레드는 싱행 상태로 변환
 * 
 * 
 * 
	
 */








