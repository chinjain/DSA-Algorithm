package StackImpl;

import java.util.Stack;

public class SlidingMaxWindow {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int k = 3;

		bruteForce(arr, k);
		optimal(arr, k);
	}

	private static void optimal(int[] arr, int k) {
		Stack<Integer> st = new Stack<Integer>();
		st.push(arr.length - 1);
		int [] nge = new int[arr.length];
		nge[arr.length - 1] = arr.length;
		
		for(int i = arr.length -2; i>=0; --i) {
			while(!st.isEmpty() && arr[i] > arr[st.peek()]) {
				st.pop();
			}
			
			if(st.isEmpty()) {
				nge[i] = arr.length;
			}else {
				nge[i] = st.peek();
			}
			
			st.push(i);
		}
		
		int j = 0; 
		for(int i = 0; i <= arr.length - k; i++) {
			if(j < i) {
				j = i;
			}
			
			while(nge[j] < i+k) {
				j = nge[j];
			}
			
			System.out.print("Optimal max " + arr[j] + " ");
		}

	}

	private static void bruteForce(int[] arr, int k) {
		int j, max;

		for (int i = 0; i <= arr.length - k; i++) {

			max = arr[i];

			for (j = 1; j < k; j++) {
				if (arr[i + j] > max) {
					max = arr[i + j];
				}
			}

			System.out.print(max + " ");
		}

	}

}
