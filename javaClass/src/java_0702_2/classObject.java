package java_0702_2;

public class classObject {

	public static void main(String[] args) {
		System.out.println("< 제조사 > : "+Car.제조사);
		System.out.println();
		
		Car car1;		
		car1=new Car(0);
		
//		car1.제조사="기아";
//		car1.carName="쏘나타";
//		car1.배기량=2000;
//		car1.연료="휘발유";
		
		System.out.println("< 제조사 > : "+car1.제조사+"\n* 자동차명 : "+car1.carName+"\n* 배기량 : "+car1.배기량+"cc\n* 연료 : "+car1.연료); 	
		System.out.println();
		
		Car car2=new Car("그랜져", 3000, "휘발유");
		System.out.println("< 제조사 > : "+car2.제조사+"\n* 자동차명 : "+car2.carName+"\n* 배기량 : "+car2.배기량+"cc\n* 연료 : "+car2.연료); 	
//////////////////////////////////////////////////////////////////////////////////////
		/*
		데이터: 	이름		포인트	평점
				김건우	4580	4.3
				김경제	3485	4.1
				박재범	90930	2.7
				서석완	19200	3.1
				
				웹소설 작가들의 구독자 평점과, 소설 뷰횟수에 다른 포인트 점수이다.
				위 내용을 저장 할 수 있는 클래스를 정의하고 데이터 입력 후 출력하시오.
				(매개변수 있는 생성자 메서드는 두 개 이상 구현)		
		*/
				
//		WebToon webToon1 = new WebToon("김건우", 4580, 4.3f);
		WebToon webToon1_1 = new WebToon("김건우");
		WebToon webToon1_2 = new WebToon(4580, (float)4.3);
		WebToon webToon2_1 = new WebToon("김경제");
		WebToon webToon2_2 = new WebToon(3485, 4.1f);
		WebToon webToon3_1 = new WebToon("박재범");
		WebToon webToon3_2 = new WebToon(90930, 2.7f);
		WebToon webToon4_1 = new WebToon("서석완");
		WebToon webToon4_2 = new WebToon(19200, (float)3.1);
		
		

		System.out.println("\n이름	포인트	평점");
		System.out.println(webToon1_1.name+"	"+ webToon1_2.point+"	"+ webToon1_2.score);
		System.out.println(webToon2_1.name+"	"+ webToon2_2.point+"	"+ webToon2_2.score);
		System.out.println(webToon3_1.name+"	"+ webToon3_2.point+"	"+ webToon3_2.score);
		System.out.println(webToon4_1.name+"	"+ webToon4_2.point+"	"+ webToon4_2.score);
		
//		System.out.println(webToon1);


//		System.out.println("\n이름	포인트	평점");
//		System.out.println("────────────────────");		
//		WebToon webToon1_1 = new WebToon("김건우");
//		System.out.print(webToon1_1.name+"	");
//		webToon1_1 = new WebToon(4580, 4.3);
//		System.out.println(webToon1_1.point+"	"+ webToon1_1.score);
//		webToon1_1 = new WebToon("김경제");
//		System.out.print(webToon1_1.name+"	");
//		webToon1_1 = new WebToon(3485, 4.1);
//		System.out.println(webToon1_1.point+"	"+ webToon1_1.score);
//		webToon1_1 = new WebToon("박재범");
//		System.out.print(webToon1_1.name+"	");
//		webToon1_1 = new WebToon(90930, 2.7);
//		System.out.println(webToon1_1.point+"	"+ webToon1_1.score);
//		webToon1_1 = new WebToon("서석완");
//		System.out.print(webToon1_1.name+"	");
//		webToon1_1 = new WebToon(19200, 3.1);
//		System.out.println(webToon1_1.point+"	"+ webToon1_1.score);

	}
}

// 클래스 내부에 선언되는 변수(또는 배열)는 두 가지가 있다
// 클래스 변수, 인스턴스 변수
// 인스턴스변수는 클래스 객체 생성시 메모리 할당된다.
// 클래스 객체 생성은 new연산자를 통한다.

// 생성자 메서드 - 객체(인스턴스) 공간을 생성할 때 공간 초기화 해주는 메서드
// 오버로딩 - 클래스명과 클래스 내의 다수의 매서드의 이름이 같다.
// 오버로딩 - 오버로딩 구현 조건
//		1. 동일 클래스에서만 가능하다.
//		2. 메서드의 이름은 같아야 한다.
//		3. 매개변수의 타입은 다르게 선언되어야 한다.
//		4. 매개변수의 갯수가 달라야 한다.
class Car{
	static String 제조사 = "현대";	// 클래스 변수
	
	String carName; 		// 인스턴스 변수
	int 배기량;				// 인스턴스 변수
	String 연료;				// 인스턴스 변수
	
	Car(int num)			// 생선자 메서드
	{
		if(num==0)
		{
			carName="쏘나타";
			배기량=2000;
			연료="휘발유";
		}
		else
		{
			carName="그랜져";
			배기량=3000;
			연료="휘발유";			
		}				
	}
	
	
	Car(String name, int cc, String fuel)
	{
		this.carName=name;
		this.배기량=cc;
		this.연료=fuel;
	}
}

class WebToon
{
	String name;
	int point;
	float score;
	
	WebToon(String name)
	{
		this.name=name;
	}
	
	WebToon(int point, float score)
	{
		this.point=point;
		this.score=score;
	}
	
	public String toString()
	{
		return name+"	"+ point+"	"+ score;
	}
}