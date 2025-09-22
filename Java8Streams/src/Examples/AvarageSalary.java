package Examples;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
	
	int id;
	String name;
	Long salary;
	String role;
	int age;
	String gender;
	
	public Employee(int i, String name, long j, String role, int age, String gender) {
		super();
		this.id = i;
		this.name = name;
		this.salary = j;
		this.role = role;
		this.age = age;
		this.gender = gender;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
}

public class AvarageSalary {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
				new Employee(1,"john",15000,"java dev",30,"M"),
				new Employee(2,"john1",18000,"java dev",30,"F"),
				new Employee(3,"john2",20000,"java dev",30,"M"),
				new Employee(4,"john3",25000,"java dev",30,"M"));
		//Average salary of all employees
		double averageSalary = employees.stream().mapToLong(e->e.getSalary()).average().orElse(0);
		System.out.println("Average Salary of all employees: " + averageSalary);
		
		///sum of salary
		long totalSalary = employees.stream().mapToLong(e->e.getSalary()).sum();
		System.out.println("Total Salary of all employees: " + totalSalary);		
		
		
		//Count of male and female employees
		Map<String,Long> genderCount = employees.stream()
				.collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		System.out.println("Count of male and female is "+ genderCount);
	}

}
