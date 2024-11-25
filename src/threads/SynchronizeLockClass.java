package threads;

import java.util.Map;

public class SynchronizeLockClass {

	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		Thread3 t3 = new Thread3();
		Thread4 t4 = new Thread4();
		Thread5 t5 = new Thread5();

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}

}

class Thread1 extends Thread {

	@Override
	public void run() {
//		Main.printTable(5);
		Main m1 = new Main();
		Main.printTable(5);
	}

}

class Thread2 extends Thread {

	@Override
	public void run() {
//		Main.printTable(6);
		Main m2 = new Main();
		Main.printTable(6);
	}

}

class Thread3 extends Thread {

	@Override
	public void run() {
//		Main.printTable(8);
		Main m3 = new Main();
		Main.printTable(8);
	}

}

class Thread4 extends Thread {

	@Override
	public void run() {
//		Main.printTable(9);
		Main m4 = new Main();
		Main.printTable(9);
	}

}

class Thread5 extends Thread {

	@Override
	public void run() {
//		Main.printTable(13);
		Main m5 = new Main();
		Main.printTable(13);
	}

}

class Main {

	synchronized static void printTable(int num) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " * " + i + " = " + num * i);
		}
	}

}
