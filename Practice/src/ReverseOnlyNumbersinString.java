
public class ReverseOnlyNumbersinString {

	public static void main(String[] args) {
		String str = "Java is  2016 a programming language 2017";
		String[] words = str.split(" ");
		StringBuilder result = new StringBuilder();
		for (String word : words) {
			StringBuilder reversedWord = new StringBuilder();
			for (char c : word.toCharArray()) {
				if (!Character.isDigit(c)) {
					reversedWord.append(c);
				} else {
					reversedWord.insert(0, c);
				}
			}
			result.append(reversedWord).append(" ");
		}	
		String finalResult = result.toString().trim();
		System.out.println(finalResult);

	}

}
