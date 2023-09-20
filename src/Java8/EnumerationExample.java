package Java8;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class EnumerationExample {

	public static void main(String[] args) {
		Hashtable<String, Integer> hashtable = new Hashtable<>();

		// Add some key-value pairs to the Hashtable
		hashtable.put("Alice", 25);
		hashtable.put("Bob", 30);
		hashtable.put("Charlie", 35);

		Enumeration<String> enumeration = hashtable.keys();
		while (enumeration.hasMoreElements()) {
			System.out.println("Yeah ->>>" + hashtable.get(enumeration.nextElement()));
		}

		Map<String, Integer> map = new Hashtable<>();
		map.put("A", 1);
		map.put("B", 2);
		Iterator<Map.Entry<String, Integer>> iterator1 = map.entrySet().iterator();

		while (iterator1.hasNext()) {
			Map.Entry<String, Integer> entry = iterator1.next();
			map.remove("A"); // This will not throw an exception, and the iteration will continue

		}

//		
//		List<String> list = new ArrayList<>();
//		list.add("A");
//		list.add("B");
//		Iterator<String> iterator = list.iterator();
//
//		while (iterator.hasNext()) {
//		    String element = iterator.next();
//		    if (element.equals("B")) {
//		        list.remove("A"); // This line will throw ConcurrentModificationException
//		    }
//		}
//
	}

}
