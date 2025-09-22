package singelton.design.pattern;

public class LazySingleton {

	private static LazySingleton instance;

	private LazySingleton() {
		// private constructor to prevent instantiation
	}
	
	// static method to provide access to the instance
	public static LazySingleton getInstance() {
		if (instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}
	
	public static void main(String[] args) {
		LazySingleton singleton1 = LazySingleton.getInstance();
		LazySingleton singleton2 = LazySingleton.getInstance();

		System.out.println("Hashcode of singleton1: " + singleton1.hashCode());
		System.out.println("Hashcode of singleton2: " + singleton2.hashCode());

		if (singleton1 == singleton2) {
			System.out.println("Both instances are the same.");
		} else {
			System.out.println("Instances are different.");
		}
	}

}
