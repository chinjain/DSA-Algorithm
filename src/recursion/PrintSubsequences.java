package recursion;

import java.util.ArrayList;

public class PrintSubsequences {

	public static void main(String[] args) {
		int[] arr = { 3, 1, 2 };
		print(0, arr, arr.length, new ArrayList<Integer>());
	}

	private static void print(int i, int[] arr, int length, ArrayList<Integer> list) {
		// TODO Auto-generated method stub

		if (i == length) {
			for (int num : list) {
				System.out.print(num + " ");
			}

			return;
		}

		list.add(arr[i]);
		i++;
		print(i, arr, length, list);
		list.remove(i);
		print(i, arr, length, list);

	}

}
