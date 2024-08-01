package membership;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class Book {

	private String bookCode;
	private String bookName;
	
	public static List<Book> bookList = new ArrayList<>();
	public List<BookLoanList> bookLoanList = new ArrayList<>();
	public Iterator<Book> itr = bookList.iterator();
	Member member = new Member();
	
	public Book() {}
	public Book(String bookCode) {
		this.bookCode=bookCode;
	}
	
	public Book(String bookCode, String bookName) {
		
		this(bookCode);
		this.bookName=bookName;
	}
	public void BookCode(String bookCode, int memberNum, String memberName) {
		
		boolean codeOk=true;
		List<Member> memberList = Member.memberList;
		
		if(bookList.isEmpty())
			System.out.println("\n��ϵ� ������ �ѱǵ� �����ϴ�. ��������� �� �� �̿� �ٶ��ϴ�.");
		
		for(Book list:bookList) {

			if(list.getBookCode().equals(bookCode)) {
				System.out.println("\n�ڵ� ��ȣ : "+bookCode+" ("+list.getBookName()+") �� �뿩 �մϴ�.");
				
				bookLoanList.add(new BookLoanList(bookCode, list.getBookName()));
				System.out.println("�����뿩 ����Ʈ \nȸ����ȣ : "+memberNum+"(�̸� : "+memberName+" )\n"+ bookLoanList);
				codeOk=false;
				break;
			}			
		}

		if(codeOk) {
			System.out.println("\n�ڵ� ��ȣ "+bookCode+ "�� ���� å�Դϴ�.\n�ڵ��ȣ�� �ٽ� �Է��ϼ���");
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
		
		Book book;
		itr = bookList.iterator();		// �ݺ��� �����
		
		while(itr.hasNext())
		{
			book=itr.next();
			if(book.bookCode.equals(bookCode)){	
				System.out.println("�ڵ��ȣ : "+bookCode+" ( "+book.bookName+" )�� ���� �մϴ�.");
				bookList.remove(book);					
			}		
		}
		
		System.out.println( "���� ���� ����Ʈ : \n"+bookList);	
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


