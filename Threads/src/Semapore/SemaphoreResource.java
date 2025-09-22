package Semapore;

public class SemaphoreResource {

	public void producer() {
		
		System.out.println("Producer method called by :"+Thread.currentThread().getName());
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Producer method finished by :"+Thread.currentThread().getName());		
	}
	
}
