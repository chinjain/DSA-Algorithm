package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxValueFromList {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 5, 8, 15, 3, 12);

		Optional<Integer> integer = numbers.stream().max(Integer::compare);

		System.err.println(integer.get());

		System.out.println(findAverage(numbers));

	}

	private static double findAverage(List<Integer> num) {
		return num.stream().mapToDouble(i -> i).average().getAsDouble();

	}

}
