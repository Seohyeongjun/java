package reserve;

import java.util.ArrayList;
import java.util.List;

public class Reserve {

	private int reserveNum;
	private String day;
	public final int oneDayPrice=50000;
	private int price;
	private int siteNum;
	private int dayCount;
	
	public Reserve(int reserveNum, String day, int dayCount, int site){
		this.reserveNum=reserveNum;
		this.day=day;
		this.dayCount=dayCount;
		this.siteNum=site;
		this.price=oneDayPrice*dayCount;
	}
	
	public Reserve() {}
	
	
	public int getDayCount() {
		return dayCount;
	}

	public void setDayCount(int dayCount) {
		this.dayCount = dayCount;
	}

	public int getReserveNum() {
		return reserveNum;
	}
	public void setReserveNum(int reserveNum) {
		this.reserveNum = reserveNum;
	}
	public String toString() {
		return "\n예약번호 : "+reserveNum+" (구역 : "+siteNum+", 요일 : "+day+"("+dayCount+"일), \n가격 : "+price+"원\n";
	}

	public String getDay() {
		return day;
	}
	public void setDy(String day) {
		this.day = day;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getSiteNum() {
		return siteNum;
	}
	public void setSiteNum(int siteNum) {
		this.siteNum = siteNum;
	}
}
