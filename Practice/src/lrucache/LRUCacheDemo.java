package lrucache;

import java.util.LinkedHashMap;
import java.util.Map;

class LRUCache<K,V> extends LinkedHashMap<K, V>{
	private int capacity;
	
	public LRUCache(int capacity) {
		super(capacity, 0.75f, true);
		this.capacity = capacity;
	}
	
	@Override
	protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
		return size() > capacity;
	}
}


public class LRUCacheDemo {

	public static void main(String[] args) {
		LRUCache<Integer, String> lruCache = new LRUCache<>(3);
		lruCache.put(1, "One");
		lruCache.put(2, "Two");
		lruCache.put(3, "Three");
		
		System.out.println("Initial Cache: " + lruCache);
		
		lruCache.get(1); // Access key 1
		System.out.println("After accessing key 1: " + lruCache);
		
		lruCache.get(3); 
		System.out.println("After accessing key 1: " + lruCache);
		
		lruCache.put(4, "Four"); // This should evict key 2
		System.out.println("After adding key 4: " + lruCache);
		
		lruCache.get(4); // Access key 3
		System.out.println("After accessing key 3: " + lruCache);
		
		lruCache.put(5, "Five"); // This should evict key 4
		System.out.println("After adding key 5: " + lruCache);
		
		lruCache.put(6, "Five"); // This should evict key 4
		System.out.println("After adding key 6: " + lruCache);
		
		lruCache.put(7, "Five"); // This should evict key 4
		System.out.println("After adding key 7: " + lruCache);
		
		lruCache.put(8, "Five"); // This should evict key 4
		System.out.println("After adding key 8: " + lruCache);
	}

}
