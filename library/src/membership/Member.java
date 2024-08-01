package membership;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Member {

	private static int memberNum;
	private String memberName;
	
	private static int addMemberNum=2407;
	private static String addMemberName;
	
	public static List<Member> memberList = new ArrayList<>();
	
	public Member() {}
	
	public Member(int memberNum){
		
		this.memberNum=memberNum;
		
		checkMember(memberNum, "");
	
	}
	
	public Member(int memberNum, String memberName){
		
		this.memberNum=memberNum;
		this.memberName=memberName;
		
//		memberList.add(new Member(memberNum, memberName));
		
//		checkMember(memberNum, memberName);
	
	}
	
	public boolean checkMember(int Num, String Name) {
		
		for(Member member:memberList) {
			int mNum=member.getMemberNum();
			String mName=member.getMemberName();
			
//			System.out.println(memberNum);
			
			if(mNum==Num){				
				if(mName.equals(Name))
				{	
					System.out.println("회원가입 확인 완료");
					return true;
				}
				
			}
			else {
				System.out.println("회원이 아닙니다.");

			}
		}
			return false;
	}
		
	void addMember() {
		System.out.println("\n회원이 아닙니다.");
		System.out.print("회원가입 하시겠습니까? \n 1. 가입  2. 종료 : ");
		
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		input.nextLine();
		
		if(num==1) {
			System.out.print("이름 입력 : ");
			String addMemberName = input.nextLine();
			
			memberList.add( new Member(++addMemberNum, addMemberName));
			System.out.println("회원번호 : "+addMemberNum+", 회원명 : "+addMemberName);
		}
	}
	
	public void setMemberNum(int memberNum) {
		this.memberNum=memberNum;
	}
	public int getMemberNum() {
		return memberNum;
	}
	public void setMemberName(String memberName) {
		this.memberName=memberName;
	}
	public String getMemberName() {
		return memberName;
	}
	public String toString() {
		return "회원번호 : "+memberNum+", 회원이름 : "+memberName;
	}
	
}
