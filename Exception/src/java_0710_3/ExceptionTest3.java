package java_0710_3;

public class ExceptionTest3 {

	public static void main(String[] args) {
		
		Member member = new Member("이순신", 2999);
		System.out.println(member.name+" "+ member.birth);
		try
		{
			member.setAge();
		}
		catch(RuntimeException a)
		{
			System.out.println(a.getMessage());
		}
		
		System.out.println(member.age);
		
	}
}

class Member
{
	String name;
	int age;
	int birth;
	Member(String name, int birth)
	{
		this.name=name;
		this.birth=birth;
	}
	
	// setAge 메서드를 호출하여 age변수값 저장하는데 age변수는 나이를 표현하기 이한 변수라 0보다 작은값이 저장되면 안된다.
	// 올해년도에서 태어난 년도를 빼기를 했을때 0보다 작은값이 나온다면 잘못된 값이다.
	// 이 문제는 birth변수의 값이 잘못되었기에 발생한 문제이므로 setAge 메서드에서 처리하는게 아니라 
	// 상위 코드에서 해결하야 하므로 예외 발생시키고 넘겨주기를 한다.
	void setAge()
	{
		this.age=2024-birth;
		if(age<0)
			throw new RuntimeException("태어난 년도가 잘못되었습니다.");
	}
//	void setAge()
//	{
//		try 
//		{
//			this.age=2024-birth;
//			if(age<0)
//				throw new RuntimeException("태어난 년도가 잘못되었습니다.");
//		}
//		catch(Exception a)
//		{
//			a.printStackTrace();
//			System.out.println(a.getMessage());
//		}
//		
//	}
//	
}