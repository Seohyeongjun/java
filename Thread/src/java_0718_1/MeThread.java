package java_0718_1;

public class MeThread extends Thread{

	private int time;	// sleep�� ������ �ð� 
//	private String name;
	public static int num=10;
	
	public MeThread(int time, String name)
	{
		super(name);
		this.time=time;		
	}
	
	@Override
	public void run()
	{
		String name = Thread.currentThread().getName();
		
		while(true)
		{			
			System.out.println("������� : "+name+" ����num : "+(num));
			num++;
			if(num==17)
				break;
			
			try {
				Thread.sleep(time);	// time �ð��� �ѹ��� �ݺ�. interrupt�� ���� ����
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
