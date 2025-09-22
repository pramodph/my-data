package Queue;

import java.util.Comparator;
import java.util.PriorityQueue;

class Student {
    private int id;
    private String name;
    private int age;

    // Constructor
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }

    // To display Student details
    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', age=" + age + "}";
    }
}

public class PriorityQueueDemo03 {
	public static void main(String[] args) {
        // PriorityQueue with Comparator to sort by age in ascending order
        PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.comparingInt(Student::getAge));

        // Add Student objects
        pq.add(new Student(1, "Alice", 22));
        pq.add(new Student(2, "Bob", 19));
        pq.add(new Student(3, "Charlie", 25));
        pq.add(new Student(4, "David", 20));

        // Print raw PriorityQueue (heap structure, not sorted)
        System.out.println("PriorityQueue internal structure: " + pq);

        // Retrieve Students in ascending order of age
        System.out.println("Students in ascending order of age:");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
