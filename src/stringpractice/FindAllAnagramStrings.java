package stringpractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllAnagramStrings {

	public static void main(String[] args) {

		String s = "cbaebabacd";
		String p = "abc";

		List<Integer> ans = new ArrayList<Integer>();
		Map<Character, Integer> pattern = new HashMap<Character, Integer>();
		Map<Character, Integer> source = new HashMap<Character, Integer>();

		for (int k = 0; k < p.length(); k++) {
			char ch = p.charAt(k);
			pattern.put(ch, pattern.getOrDefault(ch, 0) + 1);
		}

		for (int k = 0; k < p.length(); k++) {
			char ch = s.charAt(k);
			source.put(ch, source.getOrDefault(ch, 0) + 1);
		}

		int i = p.length();
		int j = 0;
		int count = 0;

		while (i < s.length()) {
			if (compare(pattern, source) == true) {
				count++;
				ans.add(j);
//				System.err.println(true);
			}

			source.put(s.charAt(i), source.getOrDefault(s.charAt(i), 0) + 1);
			char ch = s.charAt(i - p.length());
			if (source.get(ch) == 1) {
				source.remove(ch);
			} else {
				source.put(ch, source.get(ch) - 1);
			}

			i++;
			j++;
		}

		if (compare(pattern, source) == true) {
			count++;
			ans.add(j);
		}

		System.out.println(ans);
		System.err.println(count);

	}

	private static boolean compare(Map<Character, Integer> pattern, Map<Character, Integer> source) {

		for (char sch : source.keySet()) {
			if (pattern.getOrDefault(sch, 0) != source.get(sch)) {
				return false;
			}
		}

		return true;
	}

}
