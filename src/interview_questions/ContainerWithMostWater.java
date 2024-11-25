package interview_questions;

public class ContainerWithMostWater {

	public static void main(String[] args) {
		int[] a = { 1, 5, 4, 3 };
		int[] b = { 3, 1, 2, 4, 5 };

		
		bruteForceApproach(b);
		optimalApproach(b);

	}

	private static void optimalApproach(int[] a) {

		int lo = 0;
		int r = a.length - 1;
		int area = 0;

		while (lo < r) {

			area = Math.max(area, Math.min(a[lo], a[r]) * (r - lo));
			
			if(a[lo] < a[r]) {
				lo++;
			}else {
				r--;
			}
			

		}

		System.out.println("ContainerWithMostWater.optimalApproach()");
		System.out.println(area);

	}

	private static void bruteForceApproach(int[] a) {

		int area = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				area = Math.max(area, Math.min(a[i], a[j]) * (j - i));
			}
		}

		System.out.println("ContainerWithMostWater.bruteForceApproach()");
		System.out.println(area);

	}
}
