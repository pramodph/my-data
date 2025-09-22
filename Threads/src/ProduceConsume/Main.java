package ProduceConsume;

public class Main {

	public static void main(String[] args) {
		SharedResource sharedResourceObj =new SharedResource();
		
		Thread producerThread =new Thread(()->{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			sharedResourceObj.addItem();
		});
		
		
		Thread ConsumerThread =new Thread(()->{
			sharedResourceObj.consumeItem();
		});
		
		producerThread.start();
		ConsumerThread.start();
		
	}

}
