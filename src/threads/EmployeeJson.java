package threads;

public class EmployeeJson {

	private String employeeId;
	private String firstName;
	private String lastName;
	private String email;
	private String gender;
	private String newJoiner;
	private String learningPending;
	long salary;
	int rating;

	public EmployeeJson(String employeeId, String firstName, String lastName, String email, String gender,
			String newJoiner, String learningPending, long salary, int rating) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
		this.newJoiner = newJoiner;
		this.learningPending = learningPending;
		this.salary = salary;
		this.rating = rating;
	}

	public EmployeeJson() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNewJoiner() {
		return newJoiner;
	}

	public void setNewJoiner(String newJoiner) {
		this.newJoiner = newJoiner;
	}

	public String getLearningPending() {
		return learningPending;
	}

	public void setLearningPending(String learningPending) {
		this.learningPending = learningPending;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

}
