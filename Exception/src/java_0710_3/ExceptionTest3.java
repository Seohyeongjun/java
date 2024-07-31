package java_0710_3;

public class ExceptionTest3 {

	public static void main(String[] args) {
		
		Member member = new Member("�̼���", 2999);
		System.out.println(member.name+" "+ member.birth);
		try
		{
			member.setAge();
		}
		catch(RuntimeException a)
		{
			System.out.println(a.getMessage());
		}
		
		System.out.println(member.age);
		
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
	
	// setAge �޼��带 ȣ���Ͽ� age������ �����ϴµ� age������ ���̸� ǥ���ϱ� ���� ������ 0���� �������� ����Ǹ� �ȵȴ�.
	// ���س⵵���� �¾ �⵵�� ���⸦ ������ 0���� �������� ���´ٸ� �߸��� ���̴�.
	// �� ������ birth������ ���� �߸��Ǿ��⿡ �߻��� �����̹Ƿ� setAge �޼��忡�� ó���ϴ°� �ƴ϶� 
	// ���� �ڵ忡�� �ذ��Ͼ� �ϹǷ� ���� �߻���Ű�� �Ѱ��ֱ⸦ �Ѵ�.
	void setAge()
	{
		this.age=2024-birth;
		if(age<0)
			throw new RuntimeException("�¾ �⵵�� �߸��Ǿ����ϴ�.");
	}
//	void setAge()
//	{
//		try 
//		{
//			this.age=2024-birth;
//			if(age<0)
//				throw new RuntimeException("�¾ �⵵�� �߸��Ǿ����ϴ�.");
//		}
//		catch(Exception a)
//		{
//			a.printStackTrace();
//			System.out.println(a.getMessage());
//		}
//		
//	}
//	
}