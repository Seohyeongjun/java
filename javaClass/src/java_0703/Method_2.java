package java_0703;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Method_2 {

	public static void main(String[] args) {
		
		Member member1=new Member("�̼���", 31, "����");
		Member member2=new Member("������", 29, "�����������");
		Member member3=new Member("�念��", 45, "��������");
		
		member1.birth();
		member2.birth();
		member3.birth();
		System.out.println();
///////////////////////////////////////////////////////
		// ���� - 20���ΰ�? 30���ΰ�? 40��? 50��?
		DataIdenti dataIdenti = new DataIdenti();
		
		dataIdenti.ageGroup(member1.name, member1.age);
		dataIdenti.ageGroup(member2.name, member2.age);
		dataIdenti.ageGroup(member3.name, member3.age);
		System.out.println();
///////////////////////////////////////////////////////
		// �����з� - �������� �з��� ���� ǥ��
		// ���� - 05.����,		�������� - 15.���, 
		// ����������� - 18.�����Ǻ�	
		//
		// ��³��� - �̼��� : 05.����
		dataIdenti.jobGroup(member1.name, member1.job);
		dataIdenti.jobGroup(member2.name, member2.job);
		dataIdenti.jobGroup(member3.name, member3.job);
		System.out.println();
		
//		// �¾ �⵵
//		LocalDate today = LocalDate.now();
//		
////		System.out.println(today);	// 2024-07-03
////		System.out.println(today.getYear());	// 2024
////		System.out.println(today.getMonthValue());	// 7
////		System.out.println(today.getDayOfWeek());	// WEDNESDAY
////		System.out.println(today.getDayOfWeek().getValue());	// 3
//		
//		int nowYear = today.getYear();
//		int birthYear = nowYear - member1.age;
//		System.out.printf("%s �¾ �⵵ : %d��", member1.name, birthYear);
		
//		Calendar cal = Calendar.getInstance();
//		int year = cal.get(Calendar.YEAR);
//		int month = cal.get(Calendar.MONTH)+1;	// january : 0
//		int date = cal.get(Calendar.DAY_OF_MONTH);
//		int day = cal.get(Calendar.DAY_OF_WEEK); // sunday : 0
//		
//		System.out.println(year+" "+month+" "+date+" "+day);
		
		
//		Date today = new Date();
//		System.out.println(today.getDate());
	}
}

// ��Ʈ�ѿ� Ŭ����, ���� ����� ���� Ŭ����, ������ Ŭ����
// Controller, Service, DTO(VO)
class DataIdenti	// ���ɴ�, ���� �з� ��� ������ �з��� ���� Ŭ����
{
	void ageGroup(String name, int age)
	{
		String ageGroup;
		ageGroup=age/10+"0��";

		System.out.println(name+"�� "+ageGroup+"�̴�.");
	}
	void jobGroup(String name, String job)
	{
		String jobGroup="";
		
		if(job=="����" || job=="������")
			jobGroup="05.����";
		else if(job=="�����������")
			jobGroup="18.�����Ǻ�";
		else if(job=="��������")
			jobGroup="15.���";
		
		System.out.println(name+" : "+jobGroup);
	}
}


class Member
{
	String name;
	int age;
	String job;
	Member(){}	// �⺻ ������ �޼���
	
	Member(String name, int age, String job)	// �Ű������� �ִ� ������ �޼���
	{
		this.name=name;
		this.age=age;
		this.job=job;
	}
	
	// �¾ �⵵ �����ΰ� ����ϴ� �޼���
	void birth()
	{
		LocalDate today = LocalDate.now();
		
//		System.out.println(today);	// 2024-07-03
//		System.out.println(today.getYear());	// 2024
//		System.out.println(today.getMonthValue());	// 7
//		System.out.println(today.getDayOfWeek());	// WEDNESDAY
//		System.out.println(today.getDayOfWeek().getValue());	// 3
		
		int nowYear = today.getYear();
		int birthYear = nowYear - this.age;
		System.out.printf("%s �¾ �⵵ : %d��\n", this.name, birthYear);
	}
}
