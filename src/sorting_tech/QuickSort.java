package sorting_tech;

public class QuickSort {

	public static void main(String[] args) {

		int[] arr = { 90, 23, 101, 45, 65, 23, 67, 89, 34, 23 };
		quickSort(arr, 0, 9);
		System.out.println("\n The sorted array is: \n");
		for (int i = 0; i < 10; i++)
			System.out.println(arr[i]);
	}

	private static void quickSort(int[] arr, int lo, int hi) {

		int pivot = arr[hi];
		int i = lo - 1;
		for (int j = lo; j < hi; j++) {
			if(arr[j] <= pivot) {
				
			}
		}

	}

}
