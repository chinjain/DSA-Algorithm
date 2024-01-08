package recursion;

import java.util.ArrayList;
import java.util.List;

public class SubsequenceWithSumK {

	public static void main(String[] args) {
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		int[] arr = { 5, 12, 3, 17, 1, 18, 15, 3, 17 };
		int [] a = {5,3,3,1};
		int k = 6;
		subseq(ans, arr, new ArrayList<Integer>(), k, 0,0);

		ans.forEach(innerList -> innerList.forEach(System.out::print));
	}

	private static void subseq(List<List<Integer>> ans, int[] arr, ArrayList<Integer> temp, int k, int i,int sum) {
		if(i == arr.length) {
			if(sum == k) {
				ans.add(new ArrayList<Integer>(temp));
			}
			return ;
		}
		// include the current element in the lsit
		temp.add(arr[i]);
		subseq(ans, arr, temp, k, i+1, sum + arr[i]);
		
		// not include the current element in the list 
		temp.remove(temp.size() - 1);
		subseq(ans, arr, temp, k, i+1, sum);

	}

}
