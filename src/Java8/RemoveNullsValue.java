package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class RemoveNullsValue {
	public static void main(String[] args) {

		List<String> strings = Arrays.asList("apple", null, "banana", null, "cherry");
		strings.stream().filter(Objects::nonNull).forEach(System.out::println);

		// Check all condition is following or not
		List<Integer> numbers = Arrays.asList(6, 10, 16, 20, 24);
		boolean allMatch = numbers.stream().allMatch(i -> 1 % 2 == 0);
		System.err.println(allMatch);

		List<String> fruits = Arrays.asList("apple", "banana", "cherry", "date");
		String firstValue = fruits.stream().filter(i -> i.startsWith("c")).findFirst()
				.orElseThrow(() -> new RuntimeException("No string found"));
		System.err.println(firstValue);

	}

}
