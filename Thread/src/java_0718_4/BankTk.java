package java_0718_4;

public class BankTk implements Runnable{

	Money money = new Money();
	
	@Override
	public void run()
	{
		while(money.getMyMoney()>0)
		{
			int widthraw_money=(int)((Math.random()*3)+1)*1000;
			
			if(money.widhdraw(widthraw_money))
			{
				System.out.println(Thread.currentThread().getName()+" -> ��� : "+widthraw_money
							+", �ܾ� : "+money.getMyMoney());
			}
			else
			{
				System.out.println("��� �ź� - �ܾ׺���");
			}
		}
	}
}
