package java_0712;

public class Asset {

	private String bank;
	private int balance;
	private String accontNum;
	private String holder;
	
	public Asset(String bank, String accontNum, String holder, int balance)
	{
		this.bank=bank;
		this.balance=balance;
		this.accontNum=accontNum;
		this.holder=holder;
	}
	
	@Override
	public String toString()
	{
		return bank+"("+accontNum+"), "+balance+", "+holder;
	}
///////////////////////////////	
	@Override
	public boolean equals(Object o)
	{
		Asset temp = (Asset)o;
		boolean isBank = this.bank.equals(temp.bank);
		if(isBank)
			isBank = this.holder.equals(temp.holder);
		return isBank;
	}
/////////////////////////////////
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getAccontNum() {
		return accontNum;
	}
	public void setAccontNum(String accontNum) {
		this.accontNum = accontNum;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	
}
