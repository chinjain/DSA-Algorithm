package com.binarySearcj;

public class HowManyTimesArrayRotated {

	public static void main(String[] args) {
		int[] arr = { 3, 4, 5, 1, 2 };
		search(arr);
	}

	private static void search(int[] arr) {
		int lo = 0;
		int hi = arr.length - 1;
		int ans = Integer.MAX_VALUE;

		while (lo <= hi) {
			int mid = lo + (hi - lo) / 2;

			if (arr[lo] <= arr[hi]) {

				if (arr[lo] < ans) {
					ans = arr[lo];
				}
				break;
			}

			if (arr[lo] <= arr[mid]) {
				if (arr[lo] <= ans) {
					ans = arr[lo];
				}

				lo = mid + 1;
			} else {
				hi = mid - 1;
				if (arr[mid] < ans) {
					ans = arr[mid];
				}
			}
		}

		System.out.println(ans);
	}

}
