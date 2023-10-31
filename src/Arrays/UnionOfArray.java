package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UnionOfArray {

	public static void main(String[] args) {
		int[] arr1 = { 7, 1, 5, 2, 3, 6 };
		int[] arr2 = { 3, 8, 6, 20, 7 };

		List<Integer> union = findUnionBruteForce(arr1, arr2);
		List<Integer> optUnion = findUnionOptimal(arr1, arr2);

		List<Integer> intersection = findIntersectionBruteForce(arr1, arr2);
		List<Integer> optIntersection = findIntersectionOptimal(arr1, arr2);

		System.out.println("Union: " + union);
		System.out.println("optUnion: " + optUnion);
		System.out.println("intersection: " + intersection);
		System.out.println("optIntersection: " + optIntersection);
	}

	private static List<Integer> findIntersectionOptimal(int[] arr1, int[] arr2) {
		Set<Integer> set1 = new HashSet<>();

		for (int n : arr1) {
			set1.add(n);
		}

		Set<Integer> intersectionSet = new HashSet<>();
		for (int n : arr2) {
			if (set1.contains(n)) {
				intersectionSet.add(n);
			}
		}
		List<Integer> intersection = new ArrayList<>(intersectionSet);
		return intersection;
	}

	private static List<Integer> findIntersectionBruteForce(int[] arr1, int[] arr2) {
		List<Integer> intersection = new ArrayList<>();

		for (int n : arr1) {
			for (int n1 : arr2) {
				if (n1 == n && !intersection.contains(n1)) {
					intersection.add(n1);
				}
			}
		}

		return intersection;
	}

	private static List<Integer> findUnionOptimal(int[] arr1, int[] arr2) {
		Set<Integer> unionSet = new HashSet<>();

		for (int n : arr1) {
			unionSet.add(n);
		}

		for (int num : arr2) {
			unionSet.add(num);
		}

		List<Integer> union = new ArrayList<>(unionSet);

		return union;
	}

	private static List<Integer> findUnionBruteForce(int[] arr1, int[] arr2) {
		List<Integer> union = new ArrayList<>();

		for (int num1 : arr1) {
			union.add(num1);
		}

		for (int num : arr2) {
			if (!union.contains(num)) {
				union.add(num);
			}
		}

		return union;
	}

}
