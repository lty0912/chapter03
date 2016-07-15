package chapter03;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
	
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		
		queue.offer("�Ѹ�");
		queue.offer("������");
		System.out.println(queue.size());
		
		System.out.println(queue.peek());
		
		queue.offer("�����");
		
		System.out.println(queue.poll());
		
		System.out.println(queue.size());
		
		while(queue.isEmpty() == false) {
			System.out.println(queue.poll());
		}
	}

}
