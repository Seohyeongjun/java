package homeProduct;

public class MainClass {
	public static void main(String[] args)
	{
		TV tv = new TV("�Ｚ", 10000);
		System.out.println(tv.brand);
		tv.power();
		tv.power();
		
		Aircon airCon=new Aircon();
		airCon.brand="LG�ּ�";
		System.out.println(airCon.brand);
		airCon.power();
		airCon.power();
		
		
		
	}
}

// Ŭ���� ���
// ����Ϸ��� �ڽ�Ŭ���� �̸� �ڿ� extends(�θ�Ŭ���� �̸�)
// extends - Ȯ��, ���� ..
// TV extends House -> TV Ŭ������ �ڽ�, House�� �θ� Ŭ����
// ����� �ϴ� ���� ū ���� - �پ缺
// �θ�Ŭ������ �ν��Ͻ�����, �ν��Ͻ��޼���, Ŭ��������, Ŭ�����޼��� ��밡��
// ��, �θ�Ŭ������ ���� ��������� ���Ѵ�.(�Ϻ�)
// ���� �ɷ��ִ� ������ �޼���� ��� �Ұ�

// �����ڸ޼���