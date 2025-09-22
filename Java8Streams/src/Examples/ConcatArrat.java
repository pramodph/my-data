package Examples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatArrat {

	public static void main(String[] args) {
		Integer[] arr1 = {1, 2, 3,3};
		Integer[] arr2 = {4, 5, 6};
		
		// Concatenate two arrays and sort them
		List<Integer> ConcatList = Stream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).sorted()
				.collect(Collectors.toList());
		System.out.println("Concatenated and sorted list: " + ConcatList);
		
		//convert array to list and then concatenate
		List<Integer> ConcatList2 = Stream.concat(Arrays.asList(arr1).stream(), Arrays.asList(arr2).stream()).sorted()
				.collect(Collectors.toList());
		System.out.println("Concatenated and sorted list: " + ConcatList2);
		
		// Concatenate two arrays fetch distinct values and sort
		List<Integer> ConcatListDistinct = Stream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).distinct().sorted()
				.collect(Collectors.toList());
		System.out.println("Concatenated and sorted list with distinct values: " + ConcatListDistinct);
		
		// Concatenate two arrays and sort them in reverse order
		List<Integer> ConcatListReverse = Stream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		System.out.println("Concatenated and sorted list in reverse order: " + ConcatListReverse);
		
		//seggregatedList the values
		
		List<Integer> seggregatedList = Arrays.asList(1,0,2,0,3,0,4,0,5,0,6,0,7,0,8,0,9);
		List<Integer> abc= Stream.concat(seggregatedList.stream().filter(i->i==0),seggregatedList.stream().filter(i->i!=0))
				.collect(Collectors.toList());
		System.out.println("seggregatedList and sorted list in reverse order: " + abc);
	}
}
