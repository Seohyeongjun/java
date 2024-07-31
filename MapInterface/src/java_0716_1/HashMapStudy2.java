package java_0716_1;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class HashMapStudy2 {

	public static void main(String[] args) {
		
		HashMap<String, ImageBoard> board = new HashMap<>();
		
		ImageBoard temp = new ImageBoard("�ڹټ�ġ", "javava", "��ġ_jpg");
		board.put(temp.getTitle(), temp);
		
		temp = new ImageBoard("mysql��ġ���", "��ġ�ȳ�", "mysql��ġ.jpg");
		board.put(temp.getTitle(), temp);
		
		temp = new ImageBoard("�ڹٰ���", "javaRA", "����_jpg");
		board.put(temp.getTitle(), temp);
		
		temp = new ImageBoard("mysql����", "���ξȳ�", "mysql����.jpg");
		board.put(temp.getTitle(), temp);		
		
		temp = new ImageBoard("C ��ġ", "C���", "C��ġ_jpg");
		board.put(temp.getTitle(), temp);

		System.out.println(board.get("�ڹټ�ġ"));
		
		Scanner scan = new Scanner(System.in);
		// �̹��� �Խ����� �� ������ ���
		// ���� ���� ���� ������ �Է��ϸ� �ش� ���� ������ �� �� �ִ�.
		
		Set<String> titles = board.keySet();
		System.out.println("-- �̹����Խ��� ��� -- ");
		titles.forEach(title -> System.out.println(title));	// title�� ���Ǻ���
		
		System.out.println("�� ���� �Է� : ");
		String inputTitle = scan.nextLine();
		System.out.println(board.get(inputTitle));
		
		
		
		
		
		
		
		
		
		}
}
