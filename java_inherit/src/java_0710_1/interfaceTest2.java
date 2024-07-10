package java_0710_1;

interface Animals{
	static int a=10;
	final int b=10;
	static void mee() {
		
	}
	public void sound();	// 추상메서드, interface가 기본적으로 추상메서드 이므로 abstract을 안붙여 준다.
	
}

interface Bird{
	public void fly();		// 추상메서드
}

class Dogs implements Animals{	// interface를 했으므로 extends가 아니라 implements를 한다.
	@Override
	public void sound(){
		System.out.println("멍멍");
	}
}

class Cats implements Animals{
	@Override
	public void sound(){
		System.out.println("야용");
	}	
}

class Pigeons implements Animals, Bird{	// interface는 implements를 두 개 이상 할 수 있다.(상속 extends는 두 개 이상 안됨)
	@Override
	public void sound(){
		System.out.println("구구");
	}
	
	@Override
	public void fly() {
		System.out.println("푸드득");
	}
}

public class interfaceTest2 {

	public static void main(String[] args) {
		Dogs dog = new Dogs();
		Cats cat = new Cats();
		Pigeons pigeon = new Pigeons();
		
		dog.sound();
		cat.sound();
		pigeon.sound();
		pigeon.fly();		
	}
}

/*
 * 클래스 상속
 * 1. 단일 상속 - 하나의 클래스만 상속 가능
 * 		자식클래스는 하나의 부모클래스만 가질 수 있다.
 * 		다른 클래스의 기능을 사용하려면 포함관계로 구현
 * 
 * 		포함관계
 * 		class A{ }
 * 		class B{
 * 			A a = new A();
 * 		}
 * 		자동차 - 타이어, 엔진, 창문, 에어컨, 핸들..
 * 		자동차 - 소나타, 아반테, 그랜저, 카니발..
 * 
 * 2. 부모클래스의 변수와 메서드를 상속받아 사용
 * 		부모클래스의 public, protected, default제어자 변수와 메서드만 상속
 * 		자식클래스는 부모가 상속으로 주는 모든것을 다 받아야 한다.
 * 		자식클래스 입장에서는 선택지가 없다. 강제적 상속
 * 
 * 3. 강한 결합
 * 		부모클래스의 변경이 자식클래스에 영항을 준다.
 * 
 * 
 * 인터페이스
 * 1. 다중 구현
 * 		클래스가 여러개의 인터페이스를 연결하여 구현 할 수 있다.
 * 
 * 2. 유연성
 * 		클래스는 필요한 인터페이스를 조합하여 구현 할 수 있다.
 * 
 * 3. 약한 결합
 * 		클래스는 필요한 인터페이스만 구현하면 되므로 사속관계 일 때보다 유연성이 높아 진다.
 * 		(상속보다 영향이 적다)
 * 
 *
 */

