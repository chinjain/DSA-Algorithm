package threads;

public class AtomicAndVolatile {
	
	public static void main(String[] args) {
		SharedResource s1 = new SharedResource();
		Thread t1 = new Thread(s1);
		Thread t2 = new Thread(s1);
		Thread t3 = new Thread(s1);
		Thread t4 = new Thread(s1);
		Thread t5 = new Thread(s1);
		
		t1.start();t2.start();t3.start();t4.start();t5.start();
	}
}

class SharedResource implements Runnable{

	private volatile boolean flag = false;

	public void setFlagTrue() {
		this.flag = true;
	}

	public void printFlag() {
		// Reading the volatile variable
		System.out.println("Flag: " + flag);
	}

	@Override
	public void run() {
		printFlag();
		
	}
}