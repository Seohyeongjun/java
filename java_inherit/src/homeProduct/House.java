package homeProduct;

public abstract class House {

	protected boolean onOff;
	protected String brand;	// 제품 브랜드
	protected int price;		// 제품 가격
	
	protected House()
	{
		this.onOff=false;	
	}
	
	protected House(String brand, int price)
	{
		this.brand=brand;
		this.price=price;
	}
	
	 abstract void power(); // 추상 메서드
}

// 추상클래스 - class앞에 abstract를 붙인다.
// 추상클래스는 객체 생성 불가
// 추상 메서드를 가지고 있는 클래스는 반드시 추상클래스가 되어야 한다.
// 부모클래스가 추상클래스라면 반드시 자식 클래스는 추상메서드를 정의해야 한다.
// 부모의 추상메서드를 재정의 하지 않을꺼라면 자식 클래스는 추상 클래스가 되어야 한다. 

/*
 자바의 제어자
 1. static - 클래스의 정적 변수, 정적 메서드
 			- 클래스에서 객체들이 공동으로 사용할 수 있는 변수, 메서드
 			- 객체에 속하지 않고 클래스에 속한다.
 			- 클래스명.static 변수명 , 클래스명.static 메서드()
 2. abstract - 추상 클래스, 추상 메서드
 			- 미완성의 의미를 가진다.
 			- 추상클래스는 객체 생성불가
 3. final - 변경되지 않는 의미로 사용된다.
  			- 변수 앞에 final을 붙이면 변수 값 변경 불가
  			- 메서드 앞에 final을 붙이면 해당 메서드는 오버라이딩 불가
  			- 클래스 앞에 final을 붙이면 상속 불가(부모클래스가 안된다)
 4. 접근 제어자
  	public - 어디서나 누구든지 사용 가능한 제어자
  	default - 같은 패키지에서만 접근 가능(기본이 default)
  	protected - 같은 패키지에서만 접근 가능
  			  - 상속 관계일 경우 패지지가 달라도 접근 가능
  	private - 어디서나 누구든지 사용 못한다.
  			- 클래스내부에서만 사용 가능(부모, 자식 등 모두 안됨)
  			
 
 
 */



