package STREAM.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class UserTestMockDataStream {

	private static List<User> users;

	public static void init() {
		users = Arrays.asList(
				new User(1L, "Amirhosein", "Gharaati", "amirgh1380@gmail.com", 22,
						Arrays.asList("computer", "board games")),
				new User(2L, "Mohammad", "Shoja", "rezajsh@yahoo.com", 26, Arrays.asList("computer", "guitar")),
				new User(3L, "Babak", "Ahmadi", "babakahmadi@gmail.com", 33, List.of("shopping")),
				new User(2L, "Robin", "Eklund", "robin.eklund@twitter.com", 28, List.of("reading")),
				new User(5L, "Amir", "Tavakoli", "amirtvkli@gmail.com", 30,
						Arrays.asList("reading", "computer", "cooking")),
				new User(5L, "Farhad", "Kiani", "farhadkiani@focalpay.se", 28, List.of()));
	}

	public static void filter_users_with_gmail_with_age_greater_than_equal_25() {
		List<User> list = users.stream().filter(u -> u.getAge() > 25).filter(u -> u.getEmail().endsWith("gmail.com"))
				.collect(Collectors.toList());

		printList("filter_users_with_gmail_with_age_greater_than_equal_25 => response is ", list);
	}

	private static void printList(String string, List<User> list) {
		System.out.println("UserTestMockDataStream.printList()");
		System.out.println(string);
		list.forEach(user -> System.out.println(user));

	}

	public static void generate_users_fullname() {
		List<String> strings = users.stream().map(user -> user.getFirstName() + " " + user.getLastName())
				.collect(Collectors.toList());

		strings.forEach(System.out::println);
	}

	public static void collect_unique_ids() {
		Set<Long> collect = users.stream().map(User::getId).collect(Collectors.toSet());

		collect.forEach(System.out::println);
	}

	public static void group_users_by_email() {
		Map<String, Long> collect = users.stream()
				.collect(Collectors.groupingBy(u -> u.getEmail().split("@")[1], Collectors.counting()));

		collect.entrySet().forEach(user -> {
			System.err.println(user.getKey() + "<->" + user.getValue());
		});
	}

	public static void extract_duplicated_users_based_on_user_id() {
		Set<Long> duplicate_id = users.stream().collect(Collectors.groupingBy(User::getId, Collectors.counting()))
				.entrySet().stream().filter(entry -> entry.getValue() > 1).map(Map.Entry::getKey)
				.collect(Collectors.toSet());
		
		System.out.println("UserTestMockDataStream.extract_duplicated_users_based_on_user_id()");
		System.out.println(duplicate_id);
	}

	public static void main(String[] args) {
		init();
//		filter_users_with_gmail_with_age_greater_than_equal_25();
//		generate_users_fullname();
//		collect_unique_ids();
//		group_users_by_email();
		extract_duplicated_users_based_on_user_id();
	}

}

class User {
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	private Integer age;
	private List<String> interests;

	public User(Long id, String firstName, String lastName, String email, Integer age, List<String> interests) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.age = age;
		this.interests = interests;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public List<String> getInterests() {
		return interests;
	}

	public void setInterests(List<String> interests) {
		this.interests = interests;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", age="
				+ age + ", interests=" + interests + "]";
	}

}