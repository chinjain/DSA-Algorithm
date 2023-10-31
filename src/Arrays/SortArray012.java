package Arrays;

import java.util.Arrays;

public class SortArray012 {
	public static void main(String[] args) {
		int n = 5;
		int arr[] = { 0, 0, 0, 1, 2, 2, 0, 0, 2, 1, 2, 1, 2, 0 };
		bruteForce(arr, n);
		optimalApproach(arr, n);
	}

	private static void optimalApproach(int[] arr, int n) {
		//Dustch flag algorithm is sort the data using inplace algorithm 
		// And they will sort data in this manner low will keep the 0's high will put 2's at the end and simply we use 
		// mid to iterate the loop
		
		int lo =0; 
		int hi = arr.length -1;
		int mid = 0;
		
		while(mid <= hi) {
			if(arr[mid] == 0) {
				swap(arr,lo,mid);
				lo++;
				mid++;
			}else if(arr[mid] == 1) {
				mid++;
			}else {
				swap(arr,mid,hi);
				hi--;
			}
		}

		System.out.println("Sorted Array dustch flag: " + Arrays.toString(arr));


	}
	
	public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

	private static void bruteForce(int[] arr, int n) {

		Long time = System.currentTimeMillis();

		int count0 = 0;
		int count1 = 0;
		int count2 = 0;
		for (int num : arr) {
			if (num == 0)
				count0++;
			else if (num == 1)
				count1++;
			else if (num == 2)
				count2++;
		}

		int idx = 0;
		while (count0 > 0) {
			arr[idx++] = 0;
			count0--;
		}

		while (count1 > 0) {
			arr[idx++] = 1;
			count1--;
		}

		while (count2 > 0) {
			arr[idx++] = 2;
			count2--;
		}

		long finTime = System.currentTimeMillis();
		System.err.println("Time complexit" + (finTime - time));
		System.out.println("Sorted Array: " + Arrays.toString(arr));

	}

}
