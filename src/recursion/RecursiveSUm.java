package recursion;

public class RecursiveSUm {

	public static void main(String[] args) {
		sum(10, 0);

		int n = funcSum(10);
		System.out.println("Sum of val us :" + n);
	}

	public RecursiveSUm() {
		System.err.println("Hello");
	}

	private static int funcSum(int i) {
		if (i == 0) {
			return 0;
		}
		return i + funcSum(i - 1);

	}

	private static void sum(int i, int sum) {

		if (i < 1) {
			System.out.println(sum);
			return;
		}
		sum(i - 1, sum + i);
	}

}
