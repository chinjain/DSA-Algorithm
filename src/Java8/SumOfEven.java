package Java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class SumOfEven {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 10, 20, 30, 34, 2, 2, 2, 3, 20, 2, 34, 44, 90, 1, 3, 4, 6, 77, 97, 107,
				110);

		list.parallelStream().filter(n -> n % 2 == 0).forEach(System.out::println);
		System.err.println(sumOfEven(list));

		startWith1(list);
		removeDuplicateElement(list);
	}

	private static void removeDuplicateElement(List<Integer> list) {
		int i = 0;
		for (int j = 1; j < list.size(); j++) {
			if (!list.get(j).equals(list.get(i))) {
				list.set(i + 1, list.get(j));
				i++;
			}
		}

		list.forEach(System.err::println);

	}

	private static void startWith1(List<Integer> list) {

		list.stream().map(s -> s + " ").filter(a -> a.startsWith("1")).forEach(System.out::print);

	}

	private static int sumOfEven(List<Integer> list) {
		//		return list.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();
		return list.stream().filter(i -> i % 2 == 0).mapToInt(i -> i).sum();
	}

}
