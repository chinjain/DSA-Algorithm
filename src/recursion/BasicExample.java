package recursion;

public class BasicExample {

	static int counter = 1;
	public static void main(String[] args) {

		System.out.println("Recursion Starts");

		print();
	}

	private static void print() {
		
		System.out.println(counter++);
		if(counter == 25) {
			return;
		}
		print();

	}
}
