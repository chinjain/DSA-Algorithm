package StackImpl;

import java.util.Stack;

public class NextSmallerElement {

	public static void main(String[] args) {
		int[] a = { 2, 1, 8, 3, 23, 5, 66, 7, 2, 8, 9 };
		nextSmallFromRight(a);
		nextSmallFromLeft(a);
	}

	private static void nextSmallFromLeft(int[] a) {
		// TODO Auto-generated method stub

	}

	private static void nextSmallFromRight(int[] a) {
		Stack<Integer> st = new Stack<Integer>();
		int res[] = new int[a.length];
		res[a.length - 1] = -1;

		for (int i = a.length - 2; i >= 0; --i) {

			while (!st.isEmpty() && st.peek() > a[i]) {
				st.pop();
			}
			if (st.isEmpty()) {
				res[i] = -1;
			} else {
				res[i] = st.peek();
			}

			st.push(a[i]);

		}
		printArray(res);
	}

	private static void printArray(int[] res) {
		for (int i : res) {
			System.out.print(i + " ");
		}

	}
}
