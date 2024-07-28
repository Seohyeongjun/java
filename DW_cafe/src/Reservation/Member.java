package Reservation;

public class Member {

	private String date;
	private String time;
	private static String name;
	private static String phoneNum;
	private static String tableNum;
	
	public Member(String date, String time, String name, String phoneNum, String tableNum)
	{
		this.date=date;
		this.time=time;
		this.name=name;
		this.phoneNum=phoneNum;
		this.tableNum=tableNum;		
	}
	public String getDate()
	{
		return date;
	}
	
	public String getTime()
	{
		return time;
	}
	
	public static String getName()
	{
		return name;
	}
	
	public static String getPhoneNum()
	{
		return phoneNum;
	}
	
	public static String getTableNum()
	{
		return tableNum;
	}
	
	@Override
	public String toString()
	{
		return "\n-------------------------------------------\n"+"��������\n"
				+"������ : "+date+"\t �ð� : "+time+"(��, ��)\n("+tableNum+"�� ���̺�) \t���� : "+name+"("+phoneNum+")";
	}
}
