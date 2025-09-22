package com.pakage.practice;

import java.util.Stack;

public class checkValidBrakets {

	public static void main(String[] args) {
		String d = "{()}";
		if (checkValid(d)) {
			System.out.println("Valid brakets");
		} else {
			System.out.println("Not Valid");
		}
	}

	private static boolean checkValid(String d) {
		
		if(d==null || d.length()==0) {
			return true;
		}
		if(d.length()%2!=0) {
			return false;
		}
		Stack<Character> st =new Stack<>();
		for(char c:d.toCharArray()) {
			if(c=='(' || c=='{' || c=='[') {
				st.push(c);
			}else {
				if(st.isEmpty()) {
					return false;
				}
				char top=st.pop();
				if((c==')' && top!='(') ||
						(c=='}' && top!='{') ||
						(c==']' && top!='[')) {
					return false;
				}
			}
			
		}
		return st.isEmpty();
	}

}
