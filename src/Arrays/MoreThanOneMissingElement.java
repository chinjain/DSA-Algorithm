package Arrays;

public class MoreThanOneMissingElement {

	public static void main(String[] args) {
		
		int[] arr = { 6, 7, 10, 11, 13 };
		int n = arr.length;
		bruteforce(arr, n); // O(n^2)
		optimaApproach(arr, n);
	}

	private static void optimaApproach(int[] arr, int n) {

		int[] b = new int[arr[n - 1] + 1];

		for (int i = 0; i < n; i++) {

			b[arr[i]] = 1;
		}

		for (int i = arr[0]; i < arr[n - 1]; i++) {
			if (b[i] == 0) {
				System.out.println(b[i] + "Not present");
			}
		}

	}

	private static void bruteforce(int[] arr, int n) {

		int diff = arr[0];

		for (int i = 0; i < n; i++) {
			if (diff != arr[i] - i) {

				while (diff < arr[i] - i) {
					System.out.println("Missing element is " + (i + diff));
					diff++;
				}

			}
		}

	}

}
