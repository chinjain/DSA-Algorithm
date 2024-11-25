package Java8;

public class ReverseString {

	public static void main(String[] args) {

		String s = "CHINMAYJAIN";
        String sb = "nitin";
		System.err.println(reverse(s));
		
		System.err.println("Value of pal"+ " " + palindrome(sb));
	}

	private static boolean palindrome(String s) {
		
		String str = new StringBuilder(s).reverse().toString();
        return str.equals(s);
		
		}
		
	private static String reverse(String s) {
		return new StringBuilder(s).reverse().toString();

	}

}
