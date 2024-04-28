package Exceptions;

public class TryCatchFinally {

	public static void main(String[] args) {

		int a = call();
		
		System.out.println(a);

	}

	private static int call() {

		try {

			throw new RuntimeException("Try Block Executed");

		} catch (Exception e) {
			System.out.println("TryCatchFinally.main()");
			System.out.println("Catch block");

			return 20;
		} finally {
			System.out.println("Finally Executed");
			return 30;
		}
	}

}
