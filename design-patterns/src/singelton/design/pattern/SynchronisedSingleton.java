package singelton.design.pattern;

public class SynchronisedSingleton {

	private static SynchronisedSingleton instance;
	
	private SynchronisedSingleton() {
		// private constructor to prevent instantiation
	}
	
	// static method to provide access to the instance
	public static synchronized SynchronisedSingleton getInstance() {
		if (instance == null) {
			instance = new SynchronisedSingleton();
		}
		return instance;
	}
	public static void main(String[] args) {
		SynchronisedSingleton singleton1 = SynchronisedSingleton.getInstance();
		SynchronisedSingleton singleton2 = SynchronisedSingleton.getInstance();

		System.out.println("Hashcode of singleton1: " + singleton1.hashCode());
		System.out.println("Hashcode of singleton2: " + singleton2.hashCode());

		if (singleton1 == singleton2) {
			System.out.println("Both instances are the same.");
		} else {
			System.out.println("Instances are different.");
		}
	}

}
