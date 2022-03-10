package javase.learning.part3.collection.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {
	public static void main(String[] args) {
		Queue<Integer> queue = new PriorityQueue<Integer>();
		queue.add(3);
		queue.add(2);
		queue.add(4);
		queue.add(5);
		printQueue(queue);
		
		Integer peek = queue.peek();
		System.out.println("Peek element - "+peek);
		
		Integer poll = queue.poll();
		System.out.println("Poll element - "+poll);
		System.out.println("----------------");
		printQueue(queue);
		
		while(queue.peek() != null) {
			Integer poll2 = queue.poll();
			System.out.println(poll2);
		}
		System.out.println("----------------");
		System.out.println(queue.size());
	}
	
	private static void printQueue(Queue queue) {
		for (Object o : queue) {
			System.out.println(o);
		}
		
		System.out.println("----------------");
	}
}
