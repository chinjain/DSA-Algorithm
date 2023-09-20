package stringpractice;

public class DuplicateCharacterOccurences {

	public static void main(String[] args) {
		String inputString = "programming";
		System.out.println("Duplicate characters in the string:");
		findDuplicates(inputString);
	}

	private static void findDuplicates(String inputString) {

		int checker = 0;

		for (char ch : inputString.toCharArray()) {
			int bitIndex = ch - 'a';
			// Check if the bit corresponding to the character is already set
			if ((checker & (1 << bitIndex)) > 0) {
				System.out.println("Character '" + ch + "' is a duplicate.");
			} else {
				// Set the bit for the character
				checker |= (1 << bitIndex);
			}

		}

	}

}
