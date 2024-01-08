package recursion;

public class PalindromeRecursion {

	public static void main(String[] args) {
		String s = "MADaM";
		System.out.println(func(s.toLowerCase(), 0, s.length()));
	}

	private static boolean func(String s, int i, int n) {
		
		if( i > n/2) {
			return true;
		}

		if (s.charAt(i) != s.charAt(n - i - 1)) {
			return false;
		}
		i++;
		return func(s, i, n);

	}

}
