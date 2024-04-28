
public class DemoTest {

	public static void main(String[] args) {
		parent parent = (parent) new child();
		System.out.println(parent.getAge());
	}

}

class parent {

	public int getAge() {
		return 22;
	}

}

class child extends parent {

	public int getAge() {
		return 20;
	}

}