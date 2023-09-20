package Java8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortList {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("banana", "apple", "cherry", "date");
		List<Integer>  integers= Arrays.asList(2,32,435,1,45,984,-2,4);
		
		int num = integers.stream().sorted((i1,i2)->i1.compareTo(i2)).skip(1).findFirst().get();
		System.err.println("Soted :" + num);

		sortList(strings);
//		comparatorSort(strings);

		List<Map<String, String>> list = new ArrayList<Map<String, String>>();
		list.add(createMap("2023-06-01"));
		list.add(createMap("2023-06-03"));
		list.add(createMap("2023-07-02"));
		list.add(createMap("2023-05-02"));
		list.add(createMap("2023-03-02"));
		list.add(createMap("2023-10-02"));
		list.add(createMap("2023-04-02"));
		list.add(createMap("2023-06-11"));
		list.add(createMap("2023-06-12"));
//		System.err.println(sortWithDate(list));
	}

	private static Map<String, String> createMap(String dateString) {
		Map<String, String> map = new HashMap<>();
		map.put("date", dateString);
		return map;
	}

	private static List<Map<String, String>> sortWithDate(List<Map<String, String>> listOfMap) {
		Comparator<Map<String, String>> mapComparator = new Comparator<Map<String, String>>() {
			public int compare(Map<String, String> m1, Map<String, String> m2) {
				return m1.get("date").compareTo(m2.get("date"));
			}
		};
		Collections.sort(listOfMap, mapComparator);
		return listOfMap;
	}

	private static void comparatorSort(List<String> strings) {
		strings.sort(Comparator.naturalOrder());
		System.err.println(strings);
	}

	private static void sortList(List<String> strings) {
//		strings.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);
		strings.stream().sorted((s1, s2) -> s1.compareTo(s2)).forEach(System.out::println);
	}
}