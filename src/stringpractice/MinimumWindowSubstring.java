package stringpractice;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {

	public static void main(String[] args) {

		System.err.println(mws("ADOBECODEBANC", "ABC"));

	}

	private static String mws(String s, String t) {
		String str = "";
		int i = -1;
		int j = -1;
		int matchCount = 0;
		int defineMatchCount = t.length();

		Map<Character, Integer> m = new HashMap<Character, Integer>();
		for (char c : t.toCharArray()) {
			m.put(c, m.getOrDefault(c, 0) + 1);
		}

		Map<Character, Integer> m1 = new HashMap<Character, Integer>();

		while (i < s.length() - 1) {
			while (i < s.length() - 1 && matchCount < defineMatchCount) {
				i++;
				char ch = s.charAt(i);
				m1.put(ch, m.getOrDefault(ch, 0) + 1);

				if (m1.getOrDefault(ch, 0) <= m.getOrDefault(ch, 0)) {
					matchCount++;
				}
			}

			while (j < i && matchCount == defineMatchCount) {

				String posString = s.substring(j + 1, i + 1);
				j++;
				if (str.length() == 0 || posString.length() < str.length()) {
					str = posString;
				}

				char ch = s.charAt(j);
				if (m1.get(ch) == 1) {
					m1.remove(ch);
				}
				m1.put(ch, m1.get(ch) - 1);

				if (m1.getOrDefault(ch, 0) < m.getOrDefault(ch, 0)) {
					matchCount--;
				}

			}
		}

		return str;
	}

}
