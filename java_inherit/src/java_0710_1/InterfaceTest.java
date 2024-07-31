package java_0710_1;

abstract class Animal{	// abstract 추상클래스, 추상메서드를 하면 클래스도 추상화 해야 한다.
	public abstract void sound();	// abstract 추상메서드(클래스에서만 적용)
}

class Dog extends Animal{
	@Override
	public void sound() {
		System.out.println("멍멍");
	}	
}

class Cat extends Animal{
	@Override
	public void sound() {
		System.out.println("야옹");
	}
}

public class InterfaceTest {

	public static void main(String[] args) {
		Animal d = new Dog();
		Animal c = new Cat();
		
		d.sound();
		c.sound();	

	}

}


/*
	동물들의 소리를 출력한다.
	개, 고양이, 닭, 비둘기, 소 등
	각 동물은 서로 다른 개체이기 때문에 클래스로 구현
	하지만, 개, 고양이, 닭 들은 동물로 통합이 가능하므로
	animal이라는 부모 클래스를 두겠다.

*/