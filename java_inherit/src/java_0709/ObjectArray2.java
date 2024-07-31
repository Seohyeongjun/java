package java_0709;

public class ObjectArray2 {

	public static void main(String[] args) {
		
		Game[] game = new Game[3];
		
		game[0]= new Game("리그 오브 레전드", "MOBA", "라이엇 게임즈", "PC", 12);
		game[1]= new Game("젠레스 존 제로", "액션", "HoYoverse", "Mobile", 12);
		game[2]= new Game("그랑사가 키우기: 나이츠x나이츠", "방치형", "파이드 픽셀즈", "Mobile", 12);
//		game[3]= new Game();
//		game[4]= new Game();
//		game[5]= new Game();
//		game[6]= new Game();
		
		for(Game g:game)
			System.out.println(g);
		
		
	}

}

// 7개의 게임 정보를 가진 객체를 생성하고 출력하시오