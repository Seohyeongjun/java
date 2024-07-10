package java_0710_3;

public class ExceptionTest3 {

	public static void main(String[] args) {
		
		// 프로그램에 오류가 없으나 강제로 오류 발생
		try
		{
			throw new NullPointerException("aa");	// 특정상황에 강제오류 발생 시키기
		}
		catch(Exception e)
		{
			System.out.println("강제 오류 발생");
		}
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
	
	void setAge()
	{
		this.age=2024-birth;
	}
	
}