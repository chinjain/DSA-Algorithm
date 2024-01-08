package Slidingwindow;

import java.util.HashSet;

public class ArrayWithLargestContigousASubarray {
	
	public static void main(String[] args) {
		bruteForces();
		optimalCode();
	}

	private static void optimalCode() {
		int[] arr = { 9, 2, 1, 5, 6, 23, 24, 22, 23, 19, 17, 16, 18, 39, 0 };
		int n = arr.length;

		int ans = 0;
		
		int left = 0;
		int right = 0;
		HashSet<Integer> set = new HashSet<Integer>();
		while(right < n) {
			
			if(!set.contains(arr[right])) {
				set.add(arr[right]);
				right++;
				ans = Math.max(ans, right-left);
			}else {
				set.remove(arr[left]);
				left++;
			}
			
		}
		
		
		System.out.println("ArrayWithLargestContigousASubarray.optimalCode()");
		System.out.println("Answer : "  + ans);
		
		
	}

	private static void bruteForces() {

		int[] arr = { 9, 2, 1, 5, 6, 23, 24, 22, 23, 19, 17, 16, 18, 39, 0 };
		int n = arr.length;

		int ans = 0;

		for (int i = 0; i < n; i++) {
			int min = arr[i];
			int max = arr[i];
			HashSet<Integer> set = new HashSet<Integer>();
			set.add(arr[i]);
			for (int j = i + 1; j < n; j++) {
				if (set.contains(arr[j])) {
					break;
				}

				set.add(arr[j]);

				min = Math.min(min, arr[j]);
				max = Math.max(max, arr[j]);

				if (max - min == j - i) {
					int len = j - i + 1;

					ans = Math.max(ans, len);
				}

			}
		}

		System.out.println("LargestSubarrayWithContigousElement.optimalCode()");
		System.out.println("Answer :" + ans);
	}
}
