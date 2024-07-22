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
				+"예약일 : "+date+"\t 시간 : "+time+"(시, 분)\n("+tableNum+"번 테이블) \t고객명 : "+name+"("+phoneNum+")"
				+"\n-------------------------------------------";
	}
}
