package DemoStopResumeSuspend;

public class SharedResource {
	public boolean isAvailable;
	
	public synchronized void produce() {
		System.out.println("Lock Aquired by -->"+Thread.currentThread().getName());
		isAvailable=true;
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Lock Release -->"+Thread.currentThread().getName());
	}

}
