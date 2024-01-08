package recursion;

public class FibbonacciRecursion {

	public static void main(String[] args) {
		int n = 5;
		System.out.println(fibb(n));
	}

	private static int fibb(int n) {
		if (n <= 1)
			return n;
		
		return fibb(n - 1) + fibb(n - 2);

	}

}
