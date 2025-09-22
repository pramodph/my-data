package Practice;

public class MonitoredLocks{

	public synchronized void task1() {
		try {
			System.out.println("Inside Task 1");
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void task02() {
		System.out.println("Before Inside Task2");
		synchronized (this) {
			System.out.println("After Inside Task2");
		}
	}

	public void task03() {
		System.out.println("Inside Task 3");
	}

}
