package java_0709_3;

public class Main_Bethod {
	public static void main(String[] args)
	{
		move d = new dog();
		move c = new cat();
		
		d.moving();
		c.moving();
	}
}

class dog implements move
{
	@Override
	public void moving()
	{
		System.out.println("��ŭ��ŭ �̵��Ѵ�.");
	}
}
class cat implements move
{
	@Override
	public void moving()
	{
		System.out.println("��� ��� �̵��Ѵ�.");
	}
}

interface move
{
	static int a=10;	// static���� ���� ����
	public void moving(); // static�޼��� ���� ����
}

/*
	�������̽� - �߻�Ŭ������ �� ����
	- �߻�޼��常 ����
	- �ν��Ͻ����� �Ұ�
	- static����, static�޼��� ���� ����
	- ��ü �����Ұ�
	- Ŭ�����鿡 ����Ǿ� ���
	- ������ ������ ���� ���
	- ���α׷��� �⺻Ʋ�� ������ �� �ִ�.
	
	�������� Ŭ���̾�Ʈ���� �������� �����Ѵ�.
	- Ŭ���̾�Ʈ�� ��û�� �޾� �ִ� �޼���
	- Ŭ���̾�Ʈ�� ���ϴ� �������� �����ϴ� �޼���
	
	

 */