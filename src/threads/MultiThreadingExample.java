package threads;

/*
 * 
 * MultiTasking => per	
 * 
 * 
 */

// Case 4 multi task with multi threads 
public class MultiThreadingExample implements Runnable {

	@Override
	public void run() {
		System.err.println("running");
	}

	public static void main(String[] args) {
		MultiThreadingExample example = new MultiThreadingExample();
		Thread t1 = new Thread(example);
		Mythread1 mythread1 = new Mythread1();
		mythread1.start();
		mythread1.setName("abcd");
		Mythread2 mt2 = new Mythread2();
		mt2.start();
		System.out.println(t1.isAlive());
		t1.start();
		Thread.currentThread().setName("Chinmay's-Thread");
//		System.out.println(10/0);
	}

}

class Mythread1 extends Thread {

	@Override
	public void run() {
		System.out.println("Thread 1 running");
		
		System.out.println(Thread.currentThread().getName());
	}

}

class Mythread2 extends Thread {

	@Override
	public void run() {
		System.out.println("Thread 2 running");
	}

}