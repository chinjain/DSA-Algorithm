package stringpractice;

import java.util.Arrays;

public class CharacterOccurence {
	public static void main(String[] args) {
		int MAX_SIZE = 256;

		int[] count = new int[MAX_SIZE];

//		Arrays.fill(count, 0);
		String s = "ncsdfiunsuia oubfaasfcausiufmducmgiuzdugudfguzmohudguzdgcmfiuihauwhruhaoiwer9234";
		int len = s.length();
		for (int i = 0; i < len; i++) {
			count[s.charAt(i)]++;
		}
		
		for(int i = 0; i < MAX_SIZE; i++) {
			if(count[i] != 0) {
				System.err.println((char)i + " -> " + count[i]);
			}
		}
	}

}
