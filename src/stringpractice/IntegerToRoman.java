package stringpractice;

public class IntegerToRoman {

	public static void main(String[] args) {
		int n1 = 3;
		int n2 = 58;
		int n3 = 1994;

		System.out.println(intToRoman(n1));
		System.out.println(intToRoman(n2));
		System.out.println(intToRoman(n3));
	}

	private static String intToRoman(int num) {

		if (num < 0 || num > 3999) {
			return "Invalid Input";
		}

		int[] value = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		String[] symbol = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < symbol.length; i++) {
			while (num >= value[i]) {
				num -= value[i];
				sb.append(symbol[i]);
			}
		}

		return sb.toString();
	}

}
