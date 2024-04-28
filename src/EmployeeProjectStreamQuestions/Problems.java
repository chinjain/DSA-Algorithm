	package EmployeeProjectStreamQuestions;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Problems {

	public static void main(String[] args) {

		List<Employee> employees = new EmployeeFactory().getAll();

		System.out.println("\n ====== List all distinct project in non-ascending order. ======");
		employees.stream().flatMap(emp -> emp.getProjects().stream()).distinct().sorted((p1, p2) -> {
			return p2.getName().compareTo(p1.getName());
		}).forEach(System.out::println);

		System.out.println("\n ====== Print full name of any employee whose firstName starts with ‘A’. ======");
		employees.stream().filter(emp -> emp.getFirstName().startsWith("A")).forEach(System.out::println);

		System.out.println(
				"\n ====== List of all employee who joined in year 2023 (year to be extracted from employee id i.e., 1st 4 characters) ======");
		employees.stream().filter(emp -> emp.getId().substring(0, 4).equals("2023")).forEach(System.out::println);

		System.out.println("\n ====== Sort employees based on firstName, for same firstName sort by salary. ======");
		employees.stream().sorted((e1, e2) -> {
			int comparison = e1.getFirstName().compareTo(e2.getFirstName());

			if (comparison == 0) {
				return e1.getSalary() - e2.getSalary();
			}

			return comparison;
		}).forEach(System.out::println);

		System.out.println("\n ========== Sort Employee using Comparator =============================");

		employees.stream().sorted(Comparator.comparing(Employee::getFirstName).thenComparing(Employee::getSalary))
		.forEach(System.out::println);

		int n = 3;
		System.out.println(
				"\n ====== Print names of all employee with 3rd highest salary. (generalise it for nth highest salary). ======");
		employees.stream().sorted((s1, s2) -> s2.getSalary() - s1.getSalary()).limit(n).skip(n - 1)
		.forEach(System.out::println);

		System.out.println("\n ====== List of people working on more than 2 projects. ======");
		employees.stream().filter(each -> each.getProjects().size() > 2).forEach(System.out::println);

		System.out.println("\n ====== Count of total laptops assigned to the employees. ======");
		int sum = employees.stream().mapToInt(each -> each.getTotalLaptopsAssigned()).sum();
		System.out.println(sum);

		System.out.println("\n ====== List of all people with Robert Downey Jr as PM. ======");
		String pm = "Robert Downey Jr";
		employees.stream().filter(
				each -> each.getProjects().stream().anyMatch(eachP -> eachP.getProjectManager().equalsIgnoreCase(pm)))
		.forEach(System.out::println);

		System.out.println("\n ====== Print Min Sal ======");
		System.out.println(employees.stream().sorted((e1, e2) -> e1.getSalary() - e2.getSalary()).findAny().get());

		System.out.println("\n ====== mapOfEmployeeOnJoiningYear ======");
		Map<String, List<Employee>> map = employees.stream().collect(Collectors
				.groupingBy(emp -> emp.getId().substring(0, 4), Collectors.mapping(e -> e, Collectors.toList())));

		employees.stream().collect(Collectors.groupingBy(Employee::getSalary)).entrySet().forEach((e) -> {
			System.out.println(e.getKey() + ":" + e.getValue());
		});

		map.entrySet().stream()
		.sorted((e1, e2) -> e1.getValue().get(0).getFirstName().compareTo(e2.getValue().get(0).getFirstName()))
		.forEach(System.out::println);

		System.out.println("\n ====== mapOfEmployeeCountOnJoiningYear ======");
		employees.stream()
		.collect(Collectors.toMap(e -> e.getId().substring(0, 4), emp -> 1, Integer::sum, TreeMap::new))
		.entrySet().forEach(System.out::println);
		;
	}

}
