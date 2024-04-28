import java.util.Collections;
import java.util.*;

public class ImmutableClasses {

	public static void main(String[] args) {

		Character character = new Character('c');
		Character character2 = new Character('c');

		System.err.println(character == character2);

		Map<Integer, Integer> currentMap = new HashMap<>();

		Map<Integer, Integer> map = Collections.unmodifiableMap(currentMap);
		
		map.put(1, 1);
//		LinkedHashMap<K, V>

	}

}
