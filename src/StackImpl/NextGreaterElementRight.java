package StackImpl;

import java.util.Stack;
/*
 * It's used to find the next greater element of the value ith when we running the loop from left to right hand sight
 * 
 * @author: Chinmay Jain
 * 
 */

public class NextGreaterElementRight {

	public static void main(String[] args) {

		int[] a = { 2, 1, 8, 3, 23, 5, 66, 7, 2, 8, 9 };
		Stack<Integer> st = new Stack<Integer>();
		int res[] = new int[a.length];

		nextGreaterElementFromLeft(a);

		st.push(0);
		for (int i = 1; i < a.length; i++) {
			while (!st.isEmpty() && a[i] > a[st.peek()]) {
				int pos = st.peek();
				res[pos] = a[i];
				st.pop();
			}

			st.push(i);

		}

		while (!st.isEmpty()) {
			int pos = st.peek();
			res[pos] = -1;
			st.pop();
		}

		System.out.println();
		System.out.println("============Print the value while traversing to the left side of the array =================");
		for (int i : res) {
			System.out.print(i + " ");
		}

	}

	private static void nextGreaterElementFromLeft(int[] a) {
		int[] res = new int[a.length];
		Stack<Integer> st = new Stack<Integer>();
		st.push(a[a.length - 1]);
		res[a.length -1] = -1;
		for (int i = a.length - 2; i >= 0; --i) {

			while (!st.isEmpty() && a[i] >= st.peek()) {
				st.pop();
			}

			if (st.isEmpty()) {
				res[i] = -1;
			} else {
				res[i] = st.peek();
			}

			st.push(a[i]);

		}

		System.out.println("=========== Printing the value when we traverse right side of the arrays =============");
		for (int i : res) {
			System.out.print(i + " ");
		}

	}

}
