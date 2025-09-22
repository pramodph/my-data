import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Optinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Java!!..");
		List<Integer>lst=Arrays.asList(1,0,2,0,3,0,4,0);
		lst.stream();
		List<Integer>lst1=Stream.concat(lst.stream().filter(i->i==0),lst.stream().filter(i->i!=0))
		.collect(Collectors.toList());
		System.out.println(lst1);
	}
}
