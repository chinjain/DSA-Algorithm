package Exceptions;

public class CheckAndUncheckExceptions {

	public static void main(String[] args) {
		// stringExceptions();
		// fileNotFoundException();
		arrayOutOfBound();

	}

	private static void arrayOutOfBound() {

		try {
			int[] arr = new int[5];
			arr[6] = 9;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println(e.getMessage());
		}

	}

	private static void fileNotFoundException() {

	}

	private static void stringExceptions() {

		try {
			String a = "This is like chipping "; // length is 22
			char c = a.charAt(24); // accessing 25th element

			System.err.println(c);
		} catch (Exception e) {
			System.err.println("String Index Out Of Bound");
		}

	}

}
