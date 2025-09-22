package Examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

	public static void main(String[] args) {
		String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};
		List<List<String>> result = null;
		result=groupAnagrams(arr);
		System.out.println("Grouped Anagrams: " + result);
		
	}

	public  static List<List<String>> groupAnagrams(String[] arr) {
		Map<String, List<String>> map = new HashMap<>();
		for (String str : arr) {
			char[] charArray = str.toCharArray();
			Arrays.sort(charArray);
			String sortedStr = new String(charArray);
			map.computeIfAbsent(sortedStr, k -> new ArrayList<>()).add(str);
		}
		return new ArrayList<>(map.values());
	}

}
