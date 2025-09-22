package com.pakage.brackets;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class BalancedBracketWithStack {

	public static void main(String[] args) {
		String str="{()[]}";
		System.out.println(isBalancedBraket(str));

	}

	private static boolean isBalancedBraket(String str) {
		//Stack<Character> st=new Stack<>(); --1
		Deque<Character> st=new ArrayDeque<>();
		//stack is the legacy collection and is synchronized hence we can go ahead with Dequeue which will help us to implement 
		//Stack like implementation and is faster compared to stack TP - O(n) and SC- O(n)
		for(char c:str.toCharArray()) {
			if(c=='(' || c=='{' || c=='[') {
				st.push(c);
			}else if(c==')' || c=='}' || c==']') {
				if(st.isEmpty()) return false;
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
