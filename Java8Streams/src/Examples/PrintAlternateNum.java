package Examples;

import java.util.stream.IntStream;

public class PrintAlternateNum {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		IntStream.range(0, arr.length).filter(i->i%2!=0).forEach(System.out::println);
	}

}
