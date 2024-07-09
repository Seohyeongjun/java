package java_0709_2;

public class ObjectArray3 {

	public static void main(String[] args) {
		
		BoardDAO dao = new BoardDAO();
		Board[] list = dao.findByAll();
		
		for(Board board:list)
		{
			if(board.getTitle().contains("레"))
				System.out.println(board);
		}
		
		System.out.println();
		// hit값이 50이상 출력
		for(Board board:list)
		{
			if(board.getHit()>=15)
				System.out.println(board);
		}
		
		System.out.println();
		// 제목의 글자수가 10자 이상인것만 출력
		for(Board board:list)
		{
			if(board.getTitle().length()>=10)
				System.out.println(board);
		}
		
		System.out.println();
		// content의 글자수가 10자 이하인 객체의
		// title과 writer만 출력
		for(Board board:list)
		{
			if(board.getContent().length()>=4)
				System.out.println(board.getTitle()+", "+board.getWriter());
		}
		
		System.out.println();
		System.out.println("\nhit수가 100이상인 객체들을 추출하여 hot배열에 저장");
		
		Board[]hot =new Board[list.length];
		
		int i=0;	// hot배열 인덱스
		for(Board board:list)
		{
			if(board.getHit()>=15)
				hot[i++]=board;
		}
		
		for(Board data:hot)
		{
			if(data==null) break;
				System.out.println("data"+data);			
		}
		
		System.out.println();
		// write에 신이 포함된 객체만 추출
		// sin배열에 저장 후 출력
		
		Board[]sin=new Board[list.length];
		
		i=0;
		for(Board obj:list)
		{
			if(obj.getWriter().contains("신"))
				sin[i++]=obj;
		}
		
		for(Board obj:sin)
		{
			if(obj==null) break;
			System.out.println("sin"+obj);
		}
		
		
	}

}
