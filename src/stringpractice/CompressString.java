package stringpractice;

public class CompressString {
	public static void main(String[] args) {

		String s = "wwwwaaadexxxxxxwww";

		System.out.println(compress(s));

	}

	private static String compress(String s) {

		if (s.isEmpty() && s == null) {
			return s;
		}

		StringBuilder sb = new StringBuilder();
		char[] ch = s.toCharArray();
		char prev = ch[0];
		int count = 1;
		for (int i = 1; i < ch.length; i++) {
			if (prev == ch[i]) {
				count++;
			} else {
				sb.append(prev).append(count);
				count = 1;
				prev = ch[i];
			}
		}

		return sb.append(prev).append(count).toString();

	}

}
