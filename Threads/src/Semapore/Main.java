package Semapore;

public class Main {

	public static void main(String[] args) {
		//Semapore lock with example
		SemaphoreResource resource=new SemaphoreResource();
		
		Thread t1=new Thread(()->{
			resource.producer();
		});
		
		Thread t2=new Thread(()->{
			resource.producer();
		});
		
		t1.start();
		t2.start();
	}
}
