package java_0712_3;

public class LinkedList2 {

	Node head = null;	// ��ũ�帮��Ʈ�� ù��° ���
	Node tail;			// ��ũ�帮��Ʈ�� ������ ���
	
	void add(int n)
	{
		Node temp = new Node(n);
		
		if(head == null)
		{
			head = temp;
			tail = temp;
		}
		else
		{
			tail.next=temp;
			tail=temp;
		}		
	}
	
	@Override
	public String toString()
	{
		String out="[";
		Node move = head;
		while(move!=null)
		{
			out += move.num+", ";
			move = move.next;
		}
		out = out.substring(0, out.length()-2);
		out += "]";
		
		return out;
	}
	
	int get(int index)
	{
		return 0;
	}
	
	void remove(int index)
	{
		
	}

}


// �� ������ ���� - add
// ������ ���� - remove
// ��ü ��� - toString
// ������ �ϳ� ��� - get