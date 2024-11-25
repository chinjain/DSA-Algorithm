
public class TestClass {
	
	public static void main(String[] args) {
		String x = "ab";
		change(x);
		System.out.println(x);
	}

	private static void change(String x) {
		
		x = "cd";
	}

}
