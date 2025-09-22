package ProduceAndConsumeEx02;

public class Main {

	public static void main(String[] args) {
		SharedResource sharedBuffer =new SharedResource(3);
		//creating producer Thread using lambda
		Thread producerThread=new Thread(()->{
			for(int i=1;i<=6;i++) {
				try {
					sharedBuffer.produce(i);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		//creating producer Thread using lambda
		Thread consumerThread=new Thread(()->{
			for(int i=1;i<=6;i++) {
				try {
					sharedBuffer.consume();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		producerThread.start();
		consumerThread.start();
	}

}
