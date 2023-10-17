package threads;

public class SleepThreads extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			Thread.yield();
			System.out.println("Running " + i + Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			Thread.yield();
			System.out.println(i + " " + Thread.currentThread().getName());
		}
		
		SleepThreads threads = new SleepThreads();
		threads.start();
		threads.yield();
	}
}
