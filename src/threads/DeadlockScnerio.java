package threads;

public class DeadlockScnerio {

	private static final Object resource1 = new Object();
	private static final Object resource2 = new Object();

	public static void main(String[] args) {

		Thread thread1 = new Thread(() -> {
			synchronized (resource1) {
				System.out.println("Thread 1 : acquire resource 1");
				try {
					Thread.sleep(100);

				} catch (Exception e) {
					// TODO: handle exception
				}

				System.out.println("Thread 1: Waiting for resource 2...");
				synchronized (resource2) {
					System.out.println("Thread 1: Acquired resource 2.");
				}
			}
		});

		Thread thread2 = new Thread(() -> {
			synchronized (resource2) {
				System.out.println("Thread 2 : acquire resource 2");
				try {
					Thread.sleep(100);

				} catch (Exception e) {
				}
				System.out.println("Thread 2: Waiting for resource 1...");
				synchronized (resource1) {
					System.out.println("Thread 2: Acquired resource 1...");
				}
			}

		});

		thread1.start();
		thread2.start();

	}

}
