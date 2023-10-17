package threads;

public class DaemonThreads extends Thread {

//	@Override
//	public void run() {
//		System.out.println("daemon");
//	}

	public static void main(String[] args) {
		
		System.out.println("Hello main");
		
		DaemonThreads threads = new DaemonThreads();
		threads.setDaemon(true);
		threads.start();
	}

}
