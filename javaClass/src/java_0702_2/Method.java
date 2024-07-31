package java_0702_2;

public class Method {

	public static void main(String[] args) {
		
		int num=300;
		output(num);
		
		JavaMethod ja=new JavaMethod();
		ja.output();
		
//		gender(990101-123456);

	}
	
	static void output(int num)
	{
		System.out.println("나는 메서드 입니다.(1)"+num);
	}
}

class JavaMethod
{	
	static void output()
	{
		System.out.println("나는 메서드 입니다.(2)");	
	}
}
// main 메서드 -> JVM




// 자바 메서드
// 반환타입 메서드이름(매개변수){ }
// 반환타입 - int, short, float, double, char, boolean, void, String
//		메서드의 return 데이터 타입
//		
/*
	990101-123456
	주민번호로 남자인지 여자인지 구별
*/	
/*
public static String gender(String junmin)
{
	String gen = junmin.substring(7, 8);
	
	if(gen.equals("1") || gen.equals("3"))
		return "남자";
	else if(gen.equals("2") || gen.equals("4"))
		return "여자";
	
	return "혼란";
}
*/
