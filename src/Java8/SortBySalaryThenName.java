package Java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortBySalaryThenName {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(60000, "Alice"));
		employees.add(new Employee(75000, "Bob"));
		employees.add(new Employee(60000, "Charlie"));
		employees.add(new Employee(80000, "David"));

		List<Employee> list = employees.stream().sorted((e1, e2) -> {

			int i = e1.getSalary() - e2.getSalary();
			if (i == 0) {
				return e1.getName().compareTo(e2.getName());
			} else {
				return i;
			}

		}).collect(Collectors.toList());
//		Collections.sort(employees, Comparator.comparingInt(Employee::getSalary).thenComparing(Employee::getName));
		list.forEach(System.out::print);
	}

	static class Employee {

		private final int salary;
		private final String name;

		public Employee(int salary, String name) {
			this.salary = salary;
			this.name = name;
		}

		public int getSalary() {
			return salary;
		}

		public String getName() {
			return name;
		}

		@Override
		public String toString() {
			return "Employee [salary=" + salary + ", name=" + name + "]";
		}

	}

}
