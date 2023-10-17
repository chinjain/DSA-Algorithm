
public class BasicJavaProblems {
	
	public static void main(String[] args) {
		
		isArmStrongNumber(153);
		
	}

	private static void isArmStrongNumber(int i) {
		int org = i;
		int result = 0; 
		int rem = 0;
		while(org > 0) {
			rem = org % 10;
			result = result + (rem * rem * rem );
			org /= 10;
		}
		
		if(result == i) {
			System.out.println("Arm Strong");
			return ;
		}else {
			System.err.println("Not Valid");
			return;
		}
		
	}

}
