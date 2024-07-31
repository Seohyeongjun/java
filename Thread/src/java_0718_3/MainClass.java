package java_0718_3;

public class MainClass {

	public static void main(String[] args) {
		
		NormalTh nm = new NormalTh("일반");
		nm.start();
		
		
//		DaemonTh dm = new DaemonTh();
//		dm.setDaemon(true);	// 주 쓰레드(현재 클래스)의 영향을 받는다. main매서드 종료시 쓰레드 종료
//		
//		dm.start();
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("main 종료");
	}
}
