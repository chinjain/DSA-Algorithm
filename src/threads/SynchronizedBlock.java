package threads;

public class SynchronizedBlock extends Thread {

	private static int counter = 0;

	@Override
	public void run() {
//		System.out.println(Thread.currentThread().getName());
		synchronized (this) {
			System.out.println(Thread.currentThread().getName() + " " + ++counter);
		}
	}

	public static void main(String[] args) {

		SynchronizedBlock t1 = new SynchronizedBlock();
		SynchronizedBlock t2 = new SynchronizedBlock();
		SynchronizedBlock t3 = new SynchronizedBlock();
		SynchronizedBlock t4 = new SynchronizedBlock();
		SynchronizedBlock t5 = new SynchronizedBlock();
		SynchronizedBlock t6 = new SynchronizedBlock();

//		SynchronizedBlock.counter++;
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.setDaemon(true);
		t6.start();
	}

}
