package homeProduct;

public class MainClass {
	public static void main(String[] args)
	{
		TV tv = new TV("삼성", 10000);
		System.out.println(tv.brand);
		tv.power();
		tv.power();
		
		Aircon airCon=new Aircon();
		airCon.brand="LG휘센";
		System.out.println(airCon.brand);
		airCon.power();
		airCon.power();
		
		
		
	}
}

// 클래스 상속
// 상속하려면 자식클래스 이름 뒤에 extends(부모클래스 이름)
// extends - 확장, 연장 ..
// TV extends House -> TV 클래스가 자식, House가 부모 클래스
// 상속을 하는 가장 큰 이유 - 다양성
// 부모클래스의 인스턴스변수, 인스턴스메서드, 클래스변수, 클래스메서드 사용가능
// 단, 부모클래스의 모든걸 사용하지는 못한다.(일부)
// 제어 걸려있는 변수나 메서드는 사용 불가

// 생성자메서드