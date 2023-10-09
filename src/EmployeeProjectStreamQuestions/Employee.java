package EmployeeProjectStreamQuestions;

import java.util.List;

public class Employee {

	private String id;
	private String firstName;
	private String lastName;
	private int salary;
	private int totalLaptopsAssigned;
	// OneToMany
	private List<Projects> projects;

	Employee() {
	}

	public Employee(String id, String firstName, String lastName, int salary, int totalLaptopsAssigned,
			List<Projects> projects) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.totalLaptopsAssigned = totalLaptopsAssigned;
		this.projects = projects;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getTotalLaptopsAssigned() {
		return totalLaptopsAssigned;
	}

	public void setTotalLaptopsAssigned(int totalLaptopsAssigned) {
		this.totalLaptopsAssigned = totalLaptopsAssigned;
	}

	public List<Projects> getProjects() {
		return projects;
	}

	public void setProjects(List<Projects> projects) {
		this.projects = projects;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ ", totalLaptopsAssigned=" + totalLaptopsAssigned + ", projects=" + projects + "]";
	}

}
