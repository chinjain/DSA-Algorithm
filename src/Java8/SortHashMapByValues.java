package Java8;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortHashMapByValues {

	public static void main(String[] args) {

		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		// enter data into hashmap
		hm.put("Math", 98);
		hm.put("Data Structure", 85);
		hm.put("Database", 91);
		hm.put("Java", 95);
		hm.put("Operating System", 79);
		hm.put("Networking", 80);

		HashMap<String, Integer> sortUsingList = sortUsingList(hm);
		
		for(Map.Entry<String,Integer> entry : sortUsingList.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

	private static HashMap<String, Integer> sortUsingList(HashMap<String, Integer> hm) {
		List<Map.Entry<String, Integer>> entries = new LinkedList<Map.Entry<String, Integer>>(hm.entrySet());
		
		Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>(){

			@Override
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				return (o1.getValue()).compareTo(o2.getValue());
			}
			
		});
		
		
		HashMap<String, Integer> temp = new HashMap<String, Integer>();
		for(Map.Entry<String, Integer> aa : entries) {
			temp.put(aa.getKey(), aa.getValue());
		}

		return temp;
		
	}

}
