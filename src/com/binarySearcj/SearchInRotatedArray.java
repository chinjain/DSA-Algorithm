package com.binarySearcj;

public class SearchInRotatedArray {

	public static void main(String[] args) {
		int[] arr = { 20, 17, 15, 14, 13, 12, 10, 9, 8, 4 };
		int target = 9;

		System.out.println(search(arr, target));
	}

	private static int search(int[] arr, int target) {

		int lo = 0;
		int hi = arr.length - 1;

		while (lo <= hi) {
			int mid = (lo + hi) / 2;

			if (arr[mid] == target) {
				return mid;
			}

			if (arr[lo] <= arr[mid]) {
				if (arr[lo] <= target && target <= arr[mid]) {
					hi = mid - 1;
				} else {
					lo = mid + 1;
				}
			} else {
				if (arr[mid] <= target && target <= arr[hi]) {
					lo = mid + 1;
				} else {
					hi = mid - 1;
				}
			}
		}

		return -1;

	}

}
