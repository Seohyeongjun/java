package java_0702;

public class classBasic {
	public static void main(String[] args)
	{	
		// ���� �� Ŭ���� Ÿ���ǰ����� �����Ѵ�.
		// ������ ������ �����͸� �����Ѵ�.
		// Ŭ���� Ÿ������ ������ ������ ��ü �Ǵ� �ν��Ͻ���� �Ѵ�. 
		
		// Ŭ���� �ν��Ͻ� ����
		Member member1 = new Member();
		Member member2 = new Member();
		
		System.out.println(member1);
		member1.name="�̼���";
		member1.age=19;
		
		System.out.println(member1);
		System.out.println(member1.name);
		System.out.println(member1.age);
		
		member2.name = "������";
		member2.age = 29;
		
		System.out.println(member2.name+member2.age);
		
		Book book1 = new Book();
		Book book2 = new Book();
		
		book1.title = "java";		
		book1.page = 495;
		
		book2.title = "�޸�����ȭ���";
		book2.page = 893;
		
		System.out.printf("å1 ���� : %s, ������ : %d��\n",book1.title, book1.page);
		System.out.printf("å2 ���� : %s, ������ : %d��\n",book2.title, book2.page);
		
		
		// ����Ʈ�� ��ǰ��, �ü��, �޸�(ram)ũ�⿡ ���� ������ �� �ִ� Ŭ������ �����ϰ� �ν��Ͻ��� �����Ͽ� �� ����, ��� �Ͻÿ�(����Ʈ�� 3��)
		Phone phone1 = new Phone();
		Phone phone2 = new Phone();
		Phone phone3 = new Phone();
		
		phone1.name="������s24";
		phone1.os="�ȵ���̵�";
		phone1.memory=12;
		
		phone2.name="������13";
		phone2.os="ios";
		phone2.memory=8;

		phone3.name="������";
		phone3.os="�ȵ���̵�";
		phone3.memory=8;

		System.out.println("\n����Ʈ�� 1");
		System.out.println("��ǰ�� : "+phone1.name+", �ü�� : "+phone1.os+", �޸� : "+phone1.memory+"GB\n");
		System.out.println("����Ʈ�� 2");
		System.out.println("��ǰ�� : "+phone2.name+", �ü�� : "+phone2.os+", �޸� : "+phone2.memory+"GB\n");
		System.out.println("����Ʈ�� 3");
		System.out.println("��ǰ�� : "+phone3.name+", �ü�� : "+phone3.os+", �޸� : "+phone3.memory+"GB\n");
		
	}
}

// å ����� ���������� �����ϱ� ���� Ŭ���� ����
class Book{
	String title;
	int page;
}

// Ŭ������ ����� ���� ������ Ÿ���̶�� �Ѵ�.
// Member��� �̸��� Ŭ���� ����
class Member{	
	String name;
	int age;
}

class Phone{
	String name;
	String os;
	int memory;
}