package Examples;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

class CountEvenAndOdd {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int evenCount = 0;
		int oddCount = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}

		System.out.println("Even Count: " + evenCount);
		System.out.println("Odd Count: " + oddCount);
		
		Map<Boolean, Long> countMap = Arrays.stream(arr)
				.boxed()
				.collect(Collectors.partitioningBy(num -> num % 2 == 0, Collectors.counting()));
		System.out.println("Even Count using Streams: " + countMap.get(true) + ", Odd Count: " + countMap.get(false));
	}
}