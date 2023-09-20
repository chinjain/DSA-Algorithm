package sorting_tech;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {

		int[] data = { 9, 5, 1, 4, 3 };
		InsertionSort is = new InsertionSort();
		is.insertionSort(data);
		System.out.println("Sorted Array in Ascending Order: ");
		System.out.println(Arrays.toString(data));
	}

	private void insertionSort(int[] data) {

		int n = data.length;

		for (int step = 1; step < n; step++) {
			int key = data[step];
			int j = step - 1;

			while (j >= 0 && key < data[j]) {
				data[j + 1] = data[j];
				--j;
			}

			data[j + 1] = key;
		}
	}
}
