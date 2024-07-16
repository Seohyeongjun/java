package java_0716_1;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class HashMapStudy2 {

	public static void main(String[] args) {
		
		HashMap<String, ImageBoard> board = new HashMap<>();
		
		ImageBoard temp = new ImageBoard("자바설치", "javava", "설치_jpg");
		board.put(temp.getTitle(), temp);
		
		temp = new ImageBoard("mysql설치방법", "설치안녕", "mysql설치.jpg");
		board.put(temp.getTitle(), temp);
		
		temp = new ImageBoard("자바공부", "javaRA", "공부_jpg");
		board.put(temp.getTitle(), temp);
		
		temp = new ImageBoard("mysql공부", "공부안녕", "mysql공부.jpg");
		board.put(temp.getTitle(), temp);		
		
		temp = new ImageBoard("C 설치", "C언어", "C설치_jpg");
		board.put(temp.getTitle(), temp);

		System.out.println(board.get("자바설치"));
		
		Scanner scan = new Scanner(System.in);
		// 이미지 게시판의 글 제목을 출력
		// 보고 싶은 글의 제목을 입력하면 해당 글의 내용을 볼 수 있다.
		
		Set<String> titles = board.keySet();
		System.out.println("-- 이미지게시판 목록 -- ");
		titles.forEach(title -> System.out.println(title));	// title은 임의변수
		
		System.out.println("글 제목 입력 : ");
		String inputTitle = scan.nextLine();
		System.out.println(board.get(inputTitle));
		
		
		
		
		
		
		
		
		
		}
}
