package Java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NumberOfOccurence {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("John", "Jane", "John", "Adam", "Jane", "Jane");

		Map<String, Long> frequMap = names.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.err.println(frequMap);

		String maxOccourString = frequMap.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey)
				.get();

		System.out.println("Max Occuring String is =>" + maxOccourString);

		int frequency = Collections.frequency(names, "John");

		System.err.println(frequency);
	}

}
