package gsquestions;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorisation {

	public static void main(String[] args) {
		int x=64;
		List<Integer>res=findPrimeFactors(x);
		System.out.println(res);
		
	}

	private static List<Integer> findPrimeFactors(int x) {
		List<Integer>lst=new ArrayList<>();
		for(int i=2;i<x/2;i++) {
			while(x%i==0) {
				System.out.println(i);
				lst.add(i);
				x=x/i;
			}
		}
		if(x>1) lst.add(x);
		return lst;
		
		//Time and space complexity is O(sqrt(n)) and space complexity is O(1)
	}

}
