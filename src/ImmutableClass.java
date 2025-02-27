import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ImmutableClass {

	public static void main(String[] args) {
		Emp emp = new Emp("Chinmay", "03-11-1998", List.of("CSE,IT"));

		try {
			System.out.println(emp.getDepartment().add("ECE"));
		}catch (UnsupportedOperationException e ) {
			System.out.println(e.getCause()
					);
		}
		
//		Emp emp2 = new Emp("Chin-may", "03-11-1998", Arrays.asList("CSE"));
//
//		emp2.getDepartment().add("hey I am able to add");
//		System.out.println(emp2.getDepartment());
//		System.out.println(emp.hashCode() + " == " + emp2.hashCode());
	}
}

final class Emp {

	private final String name;
	private final String dob;
	private final List<String> department;

	public Emp(String name, String dob, List<String> department) {
		super();
		this.name = name;
		this.dob = dob;
		this.department = new ArrayList<>(department);
	}

	public String getName() {
		return name;
	}

	public String getDob() {
		return dob;
	}

	public List<String> getDepartment() {
		return Collections.unmodifiableList(new ArrayList<String>(department));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((department == null) ? 0 : department.hashCode());
		result = prime * result + ((dob == null) ? 0 : dob.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (department == null) {
			if (other.department != null)
				return false;
		} else if (!department.equals(other.department))
			return false;
		if (dob == null) {
			if (other.dob != null)
				return false;
		} else if (!dob.equals(other.dob))
			return false;
		if (name == null) {
            return other.name == null;
		} else return name.equals(other.name);
    }

}