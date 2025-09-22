package StreamMethods;

import java.util.HashSet;
import java.util.Set;

public class Demo05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// AllMatch, AnyMatch, NoneMatch findFirst, findAny
		
		Set<String> fruits = new HashSet<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Cherry");
		fruits.add("Date");
		fruits.add("Elderberry");
		fruits.add("Fig");
		
		// AllMatch: Check if all elements match a condition
		boolean allStartWithA = fruits.stream()
				.allMatch(fruit -> fruit.startsWith("A"));
		System.out.println("All fruits start with 'A': " + allStartWithA);
		
		// AnyMatch: Check if any element matches a condition
		boolean anyStartWithB = fruits.stream()
				.anyMatch(fruit -> fruit.startsWith("B"));
		System.out.println("Any fruit starts with 'B': " + anyStartWithB);
		
		// NoneMatch: Check if no elements match a condition
		boolean noneStartWithZ = fruits.stream()
				.noneMatch(fruit -> fruit.startsWith("Z"));
		System.out.println("No fruit starts with 'Z': " + noneStartWithZ);
		
		// FindFirst: Find the first element that matches a condition
		String firstFruitStartingWithC = fruits.stream()
				.filter(fruit -> fruit.startsWith("C"))
				.findFirst()
				.orElse("No fruit found starting with 'C'");
		System.out.println("First fruit starting with 'C': " + firstFruitStartingWithC);
		
		// FindAny: Find any element that matches a condition
		String anyFruitStartingWithD = fruits.stream()
				.filter(fruit -> fruit.startsWith("D"))
				.findAny()
				.orElse("No fruit found starting with 'D'");
		System.out.println("Any fruit starting with 'D': " + anyFruitStartingWithD);
		
		// FindFirst and FindAny can be used interchangeably in most cases,
		// but FindAny may be more efficient in parallel streams.
		// For example, using FindAny in a parallel stream:
		String anyFruitInParallel = fruits.parallelStream()
				.filter(fruit -> fruit.startsWith("E"))
				.findAny()
				.orElse("No fruit found starting with 'E'");
		System.out.println("Any fruit starting with 'E' in parallel stream: " + anyFruitInParallel);
		// Note: The output of FindAny may vary in parallel streams due to non-deterministic execution order.
		// It's important to use FindAny when the order of elements is not significant.
		// In contrast, FindFirst guarantees the first element based on the encounter order of the stream.
		// In this example, we used FindFirst to find the first fruit starting with 'C',
		// which is deterministic and will always return the same result.
		// In summary, AllMatch, AnyMatch, NoneMatch, FindFirst, and FindAny are powerful methods
		// for checking conditions and retrieving elements from streams.
		// They allow you to perform checks and retrieve elements based on specific conditions,
		// making it easier to work with collections in a functional programming style.
		// These methods are particularly useful for filtering and validating data in collections,
		// and they can be combined with other stream operations to create complex data processing pipelines.
		// Remember to use these methods judiciously based on your specific use case,
		// as they can impact performance, especially when dealing with large datasets.
		// In conclusion, streams in Java provide a powerful and expressive way to work with collections,
		// allowing you to perform operations like filtering, mapping, and reducing data in a functional style.
			
	}

}
