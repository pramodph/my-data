package Queue;

import java.util.PriorityQueue;

public class PriorityQueueDemo01 {

	public static void main(String[] args) {
		// Create a PriorityQueue of Integers
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add elements
        pq.add(50);
        pq.add(10);
        pq.add(30);
        pq.add(20);
        pq.add(40);

        // Print PriorityQueue
        System.out.println("PriorityQueue elements: " + pq);
       // pq.poll();
        System.out.println("PriorityQueue elements: " + pq);

        // Poll elements one by one (will come out in ascending order)
        System.out.println("Polling elements in priority order:");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
	}
	
/*
PriorityQueue in Java does not guarantee sorted order when printing directly.

But when you retrieve using poll(), you always get the smallest element first (ascending order for integers).

Time complexity:

add() → O(log n)

poll() → O(log n)

peek() (to check smallest element) → O(1)
	 */

}
