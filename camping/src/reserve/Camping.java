package reserve;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Camping {
/*
 * 캠핑장 예약 관리 프로그램
 * 캠핑장내 텐트 구역은 총 30개
 * 매주 수요일은 휴무
 * 예약 프로그램 동작이 되기 위한 클래스와 인터페이스들을 만들어서 구형 * 
 * */
/*
 * 날짜(연, 월, 일)
 * 가격(1박 8만원, 10만원)
 * 구역(2사이트)
 * 
 * */	
	public static int reserveNum=0;
//	private final Reserve reserve ;
	public static Reserve reserve = new Reserve();
	
	static List<Reserve> list = new ArrayList<>();
	
	public Camping(Reserve reserve) {
		this.reserve=reserve;
	}
	
	public static void main(String[] args) {
		System.out.println("DW캠핑장에 오신것을 환영합니다.");		
		int checkR = 0;
		
		while(true) {
			checkR=check();
			
			if(checkR==1){
				System.out.print("\n예약번호를 눌러 주세요 : ");
				Scanner input = new Scanner(System.in);
				int reserveNum=input.nextInt();
				
				reserveCheck(reserveNum);
			}
			else if(checkR==2) {
				campReserve();
			}
			else
				System.out.println("\n1 또는 2를 선택하세요");
		}
	}
	
	private static void reserveCheck(int reserveNum) {
	
		for(Reserve r:list) {
			if(r.getReserveNum()==reserveNum) {
				System.out.println(r);
			}
		}		
	}
		
	private static void campReserve() {
		Scanner input = new Scanner(System.in);
		String day=null;
		int dayCount=0;
		boolean reserveOk=true;
		
		System.out.println("\n예약을 진행합니다.");
		System.out.println("-- 예약번호 : "+(++reserveNum));

		while(true) {
			System.out.print("\n매주 수요일은 휴무!!\n예약요일 선택 : ");	
			day = input.nextLine();
			
			if(day.contains("수")) {
				System.out.println("수요일은 정기휴일 입니다.");
			}
			else {	
				if(day.contains("월")) dayCount++;
				if(day.contains("화")) dayCount++;
				if(day.contains("목")) dayCount++;
				if(day.contains("금")) dayCount++;
				if(day.contains("토")) dayCount++;
				if(day.contains("일")) dayCount++;

				break;
			}
		}
		
		while(true) {
			
			if(!list.isEmpty()) System.out.println(list);
			
			while(true) {
				reserveOk=true;
				System.out.print("\n캠핑구역 선택(1~30번) : ");
				int site = input.nextInt();	
					
				if(site<=30) {
					for(Reserve r:list) {
						if(r.getSiteNum()== site) {
							if(day.contains(r.getDay())) {
								System.out.println("\n선택하신 장소에 다른 사람이 먼저 예약한 날이 있습니다. 장소를 다시 선택해 주세요");
								reserveOk=false;
								break;
							}
						}
					}					
					
					if(reserveOk) {
						System.out.println("장소 선택 완료");
						list.add(new Reserve(reserveNum, day, dayCount, site));
						break;
					}
				}
				else {
					System.out.println("\n1~30번 중 선택하세요");
					break;
				}
			}
			System.out.println(list);
			break;
		}
		
	}
	
	 static int check() {		
		
		System.out.print("\n1. 예약일 확인\n2. 예약하기");
		System.out.print("\n번호를 선택하세요 : ");
		
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		return num;
	}

}