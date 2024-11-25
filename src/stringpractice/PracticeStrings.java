package stringpractice;

public class PracticeStrings {

	public static void main(String[] args) {

		String s = "abccbc";
		System.err.println(s.substring(2));

		// print all the substring in java :--
		// O(n^2)
//		for (int i = 0; i < s.length(); i++) {
//			for (int j = i + 1; j <= s.length(); j++) {
//				System.err.println(s.substring(i, j) + " ");
//			}
//		}

		String s2 = "hello";
		String s3 = "world";

		// Print all Palindrome of Strings
		findPalindromSubstring(s);

	}

	public static void findPalindromSubstring(String s) {
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				String ss = s.substring(i, j);
				if(isPalindrome(ss)) {
					System.err.println(ss);	
				}
				
			}
		}

	}

	private static boolean isPalindrome(String ss) {
		int i = 0;
		int j = ss.length() - 1;
		while(i <= j) {
			char ch1 = ss.charAt(i);
			char ch2 = ss.charAt(j);
			if(ch1 != ch2) {
				return false;
			}else {
				i++;
				--j;
			}
		}
		return true;
//		return new StringBuilder(ss).reverse().equals(ss);
	}

}
