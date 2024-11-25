import java.util.HashMap;
import java.util.HashSet;

public class StringDemo {
	
	public static void main(String[] args) {
		
		StringBuilder builder = new StringBuilder("nncjdskalejdncjdj");
		System.err.println(builder.capacity());
//		builder.setCharAt(34,'c');
//		System.err.println(builder.capacity());
		
		String str1 = "Scaler by InterviewBit".intern();  //Line1
		String str2 = "Scaler by InterviewBit".intern(); //Line2
		System.out.println(str1 == str2); //prints true  
		
		StringBuffer buffer = new StringBuffer("nncjdskalejdncjdj");
		System.out.println(buffer.capacity());
		
		HashSet hashSet = new HashSet<>();
		
	}

}
