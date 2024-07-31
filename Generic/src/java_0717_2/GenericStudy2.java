package java_0717_2;

import java.util.ArrayList;

public class GenericStudy2 {

	public static void main(String[] args) {
		
		ArrayList<Book> book = new ArrayList<>();
		ArrayList<DVD> dvd = new ArrayList<>();
		
		book.add(new Book("B1234", "�ڹٿ�������", "�赿��"));
		book.add(new Book("B2234", "�����������ӿ�ũ", "�赵��"));
		book.add(new Book("A1257", "c����������", "��ö��"));
		
		dvd.add(new DVD("C1554", "HTML��������", "������"));
		dvd.add(new DVD("A3634", "ATMEGA", "��ö��"));
		dvd.add(new DVD("B1531", "Cortex", "Ȳ���"));
		
//		System.out.println(book);
//		System.out.println(dvd);
		
		// �뿩�ϱ�
		Library lib = new Library();
		
		lib.addRental(book.get(0), "�̼���");
		lib.addRental(dvd.get(2), "������");
		lib.showRentalList();
		
//		Rental <DVD> rent = new Rental<>(dvd.get(0), "�̼���");		
//		System.out.println(rent);
//		
//		Rental <Book> brent = new Rental<>(book.get(0), "������");		
//		System.out.println(brent);
	}
}
