package Examples;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employeee {
	
	String name;
	String gender;
	int age;

	public Employeee(String name, String gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}

}

public class CountGender {

	public static void main(String[] args) {
		List<Employeee> employees = Arrays.asList(
				new Employeee("Raj", "Male", 25), 
				new Employeee("Sham", "Male", 26),
				new Employeee("Harika", "Female", 27), 
				new Employeee("Bindu", "Female", 28),
				new Employeee("Lalita", "Female", 29), 
				new Employeee("Praj", "Male", 30));
		
		//count of male and female employees
		Map<String, Long> genderCount = employees.stream()
				.collect(Collectors.groupingBy(Employeee::getGender, Collectors.counting()));
		System.out.println(genderCount);
	}
}
