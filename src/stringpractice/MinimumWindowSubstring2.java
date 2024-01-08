package stringpractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MinimumWindowSubstring2 {

	public static void main(String[] args) {
		String s = "bbacacdcbbcaadcdca";
		System.out.println(minsub(s));
	}

	private static String minsub(String s) {

		Set<Character> set = new HashSet<Character>();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		String ans = "";

		for (char ch : s.toCharArray()) {
			set.add(ch);
		}

		int i = -1;
		int j = -1;

		int mtch = 0;
		int dmtch = set.size();

		while (i < s.length() - 1) {

			while (i < s.length() - 1 && map.size() < set.size()) {
				i++;
				char ch = s.charAt(i);
				map.put(ch, map.getOrDefault(ch, 0) + 1);
			}

			while (j < i && map.size() == set.size()) {
				String str = s.substring(j + 1, i + 1);
				if (ans.length() == 0 || str.length() < ans.length()) {
					ans = str;
				}

				j++;
				char ch = s.charAt(j);
				if (map.get(ch) == 1) {
					map.remove(ch);
				} else {
					map.put(ch, map.get(ch) - 1);
				}

			}

		}

		return ans;
	}

}
