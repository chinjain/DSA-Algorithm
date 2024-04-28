
public class TestClass {
	
	public static void main(String[] args) {
		String x = new String("ab");
		change(x);
		System.out.println(x);
	}

	private static void change(String x) {
		
		x = "cd";
	}

}
