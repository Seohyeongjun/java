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
	// 클래스의 주소값이 반환되나 overriding으로 아래의 값이 리턴
	@Override
	public String toString()
	{
		return name+", "+age+", "+birth;
	}
	
	@Override
	public boolean equals(Object o)	// 어떤 데이터로 비교할 것인가
	{
		Member tmp = (Member) o;
		boolean isSam = this.age==tmp.age;
		if(isSam)
			isSam = this.name.equals(tmp.name);
		if(isSam)
			isSam = this.birth.equals(tmp.birth);
		
		return isSam;
	}	
//	@Override
//	public int compareTo(Member o)
//	{		
//		int cmp = this.age-o.age;
//		if(cmp==0)
//			cmp=this.name.compareTo(o.age)*-1;
//		return cmp;
////		return (this.age - o.age)*-1;	// o.age-this.age
////		return this.name.compareTo(o.name);// 문자열
////		return this.age - o.age;	// 숫자, 나이기준 오름차순
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
