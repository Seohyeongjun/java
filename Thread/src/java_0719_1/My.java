package java_0719_1;

public class My extends Thread{

	private Thread target;
	
	public My(String name, Thread target)
	{
		super(name);
		this.target=target;
	}
	
	@Override
	public void run()
	{
		for(int i=0; i<200000000; i++);
		for(int j=0; j<200000000; j++);
		try 
		{
			Thread.sleep(2000);;
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		try
		{
			target.join();  	// target의 쓰레드가 종료될 때가지 다른 쓰레드는 대기
		}
		catch(InterruptedException e)
		{
			for(int i=0; i<200000000; i++);
			for(int j=0; j<200000000; j++);
		}
	}
	
}
