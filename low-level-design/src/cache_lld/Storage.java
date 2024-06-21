package cache_lld;

public interface Storage<Key, Value> {

	public void add(Key k, Value v) throws StorageFullException;

	void remove(Key k) throws NotFoundException;

	Value get(Key k) throws NotFoundException;

}
