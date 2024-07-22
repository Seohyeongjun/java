package Reservation;

public class Member {

	private String date;
	private String time;
	private String name;
	private String phoneNum;
	private String tableNum;
	
	public Member(String date, String time, String name, String phoneNum, String tableNum)
	{
		this.date=date;
		this.time=time;
		this.name=name;
		this.phoneNum=phoneNum;
		this.tableNum=tableNum;		
	}
	
	@Override
	public String toString()
	{
		return "\n-------------------------------------------\n"
				+"������ : "+date+"\t �ð� : "+time+"(��, ��)\n("+tableNum+"�� ���̺�) \t���� : "+name+"("+phoneNum+")"
				+"\n-------------------------------------------";
	}
}
