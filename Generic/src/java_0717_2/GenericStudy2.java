package java_0717_2;

import java.util.ArrayList;

public class GenericStudy2 {

	public static void main(String[] args) {
		
		ArrayList<Book> book = new ArrayList<>();
		ArrayList<DVD> dvd = new ArrayList<>();
		
		book.add(new Book("B1234", "자바완전정복", "김동형"));
		book.add(new Book("B2234", "스프링프레임워크", "김도형"));
		book.add(new Book("A1257", "c언어완전정복", "남철수"));
		
		dvd.add(new DVD("C1554", "HTML완전정복", "나동향"));
		dvd.add(new DVD("A3634", "ATMEGA", "배철수"));
		dvd.add(new DVD("B1531", "Cortex", "황산벌"));
		
//		System.out.println(book);
//		System.out.println(dvd);
		
		// 대여하기
		Library lib = new Library();
		
		lib.addRental(book.get(0), "이순신");
		lib.addRental(dvd.get(2), "김춘추");
		lib.showRentalList();
		
//		Rental <DVD> rent = new Rental<>(dvd.get(0), "이순신");		
//		System.out.println(rent);
//		
//		Rental <Book> brent = new Rental<>(book.get(0), "김춘추");		
//		System.out.println(brent);
	}
}
