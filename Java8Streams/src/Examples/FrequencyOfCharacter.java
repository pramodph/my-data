package Examples;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfCharacter {

	public static void main(String[] args) {
		String str = "Hello World";
		char ch = 'o';
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				count++;
			}
		}

		System.out.println("Frequency of '" + ch + "' in \"" + str + "\" is: " + count);

		// Using Java 8 Streams
		long frequency = str.chars()
				.filter(c -> c == ch)
				.count();

		System.out.println("Frequency of '" + ch + "' using Streams: " + frequency);
		
		// Using Java 8 Streams with Collectors
		Map<Character, Long> frequencyMap = str.chars()
				.mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		System.out.println("Frequency Map: " + frequencyMap);
		
		// Using Java 8 Streams with Collectors and removing spaces
		Map<Character,Long> frequencyMap2=str.replaceAll("\\s","").chars()
				.mapToObj(c-> (char) c)
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println("Frequency Map without spaces: " + frequencyMap2);
		
	}

}
