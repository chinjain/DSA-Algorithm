package Java8;

import java.util.Arrays;
import java.util.List;

public class SumOfNumbersDivisibleByThee {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		int sumOfSquare = numbers.stream().filter(n -> n % 3 == 0).mapToInt(n -> n * n).sum();

		System.err.println(sumOfSquare);

	}

}
