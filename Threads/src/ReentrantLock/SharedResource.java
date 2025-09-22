package ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {
	boolean isAvailable =false;
	
	public void producer(ReentrantLock lock) {
		try {
			lock.lock();
			System.out.println("Lock Aquired by :"+Thread.currentThread().getName());
			isAvailable=true;
			Thread.sleep(4000);
		}catch (Exception e) {
			// TODO: handle exception
		}finally {
			lock.unlock();
			System.out.println("Lock released by :"+Thread.currentThread().getName());
		}
		
	}

}
