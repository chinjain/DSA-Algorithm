package Java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapToList {

	public static void main(String[] args) {
		Map<String, Employee> employeeMap = new HashMap<String, Employee>();
		employeeMap.put("E001", new Employee("John", "D001"));
		employeeMap.put("E002", new Employee("Alice", "D002"));
		employeeMap.put("E003", new Employee("Bob", "D001"));
		employeeMap.put("E004", new Employee("Jane", "D003"));

		List<String> departmentCode = employeeMap.values().stream().map(Employee::getDepartmentCode).sorted()
				.collect(Collectors.toList());

		System.err.println(departmentCode);

		Map<Integer, String> dept = departmentCode.stream()
				.collect(Collectors.toMap(String::length, s -> s, (S1, S2) -> S1));

		System.err.println(dept);

		List<Employee> employees = Arrays.asList(new Employee("aa", "cj001"), new Employee("cj", "ac0012"),
				new Employee("cj", "ac004382"), new Employee("cj", "ac0012435"), new Employee("cj", "ac001"),
				new Employee("cj", "ac001233"), new Employee("cj", "ac001442"), new Employee("cj", "ac001265"),
				new Employee("cj", "ac0012435"));

		Map<String, Integer> emp = employees.stream().collect(
				Collectors.toMap(Employee::getDepartmentCode, e -> e.getDepartmentCode().length(), (s1, s2) -> s1));

		
		//for handling the collision we have used the third argument here 
		Map<String, Integer> map = employees.stream().collect(Collectors.toMap(Employee::getDepartmentCode,
				e -> e.getDepartmentCode().length(), (existValue, newValue) -> existValue));
		

		System.err.println("EMPLOYEE" + " " + emp.size());
	}

}
