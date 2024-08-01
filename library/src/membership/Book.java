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
			System.out.println("\n등록된 도서가 한권도 없습니다. 도서등록을 한 후 이용 바랍니다.");
		
		for(Book list:bookList) {
//			System.out.println("리스트 : "+list);
			if(list.getBookCode().equals(bookCode)) {
				System.out.println("\n코드 번호 : "+bookCode+"을 대여 합니다.");
			}
			else {
				System.out.println("\n코드 번호 "+bookCode+"는 없는 책입니다.\n코드번호를 다시 입력하세요");
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
		return "코드 번호 : "+bookCode+", 도서명 : "+bookName;
	}

}


