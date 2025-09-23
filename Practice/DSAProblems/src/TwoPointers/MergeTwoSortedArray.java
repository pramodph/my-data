package TwoPointers;

import java.util.Arrays;

public class MergeTwoSortedArray {

	public static void main(String[] args) {
		int[] arr1= {1,2,3,4};
		int[] arr2= {2,8,9};
		System.out.println(Arrays.toString(mergeSortedArray(arr1,arr2)));
	}

	private static int[] mergeSortedArray(int[] arr1, int[] arr2) {
		int n1=arr1.length;
		int n2=arr2.length;
		int[] result=new int[n1+n2];
		int i=0,j=0,idx=0;
		while(i<n1 || j<n2) {
			int val1=(i<n1)?arr1[i]:Integer.MAX_VALUE;
			int val2=(j<n2)?arr2[j]:Integer.MAX_VALUE;
			
			if(val1<val2) {
				result[idx++]=val1;
				i++;
			}else {
				result[idx++]=val2;
				j++;
			}
		}
		
		while(i<n1) result[idx++]=arr1[i];
		while(j<n2) result[idx++]=arr2[j];
		
		return result;
	}
//Time Complexity:O(n1 + n2): Each element from both arrays is processed once.

//Space Complexity: O(n1 + n2): The result array is used to store the merged elements.
}
