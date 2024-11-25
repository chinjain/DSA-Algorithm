package Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CountOfEquivalentSubarrays {

	public static void main(String[] args) {
		int[] arr = { 2, 1, 3, 2, 3 };

		count(arr, arr.length);

		optimisedCode(arr, arr.length);
	}

	private static void optimisedCode(int[] arr, int n) {

		int left = 0;
		int ans = 0;
		int k = 3;

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int right = 0; right < n; right++) {

			map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);

			while (map.size() > k) {
				map.put(arr[left], map.get(arr[left]) - 1);
				if (map.get(arr[left]) == 0) {
					map.remove(arr[left]);
				}

				left++;
			}

			ans += right - left + 1;

		}
		
		System.out.println("CountOfEquivalentSubarrays.optimisedCode()");
		System.out.println(ans);

	}

	private static void count(int[] arr, int length) {
		// TODO Auto-generated method stu

		Set<Integer> set = new HashSet<Integer>();
		Map<Integer, Integer> map = new HashMap<>();

		for (int a : arr) {
            set.add(a);
		}

		int k = set.size();
		int ans = 0;

		int i = 0;
		int j = 0;
		while (i < length - 1) {

			while (i < length - 1) {
				map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
				i++;
				if (map.size() == k) {
					ans += arr.length - i + 1;
					break;
				}
			}

			j = 0;
			while (j <= i) {
				if (map.getOrDefault(arr[j], 0) == 1) {
					map.remove(arr[j]);
				} else {
					map.put(arr[j], map.getOrDefault(arr[j], 0) - 1);
				}

				j++;

				if (map.size() == k) {
					ans += arr.length - i + 1;
				}
			}
		}

		System.out.println(ans);

	}

}
