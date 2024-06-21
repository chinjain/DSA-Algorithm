package cache_lld;

import java.util.HashMap;
import java.util.Map;

public class HashMapBased<Key, Value> implements Storage<Key, Value> {

	Map<Key, Value> map = new HashMap<>();

	@Override
	public void add(Key k, Value v) throws StorageFullException {
		map.put(k, v);

	}

	@Override
	public void remove(Key k) throws NotFoundException {
		map.remove(k);
	}

	@Override
	public Value get(Key k) throws NotFoundException {
		return map.get(k);
	}

}
