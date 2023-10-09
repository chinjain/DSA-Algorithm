package stringpractice;

import java.util.Arrays;
import java.util.Stack;
import java.util.stream.Collectors;

public class ReverseEachWord {

	public static void main(String[] args) {
		String s = "My Name is Chinmay";
		reverseStringUsingStack(s);
		reverseStringUsingSplit(s);
	}

	private static void reverseStringUsingSplit(String s) {
		// TODO Auto-generated method stub

		String result = Arrays.asList(s.split(" ")).stream().map(str -> new StringBuilder(str).reverse()).collect(Collectors.joining(" "));

		System.out.println("Using Split Method:-> " + result);
	}

	private static void reverseStringUsingStack(String s) {
		// TODO Auto-generated method stub

		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ')
				stack.push(s.charAt(i));
			else {
				while (stack.isEmpty() == false) {
					System.out.print(stack.peek());
					stack.pop();
				}

				System.out.print(" ");
			}
		}

		while (stack.isEmpty() == false) {
			System.out.print(stack.peek());
			stack.pop();
		}

	}
}
