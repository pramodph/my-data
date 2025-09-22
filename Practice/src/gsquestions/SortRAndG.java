package gsquestions;

import java.util.Arrays;

public class SortRAndG {

	public static void main(String[] args) {
		char [] arr= {'r','g','r','r','g','r'};
		System.out.println(sortArray(arr));
		//System.out.println(sortArray1(arr));
		
	}

	private static void sortArray1(char[] arr) {
		int countR=0;
		int countG=0;
		for(char ch:arr) {
			if(ch=='r')countR++;
			else if(ch=='g') countG++;
		}
		int index=0;
		while(countR-->0)arr[index++]='r';
		while(countG-->0)arr[index++]='g';
		System.out.println(Arrays.toString(arr));
	}

	private static char[] sortArray(char[] arr) {
		int left=0;
		for(int right=0;right<arr.length;right++) {
			if(arr[right]=='r') {
				char temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
				left++;
			}
			
		}
		return arr;
	}
	//Time complexity is O(n) and space complexity is O(1)
	

}
