package java_0709;

public class ObjectArray2 {

	public static void main(String[] args) {
		
		Game[] game = new Game[3];
		
		game[0]= new Game("���� ���� ������", "MOBA", "���̾� ������", "PC", 12);
		game[1]= new Game("������ �� ����", "�׼�", "HoYoverse", "Mobile", 12);
		game[2]= new Game("�׶��簡 Ű���: ������x������", "��ġ��", "���̵� �ȼ���", "Mobile", 12);
//		game[3]= new Game();
//		game[4]= new Game();
//		game[5]= new Game();
//		game[6]= new Game();
		
		for(Game g:game)
			System.out.println(g);
		
		
	}

}

// 7���� ���� ������ ���� ��ü�� �����ϰ� ����Ͻÿ�