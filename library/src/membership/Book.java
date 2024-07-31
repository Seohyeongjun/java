package membership;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Book {

	private String bookCode;
	private String bookName;
	public static List<Book> bookList = new ArrayList<>();
	
	public Book() {}
	public Book(String bookCode) {
		this.bookCode=bookCode;
	}
	
	public Book(String bookCode, String bookName) {
		
		this(bookCode);
		this.bookName=bookName;
	}
	public void BookCode(String bookCode) {
		
		if(bookList.isEmpty())
			System.out.println("\n��ϵ� ������ �ѱǵ� �����ϴ�. ��������� �� �� �̿� �ٶ��ϴ�.");
		
		for(Book list:bookList) {
//			System.out.println("����Ʈ : "+list);
			if(list.getBookCode().equals(bookCode)) {
				System.out.println("\n�ڵ� ��ȣ : "+bookCode+"�� �뿩 �մϴ�.");
			}
			else {
				System.out.println("\n�ڵ� ��ȣ "+bookCode+"�� ���� å�Դϴ�.\n�ڵ��ȣ�� �ٽ� �Է��ϼ���");
			}
		}
	}	
	public void addBook(String bookCode, String bookName) {
		
		bookList.add(new Book(bookCode, bookName));
	}
	public void modifyBook(String bookCode, String reName) {
		for(Book book:bookList) {
			if(book.getBookCode().equals(bookCode))
				book.setBookName(reName);
		}
	}
	public void remove(String bookCode)	{
		for(Book book:bookList) {
			if(book.getBookCode().equals(bookCode))
			{	
				book.remove(bookCode);
				book.remove(bookName);
			}
			
		}
	}
	
	public void setBookCode(String bookCode) {
		this.bookCode=bookCode;
	}
	public void setBookName(String bookName) {
		this.bookName=bookName;
	}
	public String getBookCode() {
		return bookCode;
	}
	public String getBookName() {
		return bookName;
	}
	public String toString() {
		return "�ڵ� ��ȣ : "+bookCode+", ������ : "+bookName;
	}

}


