package stringpractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateCharacterOccurences {

	public static void main(String[] args) {
		String inputString = "programming";
		System.out.println("Duplicate characters in the string:");
		findDuplicates(inputString);
		optimal(inputString);
		
		
		String ch [] = inputString.split("");
		
	}

	private static void optimal(String inputString) {
		char[] ch = inputString.toCharArray();
		Arrays.sort(ch);
		inputString = new String(ch);
		StringBuilder sb = new StringBuilder();
		
		System.out.println("Optimal Approach");
		for (int i = 1; i < ch.length; i++) {
			if (inputString.charAt(i) == inputString.charAt(i - 1)
					&& sb.indexOf(String.valueOf(inputString.charAt(i))) == -1) {

				if (sb.length() > 0) {
					sb.append(" ");
				}

				sb.append(inputString.charAt(i));

			}

		}

		System.err.println(sb.toString());

	}

	private static void findDuplicates(String inputString) {

		Set<Character> set = new HashSet<>();

		char[] ch = inputString.toCharArray();
		System.out.println("dupplicate Character");
		for (int i = 0; i < ch.length; i++) {
			if (!set.add(ch[i])) {
				System.out.print(ch[i]);
			}
		}

	}

}
