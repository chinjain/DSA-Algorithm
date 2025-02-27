package Java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElement {

	public static void main(String[] args) {
		List<Integer> stream = Arrays.asList(10, 20, 10, 20, 43, 43, 85, 54, 00, 10, 10);

		System.err.println(printDuplicateElement(stream));

		System.err.println(removeDuplicate(stream));

		System.err.println(printDupWithMap(stream));
	}

	private static Set<Integer> printDupWithMap(List<Integer> stream) {

		return stream.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
				.stream().filter(map -> map.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toSet());

	}

	private static Set<Integer> removeDuplicate(List<Integer> stream) {

		Set<Integer> integers = new HashSet<Integer>();
		return stream.stream().filter(integers::add).collect(Collectors.toSet());
	}

	private static Set<Integer> printDuplicateElement(List<Integer> stream) {

		//		return stream.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
		//				.stream().filter(m -> m.getValue() > 1).map(Map.Entry::getKey).collect(Collec);
		return stream.stream().filter(i -> Collections.frequency(stream, i) > 1).collect(Collectors.toSet());
	}

}
