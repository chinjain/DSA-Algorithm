package collections_practices;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class Fail_Fast_Fail_Safe {

	public static void main(String[] args) {
		List<Integer> list = new CopyOnWriteArrayList<Integer>();
		list.add(3);
		list.add(4);

		for (int i : list) {
			System.out.println(i);
			list.add(20);
		}

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		map.put(1, 1);
		map.put(2, 2);
		
		Map<Integer, Integer> hashMap =  Collections.unmodifiableMap(map);
//		hashMap.put(1, 0);
	}

}
