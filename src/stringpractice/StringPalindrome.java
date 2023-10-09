package stringpractice;

public class StringPalindrome {

	public static void main(String[] args) {
		String str = "abbaa";
		System.out.println(str.substring(0 ,str.length() - 0));
		System.out.println("Naive approach Answer " +  Naive_palindrome(str));
		System.out.println("Two ptr solution : " + twoPtrPalindrome(str));
	}

	private static boolean twoPtrPalindrome(String str) {
	
		int i = 0;
		int j = str.length() - 1;
		
		return false;
	}

	private static boolean Naive_palindrome(String str) {
		
		//Tc is : O(n)  && SC : O(n) both of them is order of n as it's taking n space to store the element 

		String rev = "";
		for (int i = str.length() - 1; i >= 0; --i) {
			rev = rev + str.charAt(i);
		}

		if (str.equals(rev)) {
			return true;
		}

		return false;
	}

	
}
