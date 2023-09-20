package Java8;

public class ReverseString {

	public static void main(String[] args) {

		String s = "CHINMAYJAIN";
		StringBuilder sb = new StringBuilder("nitin");
		System.err.println(reverse(s));
		
		System.err.println("Value of pal"+ " " + palindrome(sb.toString()));
	}

	private static boolean palindrome(String s) {
		
		String str = new StringBuilder(s).reverse().toString();
		if(str.equals(s))
			return true;
		else
			return false;
		
		}
		
	private static String reverse(String s) {
		return new StringBuilder(s).reverse().toString();

	}

}
