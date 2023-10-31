package stringpractice;

public class RotationOfOtherString {

	public static void main(String[] args) {
		String s1 = "waterbottle";
		String s2 = "bottlewater";

		bruteForce(s1, s2);
		optimal(s1, s2);
	}

	private static void optimal(String s1, String s2) {
		if (s1.length() != s2.length()) {
			System.out.println("Not a rotation");
		}
		
		String ss = s1+s1;
		System.out.println(ss.contains(s2));

	}

	private static void bruteForce(String s1, String s2) {

		if (s1.length() != s2.length()) {
			System.out.println("Not a rotation");
		}

		int n = s1.length();
		for (int i = 0; i < n; i++) {
			String rotated = s1.substring(i) + s2.substring(0, i);
			if (s1.equals(rotated)) {
				System.out.println("S1 and S2 are rotation of each other");
			}
		}

	}

}
