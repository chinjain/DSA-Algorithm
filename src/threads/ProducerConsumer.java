package threads;

import java.util.LinkedList;

public class ProducerConsumer {

	public static void main(String[] args) throws InterruptedException {
		final PC pc = new PC();
		Thread t1 = new Thread(() -> {

			try {
				pc.produce();
			} catch (Exception e) {
				// TODO: handle exception
			}

		});
		
		Thread t11 = new Thread(() ->{
			
			try {
				System.out.println(Thread.currentThread().getName());
				pc.produce();
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		});

		Thread t2 = new Thread(() -> {

			try {
				pc.consume();
			} catch (Exception e) {
				// TODO: handle exception
			}

		});
		
		
		t1.start();
		t2.start();
		
		// main thread will wait for the complettion of the these 2 threads first the lastly main will execute 
		t1.join();
		t2.join();
	}

}

class PC {

	LinkedList<Integer> list = new LinkedList<Integer>();
	int capacity = 3;

	public void produce() throws InterruptedException {
		int value = 0;
		while (true) {
			synchronized (this) {

				if (list.size() == capacity) {
					wait();
				}
				System.out.println("Producer produced-" + value);

				list.add(value++);

				notify();
				Thread.sleep(1000);

			}
		}

	}

	public void consume() throws InterruptedException {
		while (true) {
			synchronized (this) {

				if (list.size() == 0) {
					wait();
				}

				int resultValue = list.removeFirst();
				System.out.println("Consumer consumed-" + resultValue);
				notify();
				Thread.sleep(1000);

			}
		}
	}

}
