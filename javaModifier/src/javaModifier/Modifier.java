package javaModifier;

public class Modifier {

	public static void main(String[] args) {
		
		Book book = new Book();
		book.setTitle("JAVA �Ӽ�");
		book.setAuthor("������");
		book.setPage(786);
		
		System.out.println(book.getTitle());
		System.out.println(book.getAuthor());
		System.out.println(book.getPage());
		
		Book book2 = new Book("JAVA, ��, ������", "�̺���", 564);
		Book book3 = new Book("JAVA �׸��� ������", "���ȯ", 1564);
		System.out.println(book2);	// public String toString()�� ���� ��
		System.out.println(book3);
		System.out.println(book3.toString());
		Book book4=new Book("java");
		System.out.println(book4);
		
	}

}
