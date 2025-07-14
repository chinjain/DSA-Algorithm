package stringpractice;

import java.util.HashMap;
import java.util.Map;

public class RomanToDecimal {

	public static void main(String[] args) {

		String roman1 = "III";
		String roman2 = "IV";
		String roman3 = "IX";
		String roman4 = "LVIII";
		String roman5 = "MCMXCIV";

		System.out.println(romanToDecimal(roman1)); // Output: 3
		System.out.println(romanToDecimal(roman2)); // Output: 4
		System.out.println(romanToDecimal(roman3)); // Output: 9
		System.out.println(romanToDecimal(roman4)); // Output: 58
		System.out.println(romanToDecimal(roman5)); // Output: 1994
	}

	private static int romanToDecimal(String r) {

		if (r == null || r.isEmpty()) {
			return 0;
		}
	//MCMXCIV
		Map<Character, Integer> romanMap = new HashMap<>();
		romanMap.put('I', 1);
		romanMap.put('V', 5);
		romanMap.put('X', 10);
		romanMap.put('L', 50);
		romanMap.put('C', 100);
		romanMap.put('D', 500);
		romanMap.put('M', 1000);

		int result = 0;
		int prevValue = 0;

		for (int i = r.length() - 1; i >= 0; --i) {
			char curr = r.charAt(i);
			int value = romanMap.get(curr);

			if (value < prevValue) {
				result -= value;
			} else {
				result += value;
			}

			prevValue = value;

		}

		return result;
	}

}
