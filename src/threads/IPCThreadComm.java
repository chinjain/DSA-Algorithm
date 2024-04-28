package threads;

public class IPCThreadComm {

	public static void main(String[] args) {
		ThreadB b = new ThreadB();

		b.start();
		synchronized (b) {
			try {
				System.out.println("b waiting to wake up");
				b.wait();
			} catch (Exception e) {
				System.out.println("Total is: " + b.total);
			}
		}
	}

}

class ThreadB extends Thread {

	int total;

	@Override
	public void run() {

		synchronized (this) {
			for (int i = 0; i < 99; i++) {
				total += i;
			}
			notify();
		}
	}

}
