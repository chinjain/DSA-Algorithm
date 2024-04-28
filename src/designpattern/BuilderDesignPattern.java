package designpattern;

public class BuilderDesignPattern {

	public static void main(String[] args) {

		Student student = new Student.StudentBuilder("Chinmay").build();
		System.out.println(student);

		User user = new User.UserBuilder().setEmail("chinmayjain03@gmail.com").build();

		System.out.println(user.getEmail());
	}
}

class Student {

	private String student_id;
	private String name;
	private String course;

	private Student(StudentBuilder builder) {

		this.student_id = builder.student_id;
		this.name = builder.name;
		this.course = builder.course;

	}

	static class StudentBuilder {

		private String student_id;
		private String name;
		private String course;

		public StudentBuilder(String firstname) {
			this.name = firstname;
		}

		public StudentBuilder setStudentId(String id) {
			this.student_id = id;
			return this;
		}

		public StudentBuilder setCourse(String course) {
			this.course = course;
			return this;
		}

		public Student build() {
			return new Student(this);
		}

	}

}

class User {
	private String name;
	private String user_Id;
	private String email;

	private User(UserBuilder builder) {
		this.name = builder.name;
		this.email = builder.email;
		this.user_Id = builder.user_Id;
	}

	public String getName() {
		return name;
	}

	public String getUser_Id() {
		return user_Id;
	}

	public String getEmail() {
		return email;
	}

	/*
	 * inner class to create object
	 */

	static class UserBuilder {
		private String name;
		private String user_Id;
		private String email;

		public UserBuilder() {

		}

		public UserBuilder setName(String name) {
			this.name = name;
			return this;
		}

		public UserBuilder setUser_Id(String user_Id) {
			this.user_Id = user_Id;
			return this;
		}

		public UserBuilder setEmail(String email) {
			this.email = email;
			return this;
		}

		public User build() {
			return new User(this);
		}

	}
}