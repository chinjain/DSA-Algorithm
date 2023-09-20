package Java8;

import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NumberOccurringCharacter {

	public static void main(String[] args) {

		String str = "Helloowwworld";
		Map<Character, Long> map = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.err.println(map);

		Optional<Character> charMaxOccur = map.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey);
		System.err.println(charMaxOccur.get());
	}


}
