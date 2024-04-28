package Arrays;

public class CommonFromThreeArrayList {

	public static void main(String[] args) {

		int[] arr1 = { 1, 5, 10, 20, 40, 80 };
		int[] arr2 = { 6, 7, 20, 80, 100 };
		int[] arr3 = { 3, 4, 15, 20, 30, 70, 80, 120 };

//		commonElementBruteForce(arr1, arr2, arr3);
		commonElementsPerformant(arr1, arr2, arr3);
	}

	private static void commonElementBruteForce(int[] arr1, int[] arr2, int[] arr3) {
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				for (int k = 0; k < arr3.length; k++) {
					if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
						System.out.println(arr1[i]);
					} else {
						continue;
					}
				}
			}
		}

	}

	private static void commonElementsPerformant(int[] arr1, int[] arr2, int[] arr3) {
		int i = 0, j = 0, k = 0;

		while (i < arr1.length && j < arr2.length && k < arr3.length) {

			if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
				System.out.println(arr1[i]);
				i++;
				j++;
				k++;
			} else if (arr1[i] < arr2[j]) {
				i++;
			} else if (arr2[j] < arr3[k]) {
				j++;
			} else {
				k++;
			}

		}

	}

}
