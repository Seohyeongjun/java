package java_0718_1;

public class ThreadStudy3 {

	public static void main(String[] args) {
		
		MeThread thread1 = new MeThread(2000, "��");	// ������ ���� �� ���� �ð�
		MeThread thread2 = new MeThread(3000, "��");
		
		thread1.start();
		
		try {
			thread1.join();	// join() ���(������ ����)
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
 
 * sleep(ms) - ������ �ð�(ms)��ŭ ���
 * start() - ������ ����, run �޼��� ȣ��
 * join() - �ش� �����尡 ���������� ���� ������ ���
 * run() - �����尡 �����ϴ� �Լ�
 * stop() - �����带 �ߴ� (�̱���)
 * interrupt() - ������ �ߴ�
 * setPriority(������) - �������� �켱���� 
 * getPriority() - ������ ������ �켱���� ��
 * isAlive() - ���� �����尡 ����ִ��� Ȯ��(������ ����. ���� - false)
 * 
 * suspend() - �����带 �Ͻ� ���� ��Ų��. (�̱���)	
 * resume() - �Ͻ������� �����带 ����	(�̱���)
 * 
 * yield() - �ٸ� �����忡�� ���� ���¸� �纸�ϰ� ���
 * notify() - ��� ���¿� �ִ� �����带 ���� ���� ��ȯ
 * 			  ���� ��⿡ �ִ� ������� ���� ���·� ��ȯ
 * 
 * 
 * 
	
 */








