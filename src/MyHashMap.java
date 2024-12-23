
public class MyHashMap<K, V> {

	private static final int DEFAULT_CAPACITY = 16;
	private static final float DEFAULT_LOAD_FACTOR = 0.75f;

	private final int capacity;
	private final float loadFactor;
	private int size;

	private final Node<K, V>[] table;

	public MyHashMap() {
		this(DEFAULT_CAPACITY, DEFAULT_LOAD_FACTOR);
	}

	public MyHashMap(int capacity, float loadFactor) {
		this.capacity = capacity;
		this.loadFactor = loadFactor;
		this.table = new Node[capacity];
	}

	private static class Node<K, V> {
		K key;
		V value;
		Node<K, V> next;

		public Node(K key, V value) {
			this.key = key;
			this.value = value;
		}
	}

	private int hash(K key) {
		return key.hashCode() % capacity;
	}

	public void put(K key, V value) {
		int idx = hash(key);
		Node<K, V> node = table[idx];

		while (node != null) {
			if (node.key.equals(key)) {
				node.value = value;
				return;
			}
			node = node.next;
		}

		Node<K, V> newNode = new Node<>(key, value);
		newNode.next = table[idx];
		table[idx] = newNode;
		size++;
		if (size > capacity * loadFactor) {
			resize();
		}
	}

	private void resize() {

	}

}
