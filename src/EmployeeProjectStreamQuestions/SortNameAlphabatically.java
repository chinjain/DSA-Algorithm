package EmployeeProjectStreamQuestions;

import java.util.Comparator;
import java.util.List;

public class SortNameAlphabatically {

	public static void main(String[] args) {

		List<Employee> employees = EmployeeFactory.getAll();

		employees.stream().filter(e -> e.getFirstName().toLowerCase().startsWith("a"))
		.sorted(Comparator.comparing(Employee::getFirstName).reversed()).forEach((e) -> {
			System.out.println(e);
		});
		
		
		
		Employee employee = new Employee();
		
		
//		String  ProjectManagerName =  employee.getProjects().get(0).getProjectManager();
		
		
	}

}
