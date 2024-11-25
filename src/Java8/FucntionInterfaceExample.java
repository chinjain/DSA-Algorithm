package Java8;

import java.util.Arrays;
import java.util.List;

public class FucntionInterfaceExample {

	public static void main(String[] args) {
		List<Per> persons = Arrays.asList(new Per("Alice", 25), new Per("Bob", 30), new Per("Charlie", 22),
				new Per("David", 35));

		personNameOlderThan(persons, 30);

	}

	private static void personNameOlderThan(List<Per> persons, int i) {

		personFilter filter = p -> p.getAge() > 30;

		persons.stream().filter(filter::test).map((p) -> p.getName()).forEach((e) -> System.out.println(e));
	}

}

@FunctionalInterface
interface personFilter {
	boolean test(Per p);
}

class Per {

	private final String name;
	private final int age;

	public Per(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}