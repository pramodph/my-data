package Queue;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueDemo02 {

	public static void main(String[] args) {
		// Create a PriorityQueue with a custom comparator (Max-Heap)
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // Add elements
        maxHeap.add(45);
        maxHeap.add(10);
        maxHeap.add(30);
        maxHeap.add(20);
        maxHeap.add(50);

        // Print raw PriorityQueue (internal heap structure)
        System.out.println("PriorityQueue (Max-Heap) internal structure: " + maxHeap);

        // Retrieve values in descending order
        System.out.println("Retrieving elements in descending order:");
        while (!maxHeap.isEmpty()) {
            System.out.println(maxHeap.poll());
        }
	}

}
