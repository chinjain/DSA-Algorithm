public class Employee {
	private String name;
	private String departmentCode;

	public Employee(String name, String departmentCode) {
		this.name = name;
		this.departmentCode = departmentCode;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartmentCode() {
		return departmentCode;
	}

	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", departmentCode=" + departmentCode + "]";
	}

}
