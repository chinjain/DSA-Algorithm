package threads;

public class DeadLockSolved {

	private static final Object resource1 = new Object();
	private static final Object resource2 = new Object();

	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Thread(() -> {

			synchronized (resource1) {
				System.out.println("Thread 1 : acquire resource 1");

				try {
					Thread.sleep(100);
				} catch (Exception e) {
					// TODO: handle exception
				}

				synchronized (resource2) {
					System.out.println("Thread 1 : acquire resource 2");
				}

			}

		}

		);

		Thread t2 = new Thread(() -> {

			synchronized (resource1) {
				System.out.println("Thread 2 : acquire resource 1");
				try {

					Thread.sleep(100);
				} catch (Exception e) {
					// TODO: handle exception
				}

				synchronized (resource2) {
					System.out.println("Thread 2 : acquire resource 2");
				}

			}

		});
		
		
		t2.start();
		t1.start();
		
		t2.join();
		t1.join();

	}

}
