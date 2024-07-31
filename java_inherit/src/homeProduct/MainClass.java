package homeProduct;

public class MainClass {
	public static void main(String[] args)
	{
		
		TV tv = new TV("삼성", 10000);
		System.out.println(tv.brand);
		tv.power();
		tv.power();
		tv.channelUp();
		
		Aircon airCon=new Aircon();
		airCon.brand="LG휘센";
		System.out.println(airCon.brand);
		airCon.power();
		airCon.power();
		airCon.windControl();
		
		System.out.println("다형성");
		TV tv2 = new TV("LG", 1500000);
		tv2.power();
		House item = new TV("삼성", 1750000);
		item.power();
		item=new Aircon("휘센", 2000000);
		item.power();

		// tv객체 100, 에어컨객체 30
		House[] arr= {new TV(), new Aircon(), new Computer()};
	

	}
}
// 클래스들의 관계 - 상속관계
// 상속 관계에 놓여있는 클래스들은 부모 클래스와 자식클래스로 나뉜다.
// 부모클래스의 필드(변수), 메서드를 하위 클래스(자식클래스)에서 사용가능
// 1. 상속은 재사용성을 위해 사용
//	- 여러 클래스들 간의 중복코드를 하나의 클래스로 통합시켜 사용
// 2. 상위 클래스(부모 클래스)의 필드(변수), 메서드를 모두 하위(자식)클래스에서 사용하지는 못한다.
//	- 제어자에 따라, 패키지에 따라 제한적
// 3. 하위(자식)클래스에서 부모를 지칭하는 예약어는 super이다.
//
//
//
//
//
// 클래스 상속
// 상속하려면 자식클래스 이름 뒤에 extends(부모클래스 이름)
// extends - 확장, 연장 ..
// TV extends House -> TV 클래스가 자식, House가 부모 클래스
// 상속을 하는 가장 큰 이유 - 다양성
// 부모클래스의 인스턴스변수, 인스턴스메서드, 클래스변수, 클래스메서드 사용가능
// 단, 부모클래스의 모든걸 사용하지는 못한다.(일부)
// 제어 걸려있는 변수나 메서드는 사용 불가

// 생성자메서드