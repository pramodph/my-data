package com.pakage.brackets;

public class BalancedBrackets {

	public static void main(String[] args) {
		String str="(){})(";
		//with counter will be able t handle only one type of brackets as order also we have to check not only count;
		System.out.println(isBalancedBraket(str));
	}

	private static boolean isBalancedBraket(String str) {
		int count=0;
		for(char c:str.toCharArray()) {
			if(c=='(') count++;
			else if(c==')') count--;
		}
		return count==0;
	}

}
