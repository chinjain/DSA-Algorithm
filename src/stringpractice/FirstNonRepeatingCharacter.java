package stringpractice;

public class FirstNonRepeatingCharacter {
	
	public static void main(String[] args) {
		String str = "cCdhdsfdifnmay";
		int[] freq = new int[256];
		
		for(int i = 0; i < str.length(); i++) {
			freq[str.charAt(i) - 'a']++;
		}
		
		for(int i = 0; i < str.length(); i++) {
			if(freq[str.charAt(i) - 'a'] == 1) {
				System.out.println("First Non repeating charracter is  " + str.charAt(i));
				return;
			}
		}
		
		System.out.println("No one is here");
	}

}
