package stringpractice;

public class RemoveOuterPranatheses {

	public static void main(String[] args) {
		String s = "(()())(())()";

		optimalSolution(s);
		// output = ()()() -::-

		int count = 0;
		String res = "";
		for (int i = 0; i < s.length(); i++) {

			// count++ > 0 will not consider first parantheses
			if (s.charAt(i) == '(' && count++ > 0) {
				res += s.charAt(i);
			}
			if (s.charAt(i) == ')' && count-- > 1) {
				res += s.charAt(i);
			}
		}

		System.out.println(res);

	}

	private static void optimalSolution(String s) {
		
		int openCount = 0;
		int closeCount = 0;
		String result = "";
		int start = 0;
		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c == '(')
				openCount++;
			else if(c == ')')
				closeCount++;
			if(openCount == closeCount) {
				result += s.substring(start+1,i);
				start = i + 1;
				openCount = 0;
				closeCount = 0;
			}
			
		}
		
		System.err.println("Optimal Solution" + result);

	}

}
