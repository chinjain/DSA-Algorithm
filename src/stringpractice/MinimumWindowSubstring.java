package stringpractice;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {

	public static void main(String[] args) {

		mws("ADOBECODEBANC", "ABC");
		approach2("ADOBECODEBANC", "ABC");

	}

	private static void approach2(String s, String t) {

		int[] map = new int[128];
		int start = 0, end = 0, minLen = Integer.MAX_VALUE, startIdx = 0;
		int count = t.length();

		for (char ch : t.toCharArray()) {
			map[ch]++;
		}

		char[] chs = s.toCharArray();

		while (end < chs.length) {
			if (map[chs[end++]]-- > 0) {
				count--;
			}

			while (count == 0) {
				if (end - start < minLen) {
					startIdx = start;
					minLen = end - start;
				}

				if (map[chs[start++]]++ == 0) {
					count++;
				}
			}
		}

		System.out.println("MinimumWindowSubstring.approach2()");
		System.out.println(new String(chs, startIdx, minLen));

	}

	private static void mws(String s, String t) {
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

			boolean f1 = false;
			boolean f2 = false;

			while (i < s.length() - 1 && matchCount < defineMatchCount) {

				f1 = true;

				i++;
				char ch = s.charAt(i);
				m1.put(ch, m.getOrDefault(ch, 0) + 1);

				if (m1.getOrDefault(ch, 0) <= m.getOrDefault(ch, 0)) {
					matchCount++;
				}
			}

			while (j < i && matchCount == defineMatchCount) {
				f2 = true;

				StringBuilder posString = new StringBuilder(s.substring(j + 1, i + 1));
				// j++;
				if (str.length() == 0 || posString.length() < str.length()) {
					str = posString.toString();
				}

				char ch = s.charAt(j + 1);
				if (m1.get(ch) == 1) {
					m1.remove(ch);
				}
				m1.put(ch, m1.get(ch) - 1);

				if (m1.getOrDefault(ch, 0) < m.getOrDefault(ch, 0)) {
					matchCount--;
				}

				j++;

			}

			if (!f1 && !f2) {
				break;
			}
		}

		System.out.println("MinimumWindowSubstring.mws()");
		System.out.println(str);
	}

}
