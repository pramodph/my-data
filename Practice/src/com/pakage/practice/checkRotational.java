package com.pakage.practice;

public class checkRotational {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "ABCD";
		String str2 = "CDAB";
		
		if (isRotational(str1, str2)) {
			System.out.println("Yes, the second string is a rotation of the first.");
		} else {
			System.out.println("No, the second string is not a rotation of the first.");
		}
	}

	private static boolean isRotational(String str1, String str2) {
		if(str1.length()!=str2.length())
			return false;
		else {
			return (str1+str1).indexOf(str2)!=-1; //(str1+str1).contains(str2)
		}
	}

}
