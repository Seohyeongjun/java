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
				System.out.println("ȸ�� Ȯ�� �Ϸ�!");
			}			
		}
		
		 {
			System.out.println("\nȸ���� �ƴմϴ�.");
			System.out.print("ȸ������ �Ͻðڽ��ϱ�? \n 1. ����  2. ���� : ");
			
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
		System.out.println("\nȸ������");
		
		memberList.add(addMemberNum++);
		System.out.println("ȸ����ȣ�� : "+addMemberNum+"�Դϴ�.");
	}
	
}
