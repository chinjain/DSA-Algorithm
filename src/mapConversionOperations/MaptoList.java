package mapConversionOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MaptoList {

	public static void main(String[] args) {

		Integer integer = Integer.valueOf(30);
		int i = integer;

		List<Person> persons = Arrays.asList(new Person(1, "John"), new Person(2, "Jane"), new Person(3, "Adam"));

		Map<Integer, String> map = persons.stream().collect(Collectors.toMap(Person::getId, Person::getName));

		System.err.println(map);

		persons.stream().collect(Collectors.toMap(Person::getId, Person::getName)).entrySet().forEach(ent -> {
			System.err.println(ent.getKey() + ":" + ent.getValue());
		});

    }

}

class Person {
	private int id;
	private String name;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
