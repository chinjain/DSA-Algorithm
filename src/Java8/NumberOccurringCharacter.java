package Java8;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class NumberOccurringCharacter {

	public static void main(String[] args) {

		String str = "Helloowwworld";
		Map<Character, Long> map = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.err.println(map);

		Optional<Character> charMaxOccur = map.entrySet().stream().max(Map.Entry.comparingByValue())
				.map(Map.Entry::getKey);
		System.err.println(charMaxOccur.get());

		findFirstNonRepeatedCharacter(str);
		
		String s = "Fear leads to anger anger leads to hatred; ";
		Map map2  = Arrays.stream(s.split(" ")).collect(Collectors.groupingBy(x ->x, Collectors.counting()));
		
		map.entrySet().stream().forEach((e) -> {
			System.out.println(e.getKey()+  "->" + e.getValue());
		});
		
	}

	private static void findFirstNonRepeatedCharacter(String str) {
		Map<Character, Long> map = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		char character = map.entrySet().stream().filter(ent -> ent.getValue() == 1).map(Map.Entry::getKey).findFirst()
				.get();

		System.out.printf("Unique first Character is {%s}%n", character);

	}

}
