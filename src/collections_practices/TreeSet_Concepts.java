package collections_practices;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSet_Concepts {

	public static void main(String[] args) {

		TreeSet<Emp> treeSet = new TreeSet<Emp>(Emp.idComparator);

		Emp e1 = new Emp("Chinmay", 102);
		Emp e2 = new Emp("Heena", 101);

		// Dept d1 = new Dept(201, "HR");
		// Dept d2 = new Dept(202, "IT");

		treeSet.add(e1);
		treeSet.add(e2);
		// treeSet.add(d1);
		// treeSet.add(d2);

		System.out.println("Elements in TreeSet:");
		for (Object obj : treeSet) {
			System.out.println(obj);
		}
	}

}

class Emp implements Comparable<Emp> {

	String name;
	int id;

	public Emp() {
		// TODO Auto-generated constructor stub
	}

	public Emp(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int compareTo(Emp o) {
		return this.name.compareTo(o.getName());
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + "]";
	}

	public static Comparator<Emp> nameComparator = (o1, o2) -> {
		return o1.getName().compareTo(o2.getName());
	};

	public static Comparator<Emp> idComparator = (o1, o2) -> {
		return o1.getId() - o2.getId();
	};

}

class Dept {
	private final int deptId;
	private final String deptName;

	public Dept(int deptId, String deptName) {
		this.deptId = deptId;
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "Department{deptId=" + deptId + ", deptName='" + deptName + "'}";
	}

	public static Comparator<Dept> deptIdComparator = (d1, d2) -> {
		return d1.deptId - d2.deptId;
	};
}