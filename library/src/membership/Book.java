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
				System.out.println("\n�ڵ� ��ȣ : "+bookCode+"�뿩 �մϴ�.");
			}
			else {
			//	System.out.println("\n�ڵ� ��ȣ "+bookCode+"�� ���� å�Դϴ�.\n�ڵ��ȣ�� �ٽ� �Է��ϼ���");
			}
		}
		System.out.println("\n�ڵ� ��ȣ "+bookCode+"�� ���� å�Դϴ�.\n�ڵ��ȣ�� �ٽ� �Է��ϼ���");
		
	}
}


