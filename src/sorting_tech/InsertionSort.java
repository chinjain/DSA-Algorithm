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

		for (int right = 1; right < data.length; right++) {
			int key = data[right];
			int left = right - 1;

			while (left >= 0 && key < data[left]) {
				data[left + 1] = data[left];
				--left;
			}
			data[left + 1] = key;

		}

		Arrays.stream(data).forEach(System.out::println);

	}
}
