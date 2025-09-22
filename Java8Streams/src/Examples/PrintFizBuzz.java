package Examples;

import java.util.stream.IntStream;

public class PrintFizBuzz {

	public static void main(String[] args) {
		IntStream.range(1, 100)
		.mapToObj(x->x%5==0 ? (x%7==0? "FizzBuzz":"Fizz") : (x%7==0?"Buzz":x)).forEach(System.out::println);
	}

}
