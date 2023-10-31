package QUEUE;

import java.util.LinkedList;
import java.util.Queue;

public class QueueImple {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		queue.offer("hello ");
		queue.offer("WOrld ");
		queue.offer("Byee");

		queue.stream().forEach(System.out::print);
		queue.remove();
		queue.remove();
		System.out.println(queue);
	}
}