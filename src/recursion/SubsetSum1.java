package recursion;

import java.util.ArrayList;
import java.util.List;

public class SubsetSum1 {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3 };
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		backtrack(ans, new ArrayList<Integer>(), 0, 0, nums);

		ans.forEach(System.out::print);
	}

	private static void backtrack(List<List<Integer>> ans, ArrayList<Integer> temp, int idx, int sum, int[] num) {
		if (idx == num.length) {
			ans.add(new ArrayList<Integer>(temp));
			return;
		}

		backtrack(ans, temp, idx + 1, sum + num[idx], num);
		temp.add(sum);
		backtrack(ans, temp, idx + 1, sum, num);
	}
}
