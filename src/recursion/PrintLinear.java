package recursion;

public class PrintLinear {

	public static void main(String[] args) {
		fun(1, 10);

		System.out.println("PrintLinear.main()");
		System.err.println("Print in reverser Order");
		rev(10, 10);
		
		printLineWithHighNumber(5,5);
		System.out.println("Reverse Using Backtrack");
		reverseUsingBacktracking(1,5);
	}

	private static void reverseUsingBacktracking(int i, int j) {
		if(i > j) {
			return ;
		}
		
		reverseUsingBacktracking(i+1, j);
		System.out.println(i);
	}

	private static void printLineWithHighNumber(int i, int j) {
		if (i < 1) {
			return ;
		}
		
		printLineWithHighNumber(i-1, j);
		System.out.println(i);
	}

	private static void rev(int i, int n) {
		// TODO Auto-generated method stub

		if (i < 1) {
			return;
		}

		System.out.println(i--);
		rev(i, n);

	}

	private static void fun(int i, int n) {
		// TODO Auto-generated method stub

		if (i > n) {
			return;
		}

		System.out.println(i++);
		fun(i, n);
	}

}
