
public class Clone_test implements Cloneable {

	private int age;
	private String name;

	public Clone_test(int age, String name) {
		
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	@Override
	public String toString() {
		return "Clone_test [age=" + age + ", name=" + name + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Clone_test  org = new Clone_test(20, "John");
		Clone_test clone = (Clone_test) org.clone();
		
		clone.setName("Chinmay");
		clone.setAge(25);
		
		System.out.println("Original " + org.getAge() + " ");
		System.out.println("Clone " + clone.getAge());
	}

}
