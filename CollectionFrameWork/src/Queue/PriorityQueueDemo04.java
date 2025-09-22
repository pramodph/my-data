package Queue;

import java.util.PriorityQueue;
import java.util.Comparator;


public class PriorityQueueDemo04 {
    public static void main(String[] args) {
        // PriorityQueue with custom Comparator for descending order of age
        PriorityQueue<Student> pq = new PriorityQueue<>(
                Comparator.comparingInt(Student::getAge).reversed()
        );

        // Add Student objects
        pq.add(new Student(1, "Alice", 22));
        pq.add(new Student(2, "Bob", 19));
        pq.add(new Student(3, "Charlie", 25));
        pq.add(new Student(4, "David", 20));

        // Print internal heap structure (not sorted order)
        System.out.println("PriorityQueue internal structure: " + pq);

        // Retrieve Students in descending order of age
        System.out.println("Students in descending order of age:");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}

/*
Default PriorityQueue = min-heap.
To make a max-heap (descending order), you need:
Comparator.reversed() ✅ (clean way)
or reverse logic in compareTo() if using Comparable.
 */
