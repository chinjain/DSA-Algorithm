package stringpractice;

import java.util.*;

public class FindAllAnagramStrings {

	public static void main(String[] args) {

		String s = "cbaebabacd";
		String p = "abc";

		List<Integer> ans = new ArrayList<Integer>();
		Map<Character, Integer> pattern = new HashMap<Character, Integer>();
		Map<Character, Integer> source = new HashMap<Character, Integer>();

		for (int k = 0; k < p.length(); k++) {

			char p_char = p.charAt(k);
			char c_char = s.charAt(k);
			pattern.put(p_char, pattern.getOrDefault(p_char, 0) + 1);
			source.put(c_char, source.getOrDefault(c_char, 0) + 1);

		}
		int count = 0;
		if(compare(pattern, source)){
			count++;
			ans.add(0);
		}

		int i = p.length();
		int j = 0;


		while (i < s.length()) {

			source.put(s.charAt(i), source.getOrDefault(s.charAt(i), 0) + 1);

			char ch = s.charAt(i - p.length());
			if (source.get(ch) == 1) {
				source.remove(ch);
			} else {
				source.put(ch, source.get(ch) - 1);
			}

			if (compare(pattern, source)) {
				count++;
				ans.add(j);
			}

			i++;
			j++;

		}


		System.out.println(ans);
		System.err.println(count);

	}

	private static boolean compare(Map<Character, Integer> pattern, Map<Character, Integer> source) {

		if(pattern.size() != source.size())
			return false;

		for (char sch : source.keySet()) {
			if (!Objects.equals(pattern.getOrDefault(sch, 0), source.get(sch))) {
				return false;
			}
		}

		return true;
	}

}
