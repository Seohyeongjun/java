package java_0715_1;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueStudy {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(); //�켱���� Q, FIFO ���� �ȵ�
		pq.offer(56);
		pq.offer(100);
		pq.offer(5);
		pq.offer(30);
		pq.offer(2);
		System.out.println(pq);
		System.out.println(pq.size());
		
		for(int i=0; i<5; i++)
		{
			System.out.println(pq.poll());
		}
		
		// �����ڰ� ������ Ŭ������ ��ü���� �켱������ ���Ϸ���
		// compare�޼��带 ���� �ؾ��Ѵ�.
		// �������̽� Comparator�� implements�ؾ� �ȴ�.
		
		Queue<String> q = new LinkedList<>();	// FIFO ����
		
		q.add("�ڵ�");
		q.offer("����");
		q.offer("����");
		q.offer("���");					// offer : in
		q.offer("����");
		
		
		System.out.println(q.poll());	// poll() : out
		System.out.println(q);
		System.out.println(q.peek());	// peek() : ������ ������ �� Ȯ��
		System.out.println(q);
		System.out.println(q.element());
		System.out.println(q.size());
		System.out.println(q.contains("������"));
		
	}
}


/*
 Queue - ť
	FIFO

*/