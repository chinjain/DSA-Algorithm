package Java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ReverListOFStringConvertToMap {

	public static void main(String[] args) {
	        List<String> list = Arrays.asList("apple", "banana", "cherry", "date");

	        Map<Integer, String> reversedMap = list.stream()
	                .collect(Collectors.collectingAndThen(
	                        Collectors.toMap(String::length, str -> str, (v1, v2) -> v1, LinkedHashMap::new),
	                        map -> {
	                            List<Integer> sortedKeys = map.keySet().stream().filter((Predicate<? super Integer>) Collections.reverseOrder())
	                                    .collect(Collectors.toList());
	                            return sortedKeys.stream()
	                                    .collect(Collectors.toMap(key -> key, map::get, (v1, v2) -> v1, LinkedHashMap::new));
	                        }
	                ));
	        
	        System.err.println(reversedMap);
	    }
}
