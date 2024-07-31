package membership;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Member {

	private int memberNum;
	private int addMemberNum=2407;
	
	List<Integer> memberList = new ArrayList<>();
	
	public Member(int memberNum){
		this.memberNum=memberNum;
		
		checkMember(memberNum);
	
	}
	void checkMember(int memberNum) {
		
		for(Integer l:memberList) {
			if(l.equals(memberNum)) {
				System.out.println("회원 확인 완료!");
			}			
		}
		
		 {
			System.out.println("\n회원이 아닙니다.");
			System.out.print("회원가입 하시겠습니까? \n 1. 가입  2. 종료 : ");
			
			Scanner input = new Scanner(System.in);
			int num = input.nextInt();
			
			if(num==1) {
				addMember();
			}
			else if(num==2) {
				
			}
		}
		
	}
	void addMember() {
		System.out.println("\n회원가입");
		
		memberList.add(addMemberNum++);
		System.out.println("회원번호는 : "+addMemberNum+"입니다.");
	}
	
}
