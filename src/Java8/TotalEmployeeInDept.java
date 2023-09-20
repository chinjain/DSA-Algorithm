package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TotalEmployeeInDept {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(new Employee("John", "HR"), new Employee("Emily", "IT"),
				new Employee("Michael", "HR"), new Employee("Jessica", "IT"));

		Map<String, List<String>> deptByEmp = employees.stream().collect(Collectors
				.groupingBy(Employee::getDepartmentCode, Collectors.mapping(Employee::getName, Collectors.toList())));
		
		System.err.println(deptByEmp);
	}

}
