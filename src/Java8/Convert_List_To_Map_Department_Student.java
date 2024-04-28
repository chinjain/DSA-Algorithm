package Java8;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Convert_List_To_Map_Department_Student {

	static List<Stud> studs;

	public Convert_List_To_Map_Department_Student() {
		studs = insertValues();
	}

	private List<Stud> insertValues() {

		List<Stud> studs = Arrays.asList(new Stud("abs", "50", new Department("CSE")),
				new Stud("CJ", "65", new Department("IT")), new Stud("SP", "100", new Department("CSE")));
		
		Iterator iterator = studs.iterator();
		iterator.remove();

		return studs;
	}

	public static void main(String[] args) {

		Convert_List_To_Map_Department_Student listToMap = new Convert_List_To_Map_Department_Student();

		Map<Department, List<String>> map = listToMap.studs.stream()
				.collect(Collectors.groupingBy(Stud::getDept, Collectors.mapping(Stud::getName, Collectors.toList())));

		for (Map.Entry<Department, List<String>> entry : map.entrySet()) {

			System.out.println(entry.getKey().toString() + " : " + entry.getValue());
		}

		System.out.println("Convert_List_To_Map_Department_Student.main()");
		studs.stream().sorted((a, b) -> b.getName().toLowerCase().compareTo(a.getName().toLowerCase()))
		.forEach(System.out::println);
	}

}

class Stud {
	String name;
	String marks;
	Department dept;

	public Stud(String name, String marks, Department dept) {
		super();
		this.name = name;
		this.marks = marks;
		this.dept = dept;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMarks() {
		return marks;
	}

	public void setMarks(String marks) {
		this.marks = marks;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Stud [name=" + name + ", marks=" + marks + ", dept=" + dept + "]";
	}

}

class Department {
	String name;

	public Department(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Department [ " + name + "]";
	}

}