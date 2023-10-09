package threads;

/*
 * 
 * MultiTasking => per	
 * 
 * 
 */

public class MultiThreadingExample implements Runnable {

	@Override
	public void run() {
		System.err.println("running");
	}

	public static void main(String[] args) {
		MultiThreadingExample example = new MultiThreadingExample();
		Thread t1 = new Thread(example);
		t1.start();
		t1.suspend();
		
		System.out.println(t1.countStackFrames());
		
//		Runnable runnable = new Runnable() {
//			
//			@Override
//			public void run() {
//			
//			}
//		};
//		
//		
//		runnable.run();

	}

}