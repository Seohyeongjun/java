package java_0710_3;

public class ExceptionTest3 {

	public static void main(String[] args) {
		
		// ���α׷��� ������ ������ ������ ���� �߻�
		try
		{
			throw new NullPointerException("aa");	// Ư����Ȳ�� �������� �߻� ��Ű��
		}
		catch(Exception e)
		{
			System.out.println("���� ���� �߻�");
		}
	}
}

class Member
{
	String name;
	int age;
	int birth;
	Member(String name, int birth)
	{
		this.name=name;
		this.birth=birth;
	}
	
	void setAge()
	{
		this.age=2024-birth;
	}
	
}