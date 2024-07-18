package java_0718_4;

public class Money {

	private int myMoney = 10000;
	
	public int getMyMoney()
	{
		return myMoney;
	}
	
	//widhdraw메서드에서 임계영역으로 설정
	public synchronized boolean widhdraw(int money)
	{
		if(myMoney >= money)
		{	
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
			//	e.printStackTrace();
			}
			// 출금
			myMoney -= money;
			return true;
		}
		return false;	// 출금 실패(돈 부족)
		
	}
	
}
