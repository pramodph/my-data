package lrucache;

import java.util.Map;

class Node{
	int key;
	int value;
	Node prev;
	Node next;
	
	public Node(int key, int value) {
		this.key = key;
		this.value = value;
	}
}

class LRUCacheExtended{
	private final int capacity;
	private final Map<Integer, Node> map;
	private final Node head,tail;
	
	public LRUCacheExtended(int capacity) {
		this.capacity = capacity;
		this.map = new java.util.HashMap<>();
		this.head = new Node(0,0);
		this.tail = new Node(0,0);
		head.next = tail;
		tail.prev = head;
	}
	
	public int get(int key) {
		if(!map.containsKey(key)) return -1;
			Node node = map.get(key);
			remove(node);
			insertAtFront(node);
			return node.value;
		
	}

	public void put(int key,int value) {
		if(map.containsKey(key)) {
			remove(map.get(key));
		}if(map.size()==capacity) {
			Node lru = tail.prev;
			remove(lru);
			map.remove(lru.key);
		}
		Node newNode = new Node(key,value);
		insertAtFront(newNode);
		map.put(key, newNode);
	}
	
	private void insertAtFront(Node node) {
		node.next=head.next;
		node.prev=head;	
		head.next.prev=node;	
		head.next=node;
	}

	private void remove(Node node) {
		node.prev.next=node.next;
		node.next.prev=node.prev;
	}
}
public class LRUCacheDoublyLinkedlist {

	public static void main(String[] args) {
		LRUCacheExtended lruCache = new LRUCacheExtended(3);
		lruCache.put(1, 1);
		lruCache.put(2, 2);
		lruCache.put(3, 3);
		System.out.println(lruCache.get(1)); // returns 1
		lruCache.put(4, 4); // evicts key 2
		System.out.println(lruCache.get(2)); // returns -1 (not found)
	}

}
