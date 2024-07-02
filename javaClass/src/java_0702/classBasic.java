package java_0702;

public class classBasic {
	public static void main(String[] args)
	{	
		// 정의 된 클래스 타입의공간을 생성한다.
		// 생선된 공간에 데이터를 저장한다.
		// 클래스 타입으로 생성된 공간을 객체 또는 인스턴스라고 한다. 
		
		// 클래스 인스턴스 생성
		Member member1 = new Member();
		Member member2 = new Member();
		
		System.out.println(member1);
		member1.name="이순신";
		member1.age=19;
		
		System.out.println(member1);
		System.out.println(member1.name);
		System.out.println(member1.age);
		
		member2.name = "김유신";
		member2.age = 29;
		
		System.out.println(member2.name+member2.age);
		
		Book book1 = new Book();
		Book book2 = new Book();
		
		book1.title = "java";		
		book1.page = 495;
		
		book2.title = "메모리최적화기법";
		book2.page = 893;
		
		System.out.printf("책1 제목 : %s, 페이지 : %d쪽\n",book1.title, book1.page);
		System.out.printf("책2 제목 : %s, 페이지 : %d쪽\n",book2.title, book2.page);
		
		
		// 스마트폰 제품명, 운영체제, 메모리(ram)크기에 대해 저장할 수 있는 클래스를 정의하고 인스턴스를 생성하여 값 저장, 출력 하시오(스마트폰 3개)
		Phone phone1 = new Phone();
		Phone phone2 = new Phone();
		Phone phone3 = new Phone();
		
		phone1.name="갤럭시s24";
		phone1.os="안드로이드";
		phone1.memory=12;
		
		phone2.name="아이폰13";
		phone2.os="ios";
		phone2.memory=8;

		phone3.name="구글폰";
		phone3.os="안드로이드";
		phone3.memory=8;

		System.out.println("\n스마트폰 1");
		System.out.println("제품명 : "+phone1.name+", 운영체제 : "+phone1.os+", 메모리 : "+phone1.memory+"GB\n");
		System.out.println("스마트폰 2");
		System.out.println("제품명 : "+phone2.name+", 운영체제 : "+phone2.os+", 메모리 : "+phone2.memory+"GB\n");
		System.out.println("스마트폰 3");
		System.out.println("제품명 : "+phone3.name+", 운영체제 : "+phone3.os+", 메모리 : "+phone3.memory+"GB\n");
		
	}
}

// 책 제목과 총페이지를 저장하기 위한 클래스 정의
class Book{
	String title;
	int page;
}

// 클래스는 사용자 정의 데이터 타입이라고 한다.
// Member라는 이름의 클래스 정의
class Member{	
	String name;
	int age;
}

class Phone{
	String name;
	String os;
	int memory;
}