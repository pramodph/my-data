package StreamMethods;

import java.util.List;
import java.util.stream.Stream;

public class Demo06 {

	public static void main(String[] args) {
		// Concat() method is used to concatenate two streams into one.
		// It allows you to combine the elements of two streams into a single stream.
		// This is useful when you want to process elements from multiple sources together.
		// Example: Concatenating two streams of integers
		List<String> stream1 = List.of("A", "B", "C");
		List<String> stream2 = List.of("D", "E", "F");
		List<String> concatenatedStream = Stream.concat(stream1.stream(), stream2.stream())
				.toList();
		System.out.println("Concatenated Stream: " + concatenatedStream);
	}

}
