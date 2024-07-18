package java_0718_1;

public class MeThread extends Thread{

	private int time;	// sleep에 적용할 시간 
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
			System.out.println("쓰레드명 : "+name+" 공유num : "+(num));
			num++;
			if(num==17)
				break;
			
			try {
				Thread.sleep(time);	// time 시간에 한번씩 반복. interrupt와 같은 개념
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
