package java_0709;

public class ObjectArray1 {
	public static void main(String[] args)
	{
//		// Movies��Ŭ������
//		Movies[] mv = new Movies[10];
//		
//		for(int i=0; i<mv.length; i++)
//		{
//			// Ŭ���� ������ �� ����� �Ѵ�.
//			mv[i]=new Movie1();
//		}
		
//		for(int i=0; i<mv.length; i++)
//		{
//			System.out.println(mv[i]);
//		}
		
		
		// ��ȭ ���� 5�� �Է�(Ŭ���� 5�� ����)
		Movie[] mv = new Movie[5];
		
		mv[0]=new Movie("���˵���","������",18);
		mv[1]=new Movie("�λ��̵�ƿ�2","�̽�",1);
		mv[2]=new Movie("Ż��","������",12);
		mv[3]=new Movie("������ŷ","�輺��",18);
		mv[4]=new Movie("Ȥ��Ż��","����",15);
		
		for(int i=0; i<mv.length; i++)
		{
			System.out.println(mv[i]);
		}
		
		for(Movie movie : mv)
			System.out.println(movie);
		
	

	}
	
}

class Movies
{
	
}