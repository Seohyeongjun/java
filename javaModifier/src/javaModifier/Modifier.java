package javaModifier;

public class Modifier {

	public static void main(String[] args) {
		
		Book book = new Book();
		book.setTitle("JAVA 속성");
		book.setAuthor("유재학");
		book.setPage(786);
		
		System.out.println(book.getTitle());
		System.out.println(book.getAuthor());
		System.out.println(book.getPage());
		
		Book book2 = new Book("JAVA, 웹, 성공적", "이병헌", 564);
		Book book3 = new Book("JAVA 그리고 성공적", "김두환", 1564);
		System.out.println(book2);	// public String toString()가 리턴 됨
		System.out.println(book3);
		System.out.println(book3.toString());
		Book book4=new Book("java");
		System.out.println(book4);
		
	}

}
