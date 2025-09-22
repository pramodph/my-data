package StreamMethods;

import java.util.List;

public class Demo02 {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		// Count() the number of elements in the stream
		long count = numbers.stream()
				.count();
		System.out.println("Count of Numbers: " + count);
		
		// count even numbers in the stream
		long countEvenNumbers = numbers.stream()
				.filter(n -> n % 2 == 0)
				.count();
		System.out.println("Count of Even Numbers: " + countEvenNumbers);
		
		// count odd numbers in the stream
		long countOddNumbers = numbers.stream()
				.filter(n -> n % 2 != 0)
				.count();
		System.out.println("Count of Odd Numbers: " + countOddNumbers);
		
		// Find the maximum number in the stream
		int maxNumber = numbers.stream()
				.max(Integer::compareTo)
				.orElseThrow(() -> new RuntimeException("No numbers found"));
		System.out.println("Maximum Number: " + maxNumber);
		
		// Find the minimum number in the stream
		int minNumber = numbers.stream()
				.min(Integer::compareTo)
				.orElseThrow(() -> new RuntimeException("No numbers found"));
		System.out.println("Minimum Number: " + minNumber);
		
		// Find the sum of all numbers in the stream
		int sum = numbers.stream()
				.mapToInt(Integer::intValue)
				.sum();
		System.out.println("Sum of Numbers: " + sum);
		
		// Find the average of all numbers in the stream
		double average = numbers.stream()
				.mapToInt(Integer::intValue)
				.average()
				.orElseThrow(() -> new RuntimeException("No numbers found"));
		System.out.println("Average of Numbers: " + average);
		
		// Reduce the stream to a single value (sum)
		int reducedSum = numbers.stream()
				.reduce(0, Integer::sum);
		System.out.println("Reduced Sum of Numbers: " + reducedSum);
	}

}
