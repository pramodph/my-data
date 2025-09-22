package ProduceConsume;

public class SharedResource {
	boolean isItemPresent=false;
	
	public synchronized void addItem() {
		isItemPresent=true;
		System.out.println("Producer Thread isinde addItem");
		notifyAll();
	}

	public synchronized void consumeItem() {
		System.out.println("Consumer Thread isinde ConsumeItem");
		if(!isItemPresent) {
			try {
				System.out.println("Consumer Thread is waiting");
				wait();
			}catch(Exception e) {
				
			}
		}
		isItemPresent=false;
	}
}
