import java.util.HashMap;

public class CollectionSortApi {

	public static void main(String[] args) {

		//		int[] arr = { 11, 5, 6, 2, 54, 7 };
		//
		//		for (int a : arr) {
		//			System.err.print(a + " \n");
		//		}
		//
		////		Arrays.sort(arr);
		////		for (int i : arr) {
		////			System.err.println(i + " ");
		////		}
		//
		//		java.util.List<Integer> arrayList = Arrays.stream(arr).boxed().collect(Collectors.toList());
		//		Collections.sort(arrayList);
		//		System.out.println(arrayList);
		//		
		//		List<? super Number> list = new ArrayList<Object>();
		//		list.add(1);
		//		list.add(1.0);
		////		list.add("1");

		java.util.Map<String, String> map = new HashMap<>();

		String e1 = "AJAY";
		String e2 = "AJAY";
		String e3 = "AJAY";

		map.put(e1, "I");
		map.put(e2, "M2");

		System.out.println(map.get(e1));
		System.out.println(map.get(e2));
	}

}
