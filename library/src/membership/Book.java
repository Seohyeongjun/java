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
			System.out.println("\n등록된 도서가 한권도 없습니다. 도서등록을 한 후 이용 바랍니다.");
		
		for(Book list:bookList) {

			if(list.getBookCode().equals(bookCode)) {
				System.out.println("\n코드 번호 : "+bookCode+" ("+list.getBookName()+") 을 대여 합니다.");
				
				bookLoanList.add(new BookLoanList(bookCode, list.getBookName()));
				System.out.println("도서대여 리스트 \n회원번호 : "+memberNum+"(이름 : "+memberName+" )\n"+ bookLoanList);
				codeOk=false;
				break;
			}			
		}

		if(codeOk) {
			System.out.println("\n코드 번호 "+bookCode+ "는 없는 책입니다.\n코드번호를 다시 입력하세요");
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
		itr = bookList.iterator();		// 반복자 재생성
		
		while(itr.hasNext())
		{
			book=itr.next();
			if(book.bookCode.equals(bookCode)){	
				System.out.println("코드번호 : "+bookCode+" ( "+book.bookName+" )를 삭제 합니다.");
				bookList.remove(book);					
			}		
		}
		
		System.out.println( "보유 도서 리스트 : \n"+bookList);	
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


