package java_0715_1;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueStudy {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(); //우선순위 Q, FIFO 적용 안됨
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
		
		// 개발자가 정의한 클래스의 객체에서 우선순위를 정하려면
		// compare메서드를 구형 해야한다.
		// 인터페이스 Comparator를 implements해야 된다.
		
		Queue<String> q = new LinkedList<>();	// FIFO 적용
		
		q.add("자두");
		q.offer("수박");
		q.offer("참외");
		q.offer("살수");					// offer : in
		q.offer("참외");
		
		
		System.out.println(q.poll());	// poll() : out
		System.out.println(q);
		System.out.println(q.peek());	// peek() : 다음에 나가는 것 확인
		System.out.println(q);
		System.out.println(q.element());
		System.out.println(q.size());
		System.out.println(q.contains("복숭아"));
		
	}
}


/*
 Queue - 큐
	FIFO

*/