package java_0718_3;

public class MainClass {

	public static void main(String[] args) {
		
		NormalTh nm = new NormalTh("�Ϲ�");
		nm.start();
		
		
//		DaemonTh dm = new DaemonTh();
//		dm.setDaemon(true);	// �� ������(���� Ŭ����)�� ������ �޴´�. main�ż��� ����� ������ ����
//		
//		dm.start();
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("main ����");
	}
}
