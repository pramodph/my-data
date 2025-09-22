package singelton.design.pattern;

public class EagerSingleton {
	private static final EagerSingleton instance = new EagerSingleton();
	
	private EagerSingleton() {
		// private constructor to prevent instantiation
	}
	// static method to provide access to the instance
	public static EagerSingleton getInstance() {
		return instance;
	}

	public static void main(String[] args) {
		EagerSingleton singleton1 = EagerSingleton.getInstance();
		EagerSingleton singleton2 = EagerSingleton.getInstance();

		System.out.println("Hashcode of singleton1: " + singleton1.hashCode());
		System.out.println("Hashcode of singleton2: " + singleton2.hashCode());

		if (singleton1 == singleton2) {
			System.out.println("Both instances are the same.");
		} else {
			System.out.println("Instances are different.");
		}
	}

}
