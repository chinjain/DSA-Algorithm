package threads;

public class IPCThreadComm {

	public static void main(String[] args) {
		ThreadB b = new ThreadB();

		b.start();
		synchronized (b) {
			try {
				System.out.println("b waiting to wake up");
				b.wait();
				System.out.println(b.total);
			} catch (Exception e) {
				System.out.println("Total is: " + b.total);
			}
		}
	}

}

class ThreadB extends Thread {

	int total;

	public void run() {

		synchronized (this) {
			for (int i = 0; i < 99; i++) {
				total += i;
			}
			notify();
		}
	}

}
