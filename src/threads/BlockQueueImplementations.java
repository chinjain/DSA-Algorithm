package threads;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/*
 * 
 * 
 * To perform the safe read and write operations on the queue data structure we need to have blocking queue
 * for this.
 * 
 * Java provides several implementations of blocking queues in the 
 * java.util.concurrent package, 
 * including LinkedBlockingQueue, ArrayBlockingQueue, and PriorityBlockingQueue.
 * 
 * 
 */

public class BlockQueueImplementations {

	public static void main(String[] args) {
		BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(3);

		Thread producer = new Thread(new Producer(queue));
		Thread consumer = new Thread(new Consumer(queue));

		producer.start();
		consumer.start();
		
	}

	static class Producer implements Runnable {

		BlockingQueue<Integer> queue;

		public Producer(BlockingQueue<Integer> queue) {
			this.queue = queue;
		}

		@Override
		public void run() {

			try {

				for (int i = 0; i < 10; i++) {
					queue.put(i);
					System.out.println("Produced: " + i);
					Thread.sleep(1000); // Simulate some work
				}

			} catch (Exception e) {
				Thread.currentThread().interrupt();
			}

		}

	}

	static class Consumer implements Runnable {

		BlockingQueue<Integer> queue;

		public Consumer(BlockingQueue<Integer> queue) {
			this.queue = queue;
		}

		@Override
		public void run() {
			try {

				while (true) {
					int val = queue.take();
					System.out.println("Consumed: " + val);
				}

			} catch (Exception e) {
				// TODO: handle exceptio
				Thread.currentThread().interrupt();
			}

		}

	}

}
