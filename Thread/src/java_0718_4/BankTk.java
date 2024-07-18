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
				System.out.println(Thread.currentThread().getName()+" -> 출금 : "+widthraw_money
							+", 잔액 : "+money.getMyMoney());
			}
			else
			{
				System.out.println("출금 거부 - 잔액부족");
			}
		}
	}
}
