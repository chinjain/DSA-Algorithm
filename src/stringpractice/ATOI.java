package stringpractice;

public class ATOI {

	public static void main(String[] args) {

		String s1 = "45";
		String s2 = "   -43";

		System.out.println(atoi(s1));
		System.out.println(atoi(s2));
	}

	private static int atoi(String s) {

		if (s == null || s.isEmpty()) {
			return 0;
		}

		int idx = 0;
		int sign = 1;
		int result = 0;

		// Check for the white spaces
		while (idx < s.length() && s.charAt(idx) == ' ') {
			idx++;
		}

		// Check for the sign
		if (idx < s.length() && (s.charAt(idx) == '+' || s.charAt(idx) == '-')) {
			sign = (s.charAt(idx) == '-') ? -1 : 1;
			idx++;
		}

		while (idx < s.length() && Character.isDigit(s.charAt(idx))) {
//			int digit = Character.getNumericValue(s.charAt(idx));
			int digit = s.charAt(idx) - '0';

			// check For Overflow
			if (result > Integer.MAX_VALUE / 10
					|| (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
				return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
			}

			result = result * 10 + digit;
			idx++;
		}

		return sign * result;

	}

}
