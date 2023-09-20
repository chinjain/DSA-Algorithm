package Java8;

import java.util.Arrays;
import java.util.List;

public class StringToUppercase {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("hey","hi","bye");
		strings.stream().map(String::toUpperCase).forEach(System.out::println);;
	}
}
