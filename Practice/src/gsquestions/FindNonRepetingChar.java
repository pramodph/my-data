package gsquestions;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindNonRepetingChar {

	public static void main(String[] args) {
		String str="swiss";
		int k=2;
		System.out.println(nthNonRepetingChar(str,k));
	}

	private static char nthNonRepetingChar(String str,int k) {
		if(str.length()<k) return '0';
		Map<Character,Integer> countMap=new LinkedHashMap<>();
		for(char ch:str.toCharArray()) {
			countMap.put(ch,countMap.getOrDefault(ch, 0)+1);
		}
		int count=0;
		for(Map.Entry<Character,Integer>res:countMap.entrySet()) {
			if(res.getValue()==1) {
				count++;
				if(count==k) {
					return res.getKey();
				}
			}
		}
		return '0';
	}
	//Time complexity is O(n) and space complexity is O(1) as we are using a fixed size map

}
