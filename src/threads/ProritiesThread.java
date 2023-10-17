package threads;

public class ProritiesThread extends Thread{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getPriority()+ "Chil");
	}
	
	public static void main(String[] args) {
		
		System.out.println("main");
		
		ProritiesThread t1 = new ProritiesThread();
		ProritiesThread t2 = new ProritiesThread();
		
//		t1.setPriority(9);
//		t2.setPriority(10);
		
		t1.start();
		t2.start();
		
	}
	
}
