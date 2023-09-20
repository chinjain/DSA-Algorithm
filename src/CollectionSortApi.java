import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class CollectionSortApi {

	public static void main(String[] args) {

		int[] arr = { 11, 5, 6, 2, 54, 7 };

		for (int a : arr) {
			System.err.print(a + " \n");
		}

//		Arrays.sort(arr);
//		for (int i : arr) {
//			System.err.println(i + " ");
//		}

		java.util.List<Integer> arrayList = Arrays.stream(arr).boxed().collect(Collectors.toList());
		Collections.sort(arrayList);
		System.out.println(arrayList);
	}

}
