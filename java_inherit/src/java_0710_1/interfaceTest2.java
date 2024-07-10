package java_0710_1;

interface Animals{
	static int a=10;
	final int b=10;
	static void mee() {
		
	}
	public void sound();	// �߻�޼���, interface�� �⺻������ �߻�޼��� �̹Ƿ� abstract�� �Ⱥٿ� �ش�.
	
}

interface Bird{
	public void fly();		// �߻�޼���
}

class Dogs implements Animals{	// interface�� �����Ƿ� extends�� �ƴ϶� implements�� �Ѵ�.
	@Override
	public void sound(){
		System.out.println("�۸�");
	}
}

class Cats implements Animals{
	@Override
	public void sound(){
		System.out.println("�߿�");
	}	
}

class Pigeons implements Animals, Bird{	// interface�� implements�� �� �� �̻� �� �� �ִ�.(��� extends�� �� �� �̻� �ȵ�)
	@Override
	public void sound(){
		System.out.println("����");
	}
	
	@Override
	public void fly() {
		System.out.println("Ǫ���");
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
 * Ŭ���� ���
 * 1. ���� ��� - �ϳ��� Ŭ������ ��� ����
 * 		�ڽ�Ŭ������ �ϳ��� �θ�Ŭ������ ���� �� �ִ�.
 * 		�ٸ� Ŭ������ ����� ����Ϸ��� ���԰���� ����
 * 
 * 		���԰���
 * 		class A{ }
 * 		class B{
 * 			A a = new A();
 * 		}
 * 		�ڵ��� - Ÿ�̾�, ����, â��, ������, �ڵ�..
 * 		�ڵ��� - �ҳ�Ÿ, �ƹ���, �׷���, ī�Ϲ�..
 * 
 * 2. �θ�Ŭ������ ������ �޼��带 ��ӹ޾� ���
 * 		�θ�Ŭ������ public, protected, default������ ������ �޼��常 ���
 * 		�ڽ�Ŭ������ �θ� ������� �ִ� ������ �� �޾ƾ� �Ѵ�.
 * 		�ڽ�Ŭ���� ���忡���� �������� ����. ������ ���
 * 
 * 3. ���� ����
 * 		�θ�Ŭ������ ������ �ڽ�Ŭ������ ������ �ش�.
 * 
 * 
 * �������̽�
 * 1. ���� ����
 * 		Ŭ������ �������� �������̽��� �����Ͽ� ���� �� �� �ִ�.
 * 
 * 2. ������
 * 		Ŭ������ �ʿ��� �������̽��� �����Ͽ� ���� �� �� �ִ�.
 * 
 * 3. ���� ����
 * 		Ŭ������ �ʿ��� �������̽��� �����ϸ� �ǹǷ� ��Ӱ��� �� ������ �������� ���� ����.
 * 		(��Ӻ��� ������ ����)
 * 
 *
 */

