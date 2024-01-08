package recursion;

public class ReverseArraysUsingRecursion {
	
	public static void main(String[] args) {
		int[] arr = {10,2,1,32,4,12,44,56,0,7};
		
		reverse(arr, 0,arr.length);
		
		for(int n : arr) {
			System.out.print(n + " ");
		}
	}

	private static void reverse(int[] arr, int i, int n) {
		if(i >= n/2) {
			return;
		}
		
		int temp = arr[i];
		arr[i] = arr[n - i - 1];
		arr[n - i - 1] = temp;
		i++;
		reverse(arr, i, n);
	}

}
