package stringpractice;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {
	
	public static void main(String[] args) {
		String s = "abcabddbcbaabccddabcdabcd";
		
		withoutRepeatingCharacter(s);
	}

	private static void withoutRepeatingCharacter(String s) {
		int ans = 0;
		Set<Character> set = new HashSet<Character>();
		int i = 0;
		int j = 0;
		
		while(i < s.length()) {
			if(!set.contains(s.charAt(i))) {
				set.add(s.charAt(i));
				i++;
				ans = Math.max(ans, i - j);
			}else {
				set.remove(s.charAt(j));
				j++;
			}
		}
		
	}
	

}
