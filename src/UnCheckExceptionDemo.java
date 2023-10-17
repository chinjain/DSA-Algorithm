
public class UnCheckExceptionDemo {

	public static void main(String[] args) throws Exception {
		
		int a = 5;
		int b = 0;
		
//		try {
			
			int c = a /b;
			throw new Exception("Arithmetixs");
			
//		}catch (ArithmeticException e) {
//			// TODO: handle exception
//			System.out.println("Exception");
//		}
		
	}
}
