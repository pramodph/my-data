import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class LastNameFrequency {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("Smith Roy", "Johnson dada", "Williams Roy", "Jones Roy");
		Map<String,Long> Result=new LinkedHashMap<>();
		for(int i=0;i<names.size();i++) {
			String lastName=names.get(i).split(" ")[1];
			if(Result.containsKey(lastName)) {
				Result.put(lastName, Result.get(lastName)+1);
			} else {
				Result.put(lastName, 1L);
			}
		}
		System.out.println("Last Name Frequency: " + Result);
	}

}
