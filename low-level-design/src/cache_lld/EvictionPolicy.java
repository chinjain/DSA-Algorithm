package cache_lld;

public interface EvictionPolicy<Key> {

	void keyAccessed(Key k);

	Key evictKet();

}
