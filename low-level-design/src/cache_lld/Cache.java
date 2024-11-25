package cache_lld;

public class Cache<Key, Value> {

	private final EvictionPolicy<Key> evictionPolicy;
	private final Storage<Key, Value> storage;

	public Cache(EvictionPolicy<Key> evictionPolicy, Storage<Key, Value> storage) {
		this.evictionPolicy = evictionPolicy;
		this.storage = storage;
	}
	
	public void put(Key key, Value val) {
		try {
			this.storage.add(key,val);
			
			
		}catch (StorageFullException e) {
			// TODO: handle exception
		}
	}

}
