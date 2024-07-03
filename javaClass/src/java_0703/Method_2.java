package java_0703;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Method_2 {

	public static void main(String[] args) {
		
		Member member1=new Member("이순신", 31, "군인");
		Member member2=new Member("문익점", 29, "섬유공장사장");
		Member member3=new Member("장영실", 45, "기계공학자");
		
		member1.birth();
		member2.birth();
		member3.birth();
		System.out.println();
///////////////////////////////////////////////////////
		// 나이 - 20대인가? 30대인가? 40대? 50대?
		DataIdenti dataIdenti = new DataIdenti();
		
		dataIdenti.ageGroup(member1.name, member1.age);
		dataIdenti.ageGroup(member2.name, member2.age);
		dataIdenti.ageGroup(member3.name, member3.age);
		System.out.println();
///////////////////////////////////////////////////////
		// 직업분류 - 국가직무 분류에 따라 표기
		// 군인 - 05.국방,		기계공학자 - 15.기계, 
		// 섬유공장사장 - 18.섬유의복	
		//
		// 출력내용 - 이순신 : 05.국방
		dataIdenti.jobGroup(member1.name, member1.job);
		dataIdenti.jobGroup(member2.name, member2.job);
		dataIdenti.jobGroup(member3.name, member3.job);
		System.out.println();
		
//		// 태어난 년도
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
//		System.out.printf("%s 태어난 년도 : %d년", member1.name, birthYear);
		
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

// 컨트롤용 클래스, 실제 기능의 동작 클래스, 데이터 클래스
// Controller, Service, DTO(VO)
class DataIdenti	// 연령대, 직업 분류 등등 데이터 분류를 위한 클래스
{
	void ageGroup(String name, int age)
	{
		String ageGroup;
		ageGroup=age/10+"0대";

		System.out.println(name+"은 "+ageGroup+"이다.");
	}
	void jobGroup(String name, String job)
	{
		String jobGroup="";
		
		if(job=="군인" || job=="군무원")
			jobGroup="05.국방";
		else if(job=="섬유공장사장")
			jobGroup="18.섬유의복";
		else if(job=="기계공학자")
			jobGroup="15.기계";
		
		System.out.println(name+" : "+jobGroup);
	}
}


class Member
{
	String name;
	int age;
	String job;
	Member(){}	// 기본 생성자 메서드
	
	Member(String name, int age, String job)	// 매개변수가 있는 생성자 메서드
	{
		this.name=name;
		this.age=age;
		this.job=job;
	}
	
	// 태어난 년도 언제인가 출력하는 메서드
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
		System.out.printf("%s 태어난 년도 : %d년\n", this.name, birthYear);
	}
}
