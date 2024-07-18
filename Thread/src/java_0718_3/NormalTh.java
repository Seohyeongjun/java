package java_0718_3;

import java.util.Scanner;

public class NormalTh extends Thread {

	private String name;
	
	public NormalTh(String name)
	{
		super(name);
		this.name=name;
	}
	
	@Override
	public void run()
	{
		System.out.println("쓰레드명 : "+name);
		
		DaemonTh th = new DaemonTh();
		th.setDaemon(true);
		th.start();
		
		Scanner sc =  new Scanner(System.in);
		for(int i=0; i<3; i++)
		{	
			System.out.println("아무거나 입력 : ");
			String word = sc.nextLine();
			System.out.println(word);
		}
			
	}
}
