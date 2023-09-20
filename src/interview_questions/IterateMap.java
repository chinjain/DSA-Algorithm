package interview_questions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IterateMap {

	public static void main(String[] args) {
		Map<Integer, String> companies = new HashMap<Integer, String>();
		companies.put(1, "citibank");
		companies.put(2, "Wells fargo");
		companies.put(3, "Amazon");

		System.out.println("---------------------------------");
		System.err.println("Iterate map using for each java 5");

		for (Integer i : companies.keySet()) {
			System.out.println("Key_" + i + " values_" + companies.get(i));
		}

		System.out.println("---------------------------------");
		System.out.println("Iterate map using Key Set Iterator");

		Set<Integer> keySet = companies.keySet();
		Iterator<Integer> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			Integer next = iterator.next();
			System.out.println("---------------------------------");
			System.out.println("key_" + next + " value_" + companies.get(next));
		}

		System.out.println("---------------------------------");
		System.out.println("Iterate map using Entry Set and for each loop java 5");

		Set<Entry<Integer, String>> entrySet = companies.entrySet();
		for (Entry<Integer, String> ent : entrySet) {
			System.out.println("key_" + ent.getKey() + " value_" + ent.getValue());
		}

	}
}
