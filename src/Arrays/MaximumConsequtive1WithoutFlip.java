package Arrays;

/*
 * 
 * Here we are allowed to flip atmost one 0 only then can give the max len of consequtive's one's
 * 1101001101011
 * 
 */

public class MaximumConsequtive1WithoutFlip {

	public static void main(String[] args) {

		int[] arr = { 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 1 };
		
		oneWithOneZeroFlip(arr,arr.length);

	}

	private static void oneWithOneZeroFlip(int[] arr, int length) {
		
		int j = -1;
		int max = 0;
		int count = 0;
		
		for(int i = 0; i < length; i++) {
			
			if(arr[i] == 0) {
				count++;
			}
			while(count > 1) {
				 j++;
				 if(arr[j] == 0) {
					 count--;
				 }
			}
			
			int len = i - j;
			max = Math.max(len, max);
			
		}
		
		System.out.println(max);
	}

}
