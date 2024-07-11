package java_0711;

public class Member {

	private String name;
	private int age;
	private String birth;
	
	public Member(String name, int age, String birth)
	{
		this.name=name;
		this.age=age;
		this.birth=birth;
	}
	
	// print메서드에 있는 toString의 overriding
	//클래스의 주소값이 반환되나 overriding으로 아래의 값이 리턴
	@Override
	public String toString()
	{
		return name+", "+age+", "+birth;
	}
	
//	@Override
//	public boolean equals(Object obj)
//	{
//		Member tmp = (Member)
//		Object obj;
//		return obj;		
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	
	
}
