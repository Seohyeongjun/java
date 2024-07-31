package java_0709_2;

public class ObjectArray3 {

	public static void main(String[] args) {
		
		BoardDAO dao = new BoardDAO();
		Board[] list = dao.findByAll();
		
		for(Board board:list)
		{
			if(board.getTitle().contains("��"))
				System.out.println(board);
		}
		
		System.out.println();
		// hit���� 50�̻� ���
		for(Board board:list)
		{
			if(board.getHit()>=15)
				System.out.println(board);
		}
		
		System.out.println();
		// ������ ���ڼ��� 10�� �̻��ΰ͸� ���
		for(Board board:list)
		{
			if(board.getTitle().length()>=10)
				System.out.println(board);
		}
		
		System.out.println();
		// content�� ���ڼ��� 10�� ������ ��ü��
		// title�� writer�� ���
		for(Board board:list)
		{
			if(board.getContent().length()>=4)
				System.out.println(board.getTitle()+", "+board.getWriter());
		}
		
		System.out.println();
		System.out.println("\nhit���� 100�̻��� ��ü���� �����Ͽ� hot�迭�� ����");
		
		Board[]hot =new Board[list.length];
		
		int i=0;	// hot�迭 �ε���
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
		// write�� ���� ���Ե� ��ü�� ����
		// sin�迭�� ���� �� ���
		
		Board[]sin=new Board[list.length];
		
		i=0;
		for(Board obj:list)
		{
			if(obj.getWriter().contains("��"))
				sin[i++]=obj;
		}
		
		for(Board obj:sin)
		{
			if(obj==null) break;
			System.out.println("sin"+obj);
		}
		
		
	}

}
