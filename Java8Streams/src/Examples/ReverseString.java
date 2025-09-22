package Examples;

public class ReverseString {

	public static void main(String[] args) {
		// using normal way
		String str = "Hello World";
		char[] charArray = str.toCharArray();
		for(int i = charArray.length - 1; i >= 0; i--) {
			System.out.print(charArray[i]);
		}

		System.out.println();
		
		// using in built function
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb.reverse());
		
		// using recursion
		System.out.println(reverseString(str));
		
	}

	private static String reverseString(String str) {
		System.out.println(str.isEmpty() ? str : reverseString(str.substring(1)) + str.charAt(0));
		return str.isEmpty() ? str : reverseString(str.substring(1)) + str.charAt(0);

	}

}
