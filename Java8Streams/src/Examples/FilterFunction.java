package Examples;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FilterFunction {
	@FunctionalInterface
	interface Calculator {
		int calculate(int args, int b);
	}

	public static void main(String[] args) {
		//Simple Runnable Example
		Runnable runnable = () -> System.out.println("Hello, World!");
		new Thread(runnable).start();
		System.out.println("Thread started");
		
		System.out.println();
		
		//Iterate the list using lambda
		List<String> list = List.of("apple", "banana", "cherry");
		list.forEach(item -> { System.out.println("Item: " + item);});
		
		//Filter the list using lambda
		List<String> filteredList = list.stream()
				.filter(item -> item.startsWith("b"))
				.toList();
		System.out.println("Filtered List: " + filteredList);
		System.out.println();
		
		//Using a custom functional interface
		Calculator calculator = (a, b) -> a + b;
		Calculator multiply = (a, b) -> a * b;
		System.out.println("Sum: " + calculator.calculate(5, 3));
		System.out.println("Multiply: " + multiply.calculate(5, 3));
		System.out.println();
		
		//Lambda with Map interface
		Map<String, Integer> map = new HashMap<>();
		map.put("apple", 1);
		map.put("banana", 2);
		map.put("cherry", 3);
		map.forEach((key, value) -> {
			System.out.println("Key: " + key + ", Value: " + value);
			System.out.println();
		});
		
		//Creating a thread using lambda
		new Thread(() -> {
			System.out.println("Thread is running");
		}).start();
		System.out.println();
		
		//Lambda in comparator
//		list.sort(Comparator.comparingInt(String::length));
//		list.forEach(System.out::println);
//		System.out.println();
		
		//Lambda with Optional
		Optional<String> optional = Optional.of("Hello");
		optional.ifPresent(value -> System.out.println("Value: " + value));
		System.out.println();
		
		//Lambda with predicate
        Predicate<String> predicate = s -> s.isEmpty();
        System.out.println("Is empty: " + predicate.test(""));
        System.out.println("Is not empty: " + predicate.test("Hello"));		
        System.out.println();

        //Lambda with Bi-function
        BiFunction<String, String, String> biFunction = (a, b) -> a + b;
        String result = biFunction.apply("Hello", " World");
        System.out.println("BiFunction result: " + result);
        
        //Lambda with consumer
        Consumer<String> consumer = s -> System.out.println("Consumer: " + s);
        consumer.accept("Hello, Consumer!");
        System.out.println();
        
        //Lambda with Supplier
        Supplier<String> supplier = () -> "Hello, Supplier!";
        System.out.println("Supplier: " + supplier.get());
        System.out.println();
        
        //lambda with Function
        Function<String, Integer> function = s -> s.length();
        System.out.println("Function result: " + function.apply("Hello, Function!"));
        System.out.println();
        
        //lambda with Unary operator
        UnaryOperator<Integer> unaryOperator = i -> i * 2;
        System.out.println("Unary operator result: " + unaryOperator.apply(5));
        System.out.println();
        
        //lambda with Binary operator
        BiFunction<Integer, Integer, Integer> binaryOperator = (a, b) -> a + b;
        System.out.println("Binary operator result: " + binaryOperator.apply(5, 3));
        System.out.println();
        
        //Lambda with checking the even
        Predicate<Integer> isEven = i -> i % 2 == 0;
        System.out.println("Is 4 even? " + isEven.test(4));
        System.out.println("Is 5 even? " + isEven.test(5));
        System.out.println();
        
        //Lambda with custom sorting reverse order
        List<String> names = List.of("John", "Jane", "Jack");
        names.stream()
			.sorted(Comparator.reverseOrder())
			.forEach(name -> System.out.println("Name: " + name));
        System.out.println();
		
//		list.sort((s1,s2) -> s2.compareTo(s1));
//		list.forEach(System.out::println);
//		System.out.println();
		
		//lambda for uppercase Conversion
		List<String> upperCaseList = list.stream()
				.map(String::toUpperCase)
				.toList();
		System.out.println("Uppercase List: " + upperCaseList);
		System.out.println();
		
		//Lambda with Reduce
		List<Integer> numbers = List.of(1, 2, 3, 4, 5);
		int sum = numbers.stream()
				.reduce(0, (a, b) -> a + b);
		System.out.println("Sum: " + sum);
		System.out.println();
		
		//Lambda with flatMap
		List<List<String>> listOfLists = List.of(
				List.of("apple", "banana"),
				List.of("cherry", "date")
		);
		List<String> flatList = listOfLists.stream()
				.flatMap(List::stream)
				.toList();
		System.out.println("Flat List: " + flatList);
		System.out.println();
		
		
		//Lambda with stream distinct
		List<String> duplicateList = List.of("apple", "banana", "apple", "cherry");
		List<String> distinctList = duplicateList.stream()
				.distinct()
				.toList();
		System.out.println("Distinct List: " + distinctList);
		
		//Lambda with stream limit
		List<String> limitedList = list.stream()
				.limit(2)
				.toList();
		System.out.println("Limited List: " + limitedList);
		
		//Lambda with stream skip
		List<String> skippedList = list.stream()
				.skip(1)
				.toList();
		System.out.println("Skipped List: " + skippedList);
		System.out.println();
		
		//Lambda with stream count	
		long count = list.stream()
				.count();
		System.out.println("Count: " + count);
		
		//Lambda with stream findFirst
		Optional<String> firstElement = list.stream()
				.findFirst();		
		System.out.println("First Element: " + firstElement.orElse("No element found"));
		
		//Lambda with stream findAny
		Optional<String> anyElement = list.stream()
				.findAny();
		System.out.println("Any Element: " + anyElement.orElse("No element found"));
		
		
		//Lambda with stream allMatch
		boolean allMatch = list.stream()
				.allMatch(item -> item.length() > 3);
		System.out.println("All match: " + allMatch);
		//Lambda with stream anyMatch
		boolean anyMatch = list.stream()
				.anyMatch(item -> item.startsWith("a"));
		System.out.println("Any match: " + anyMatch);
		//Lambda with stream noneMatch
		boolean noneMatch = list.stream()
				.noneMatch(item -> item.startsWith("z"));
		System.out.println("None match: " + noneMatch);
		
		//Lambda with stream forEachOrdered
		list.stream()
				.forEachOrdered(item -> System.out.println("Ordered Item: " + item));
		System.out.println();
		
		//Lambda with stream peek
		list.stream()
				.peek(item -> System.out.println("Peek Item: " + item))
				.forEach(item -> System.out.println("Final Item: " + item));
		System.out.println();
		
		//Lambda for max integer
		List<Integer> intList = List.of(1, 2, 3, 4, 5);
		int suming =intList.stream().mapToInt(Integer::intValue).max().orElse(Integer.MIN_VALUE);
		System.out.println("Max Integer: " + suming);
		
		//Lambda for min integer
		int min = intList.stream().mapToInt(Integer::intValue).min().orElse(Integer.MAX_VALUE);	
		System.out.println("Min Integer: " + min);
		System.out.println();
		
		
	}

}
