package java_0718_4;

public class Money {

	private int myMoney = 10000;
	
	public int getMyMoney()
	{
		return myMoney;
	}
	
	//widhdraw�޼��忡�� �Ӱ迵������ ����
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
			// ���
			myMoney -= money;
			return true;
		}
		return false;	// ��� ����(�� ����)
		
	}
	
}
