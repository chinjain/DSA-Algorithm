package recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationalSum {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 6, 7, 4 };
		int target = 7;
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		backtrack(list, new ArrayList<Integer>(), target, arr, 0);
		
		List<List<Integer>> l1 = new ArrayList<List<Integer>>();
		withoutLoopBacktrack(l1,new ArrayList<Integer>(),arr,target,0);
		
		l1.forEach((e) -> System.out.println(e));
//		list.forEach((l) -> System.out.println(l));

	}

	private static void withoutLoopBacktrack(List<List<Integer>> l1, ArrayList<Integer> arrayList, int[] arr,
			int target, int i) {
		
		if(i == arr.length) {
			if(target == 0) {
				l1.add(new ArrayList<Integer>(arrayList));
			}
			return;
		}
		
		if(arr[i] <= target) {
			
			arrayList.add(arr[i]);
			withoutLoopBacktrack(l1, arrayList, arr, target-arr[i], i);
			arrayList.remove(arrayList.size()-1);
		}
		
		withoutLoopBacktrack(l1, arrayList, arr, target, i+1);
		
	}

	private static void backtrack(List<List<Integer>> list, ArrayList<Integer> temp, int target, int[] arr, int st) {

		if (target < 0)
			return;
		else if (target == 0)
			list.add(new ArrayList<Integer>(temp));
		else {

			for (int i = st; i < arr.length; i++) {
				temp.add(arr[i]);
				backtrack(list, temp, target - arr[i], arr, st);
				temp.remove(temp.size() - 1);
			}

		}

	}

}
