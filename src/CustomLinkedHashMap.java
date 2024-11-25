import java.util.HashMap;
import java.util.Map;

public class CustomLinkedHashMap {

	public static void main(String[] args) {

	}

}

class Entry<K, V> {

	K key;
	V value;
	Entry<K, V> next;
	Entry<K, V> prev;
}

class LinkedMap<K, V> {

	private static final int DEFAULT_INITIAL_CAPACITY = 16;
	private static final float DEFAULT_LOAD_FACTOR = 0.75f;

	private final int capacity;
	private final float loadFactor;
	private final int size;
	private final Map<K, Entry<K, V>> map;

	private Entry<K, V> head;
	private Entry<K, V> tail;

	public LinkedMap() {
		this(DEFAULT_INITIAL_CAPACITY, DEFAULT_LOAD_FACTOR);
	}

	public LinkedMap(int capacity, float loadFactory) {

		this.capacity = capacity;
		this.loadFactor = loadFactory;
		this.size = 0;
		this.map = new HashMap<>(capacity, loadFactory);
		initializeMap();
	}

	private void initializeMap() {
		head = new Entry<>();
		tail = new Entry<>();
		head.next = tail;
		tail.prev = head;

	}

	public void put(K key, V value) {

		Entry<K, V> newEntry = new Entry<>();
		newEntry.key = key;
		newEntry.value = value;

		map.put(key, newEntry);
		addToTail(newEntry);

	}

	private void addToTail(Entry<K, V> newEntry) {
		Entry<K, V> last = tail.prev;
		last.next = newEntry;
		newEntry.prev = last;
		newEntry.next = tail;
		tail.prev = newEntry;
	}

}