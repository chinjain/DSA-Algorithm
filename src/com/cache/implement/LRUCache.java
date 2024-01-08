package com.cache.implement;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> implements Cache<K, V> {

	private final int capacity;
	private final Map<K, V> cache;
	private final Map<K, Integer> usageCount;

	public LRUCache(int capacity) {
		this.capacity = capacity;
		this.cache = new LinkedHashMap<>(capacity, 0.75f, true);
		this.usageCount = new HashMap<>();
	}

	@Override
	public void put(K key, V value) {
		// TODO Auto-generated method stub
		if (cache.size() >= capacity) {
			evict();
		}

		cache.put(key, value);
		usageCount.put(key, 0);

	}

	private void evict() {
		K keyToRemove = usageCount.entrySet().stream().min(Map.Entry.comparingByValue()).map(Map.Entry::getKey)
				.orElseThrow(() -> new RuntimeException("Cache is empty ..."));
		cache.remove(keyToRemove);
		usageCount.remove(keyToRemove);

	}

	@Override
	public V get(K key) {
		if (cache.containsKey(key)) {
			usageCount.put(key, usageCount.getOrDefault(key, 0) + 1);
			return cache.get(key);
		}
		return null;
	}

	@Override
	public void display() {
		System.out.println("LRU Cache: " + cache.keySet());
	}

}
