class Address implements Cloneable{
	String city;
	Address(String city){
		this.city=city;
	}
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}

class Student implements Cloneable{
	String name;
	Address address;
	
	Student(String name,Address address){
		this.name=name;
		this.address=address;
	}
	
	//Deep copy
//	public Object clone() throws CloneNotSupportedException{
//		Student cloned = (Student) super.clone();
//		cloned.address=(Address) address.clone();
//		return cloned;
//	}
	
	//Shallow copy
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}


public class DeepAndShollow {

	public static void main(String[] args) throws CloneNotSupportedException {
		Address addr=new Address("NewYork");
		Student s1=new Student("Abc",addr);
		
		Student s2=(Student)s1.clone();
		
		System.out.println(s1.address.city); //NewYork
		System.out.println(s2.address.city); //NewYork
		
		s1.address.city="London";
		//only s1 changes and s2 remains independent-deep copy
		System.out.println(s1.address.city); //London -London(shallow)
		System.out.println(s2.address.city); //NewYork -London(shallow)
	}

}
