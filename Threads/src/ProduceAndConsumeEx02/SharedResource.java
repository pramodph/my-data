package ProduceAndConsumeEx02;

import java.util.LinkedList;
import java.util.Queue;

public class SharedResource {
	private Queue<Integer> sharedBuffer;
	private int bufferSize;
	public SharedResource(int bufferSize) {
		sharedBuffer = new LinkedList<>();
		this.bufferSize = bufferSize;
	}
	
	public synchronized void produce(int item) throws Exception{
		//if buffer is full,wait for the consumer to consume item.
		
		while(sharedBuffer.size()==bufferSize) {
			System.out.println("Buffer is full,prooducer is waiting for consumer");
			wait();
		}
		sharedBuffer.add(item);
		System.out.println("Produced: "+item);
		//Notify the consumer that thhr are itmes to consume now.
		notify();
	}

	public synchronized int consume() throws Exception{
		//buffer is empty,wait for the producer to produce items
		while(sharedBuffer.isEmpty()) {
			System.out.println("Buffer is empty,consumer is waiting for the producer");
			wait();
		}
		int item=sharedBuffer.poll();
		System.out.println("Consumed: "+item);
		//Notify the producer that ther is spcae int the buffer now
		notify();
		return item;
	}
}
