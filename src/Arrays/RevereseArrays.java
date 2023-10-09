package Arrays;

public class RevereseArrays {
	
	public static void main(String[] args) {
		reverseArray(new int[]{4, 5, 8, 9, 10});
	}

	private static void reverseArray(int[] a) {
		
		int i = 0; 
		int j = a.length -1;
		
		while(i <= j) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			
			i++;
			--j;
		}
		
		for(int n : a) {
			System.out.print(n + " " );
		}
		
	}

}
