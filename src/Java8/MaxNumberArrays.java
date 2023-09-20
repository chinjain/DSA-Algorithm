package Java8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MaxNumberArrays {

	public static void main(String[] args) {
		int[] nums = { 10, 40, 2, 89, 100, 3293, 44 };
		System.err.println(findMax(nums));

		System.err.println(factorial(5));
	}

	private static int findMax(int[] nums) {
//		Arrays.fill(nums, 0);
		return Arrays.stream(nums).max().orElse(Integer.MIN_VALUE);
	}

	private static int factorial(int num) {
		return IntStream.rangeClosed(2, num).reduce(1, (a, b) -> a * b);
	}

}
