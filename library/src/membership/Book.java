package membership;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Book {

	private String bookCode;
	List<String> bookList = new ArrayList<>();
	
	public Book(String bookCode) {
		
		this.bookCode=bookCode;
		
		for(String l:bookList) {
			if(l.equals(bookCode)) {
				System.out.println("\n코드 번호 : "+bookCode+"대여 합니다.");
			}
			else {
			//	System.out.println("\n코드 번호 "+bookCode+"는 없는 책입니다.\n코드번호를 다시 입력하세요");
			}
		}
		System.out.println("\n코드 번호 "+bookCode+"는 없는 책입니다.\n코드번호를 다시 입력하세요");
		
	}
}


