package Arrays;

import java.util.Arrays;

public class SeprateNegPos {

	public static void main(String[] args) {

		int[] arr = { -12, 11, -13, -5, 6, -7, 5, -3, -6 };

		bruteForce(arr);
		optimal(arr);

	}

	private static void bruteForce(int[] arr) {
		int[] neg = new int[arr.length];
		int[] pos = new int[arr.length];
		int negCount = 0;
		int posCount = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				neg[negCount++] = arr[i];
			} else {
				pos[posCount++] = arr[i];
			}
		}

		int i = 0;
		for (int j = 0; i < negCount; i++) {
			arr[i++] = neg[j];
		}

		for (int j = 0; i < posCount; i++) {
			arr[i++] = pos[j];
		}

		System.out.println("================Brute Approach ===================");
		System.out.println(Arrays.toString(arr));

	}

	private static void optimal(int[] arr) {
		int left = 0; 
		int right = arr.length -1;
		
		while(arr[left] < 0 && left < right) {
			left++;
		}
		
		while(arr[right] >= 0 && left < right) {
			right--;
		}
		
		if(left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
		
		System.err.println(Arrays.toString(arr));
	}

}
