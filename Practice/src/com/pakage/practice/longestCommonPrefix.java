package com.pakage.practice;

import java.util.Arrays;

public class longestCommonPrefix {

	public static void main(String[] args) {
		String [] str= {"flower","flow","flowght"};
		System.out.println(longestCommonPrefix(str));
	}

	private static char[] longestCommonPrefix(String[] str) {
			Arrays.sort(str);
			String first=str[0];
			String last =str[str.length-1];
			int count=0;
			for(int i=0;i<first.length();i++) {
				if(first.toCharArray()[i]==last.toCharArray()[i]){
					count++;
				}
			}
			return first.substring(0, count).toCharArray();
	}
	
	
	/* private static String longestCommonPrefix(String[] str) {
		StringBuilder sb = new StringBuilder();
		Arrays.sort(str);
		String first = str[0];
		String last = str[str.length - 1];
		int count = 0;
		for (int i = 0; i < first.length(); i++) {
			if (first.charAt(i) == last.charAt(i)) {
				count++;
			} else {
				break;
			}
		}
		return first.substring(0, count);
	}
*/
	
	
	// Another approach
	/*    private static String longestCommonPrefix(String[] str) {
	        if (str == null || str.length == 0) {
	            return "";
	        }

	        String prefix = str[0];
	        for (int i = 1; i < str.length; i++) {
	            while (str[i].indexOf(prefix) != 0) {
	                prefix = prefix.substring(0, prefix.length() - 1);
	                if (prefix.isEmpty()) {
	                    return "";
	                }
	            }
	        }
	        return prefix;
	    }
	}
*/
	
	
}
