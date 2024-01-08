package com.cache.implement;

public interface Cache<K, V> {

	public void put(K key, V value);

	V get(K key);

	void display();

}
