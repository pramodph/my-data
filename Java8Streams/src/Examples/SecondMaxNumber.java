package Examples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondMaxNumber {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(3, 5, 7, 2, 8, 6, 4, 1);
		System.out.println(numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
		System.out.println();
		// Find the second maximum number
		int secondMax = numbers.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst()
				.orElseThrow(() -> new RuntimeException("No second maximum number found"));
		System.out.println("Second maximum number: " + secondMax);
		System.out.println();
		
		System.out.println(numbers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get());

	}
}