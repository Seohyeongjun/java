package homeProduct;

public class MainClass {
	public static void main(String[] args)
	{
		
		TV tv = new TV("�Ｚ", 10000);
		System.out.println(tv.brand);
		tv.power();
		tv.power();
		tv.channelUp();
		
		Aircon airCon=new Aircon();
		airCon.brand="LG�ּ�";
		System.out.println(airCon.brand);
		airCon.power();
		airCon.power();
		airCon.windControl();
		
		System.out.println("������");
		TV tv2 = new TV("LG", 1500000);
		tv2.power();
		House item = new TV("�Ｚ", 1750000);
		item.power();
		item=new Aircon("�ּ�", 2000000);
		item.power();

		// tv��ü 100, ��������ü 30
		House[] arr= {new TV(), new Aircon(), new Computer()};
	

	}
}
// Ŭ�������� ���� - ��Ӱ���
// ��� ���迡 �����ִ� Ŭ�������� �θ� Ŭ������ �ڽ�Ŭ������ ������.
// �θ�Ŭ������ �ʵ�(����), �޼��带 ���� Ŭ����(�ڽ�Ŭ����)���� ��밡��
// 1. ����� ���뼺�� ���� ���
//	- ���� Ŭ������ ���� �ߺ��ڵ带 �ϳ��� Ŭ������ ���ս��� ���
// 2. ���� Ŭ����(�θ� Ŭ����)�� �ʵ�(����), �޼��带 ��� ����(�ڽ�)Ŭ�������� ��������� ���Ѵ�.
//	- �����ڿ� ����, ��Ű���� ���� ������
// 3. ����(�ڽ�)Ŭ�������� �θ� ��Ī�ϴ� ������ super�̴�.
//
//
//
//
//
// Ŭ���� ���
// ����Ϸ��� �ڽ�Ŭ���� �̸� �ڿ� extends(�θ�Ŭ���� �̸�)
// extends - Ȯ��, ���� ..
// TV extends House -> TV Ŭ������ �ڽ�, House�� �θ� Ŭ����
// ����� �ϴ� ���� ū ���� - �پ缺
// �θ�Ŭ������ �ν��Ͻ�����, �ν��Ͻ��޼���, Ŭ��������, Ŭ�����޼��� ��밡��
// ��, �θ�Ŭ������ ���� ��������� ���Ѵ�.(�Ϻ�)
// ���� �ɷ��ִ� ������ �޼���� ��� �Ұ�

// �����ڸ޼���