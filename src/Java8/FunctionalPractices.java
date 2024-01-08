package Java8;

import java.util.function.Predicate;

public class FunctionalPractices {
	public static void main(String[] args) {

		Test t1 = new Test();
		t1.setId(1);
		t1.setName("t1");

		Predicate<Test> predicate = (t) -> t.name == null;
		
		System.out.println(predicate.test(t1));

	}

}

class Test {
	int id;
	String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Test [id=" + id + ", name=" + name + "]";
	}

}
