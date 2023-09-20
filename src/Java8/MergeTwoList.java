package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MergeTwoList {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
		List<Integer> list2 = Arrays.asList(3, 4, 5, 6);

		int[] numbers = { 10, 5, 8, 3, 12 };

		Stream.concat(list1.stream(), list2.stream()).distinct().forEach(System.out::println);

		//Second smallest number
		int number = IntStream.of(numbers).sorted().skip(1).findFirst().getAsInt();
		
		System.err.println("" + number);

	}

}
