package Practice;

class Main {
	public static void main(String[] args) {
		MonitoredLocks ml = new MonitoredLocks();
		Thread t1 = new Thread(() -> {
			ml.task1();
		});
		Thread t2 = new Thread(() -> {
			ml.task02();
		});
		Thread t3 = new Thread(() -> {
			ml.task03();
		});
		
		t1.start();
		t2.start();
		t3.start();

	}
}
