import java.util.Enumeration;
import java.util.Vector;

public class ConcurrentException {

	public static void main(String[] args) {

		Vector<String> vector = new Vector<String>();
		vector.add("one");
		vector.add("two");
		vector.add("three");

		Enumeration<String> enumeration = vector.elements();

		while (enumeration.hasMoreElements()) {
			String element = enumeration.nextElement();
			
			System.out.println("ConcurrentException.main()");
			vector.remove(element);
			System.out.println("ConcurrentException.main()");
		}

	}

}
