import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
		
		Optional<String> name = Optional.empty();
		try {
			System.out.println(name.orElse("Default Value"));
			name.ifPresent(System.out:: println);
		} catch (Exception e) {
			System.out.println("No value present");
		}
	}

}
