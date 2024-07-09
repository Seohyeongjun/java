package java_0709;

public class ObjectArray1 {
	public static void main(String[] args)
	{
//		// Movies는클래스명
//		Movies[] mv = new Movies[10];
//		
//		for(int i=0; i<mv.length; i++)
//		{
//			// 클래스 선언을 다 해줘야 한다.
//			mv[i]=new Movie1();
//		}
		
//		for(int i=0; i<mv.length; i++)
//		{
//			System.out.println(mv[i]);
//		}
		
		
		// 영화 정보 5개 입력(클래스 5개 선언)
		Movie[] mv = new Movie[5];
		
		mv[0]=new Movie("범죄도시","강윤성",18);
		mv[1]=new Movie("인사이드아웃2","켈시",1);
		mv[2]=new Movie("탈주","이종필",12);
		mv[3]=new Movie("하이재킹","김성한",18);
		mv[4]=new Movie("혹성탈출","웨스",15);
		
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