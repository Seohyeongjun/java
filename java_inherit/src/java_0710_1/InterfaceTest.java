package java_0710_1;

abstract class Animal{	// abstract �߻�Ŭ����, �߻�޼��带 �ϸ� Ŭ������ �߻�ȭ �ؾ� �Ѵ�.
	public abstract void sound();	// abstract �߻�޼���(Ŭ���������� ����)
}

class Dog extends Animal{
	@Override
	public void sound() {
		System.out.println("�۸�");
	}	
}

class Cat extends Animal{
	@Override
	public void sound() {
		System.out.println("�߿�");
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
	�������� �Ҹ��� ����Ѵ�.
	��, �����, ��, ��ѱ�, �� ��
	�� ������ ���� �ٸ� ��ü�̱� ������ Ŭ������ ����
	������, ��, �����, �� ���� ������ ������ �����ϹǷ�
	animal�̶�� �θ� Ŭ������ �ΰڴ�.

*/