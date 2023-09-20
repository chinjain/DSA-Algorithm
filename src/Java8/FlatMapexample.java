package Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FlatMapexample {

	public static void main(String[] args) {

		List<Person> persons = Arrays.asList(
				new Person("John", Arrays.asList(new Phone("Apple", 1000.0), new Phone("Samsung", 800.0))),
				new Person("Jane", Arrays.asList(new Phone("Google", 1200.0), new Phone("Samsung", 900.0))),
				new Person("Adam", Arrays.asList(new Phone("Apple", 1500.0), new Phone("OnePlus", 700.0))));

		phoneWithHighestPrice(persons);
	}

	private static void phoneWithHighestPrice(List<Person> persons) {
		Optional<Phone> phoneWithHighestPrice = persons.stream()
		        .flatMap(person -> person.getPhones().stream()) // Flattening the list of phones
		        .max(Comparator.comparingDouble(Phone::getPrice)); // Using Comparator to find the max price
		System.err.println(phoneWithHighestPrice.get().getPrice());

	}

}

class Person {
	private String name;
	private List<Phone> phones;

	public Person(String name, List<Phone> phones) {
		super();
		this.name = name;
		this.phones = phones;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Phone> getPhones() {
		return phones;
	}

	public void setPhones(List<Phone> phones) {
		this.phones = phones;
	}

	// constructor, getters, setters
}

class Phone {
	private String brand;
	private double price;

	public Phone(String brand, double price) {
		super();
		this.brand = brand;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	// constructor, getters, setters
}
