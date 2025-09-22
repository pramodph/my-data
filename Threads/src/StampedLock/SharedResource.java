package StampedLock;

import java.util.concurrent.locks.StampedLock;

public class SharedResource {
	boolean isAvailable=false;
	StampedLock lock=new StampedLock();
	
	public void producer() {
		long stamp=lock.readLock();
		try {
			System.out.println("Read lock aquired by :"+Thread.currentThread().getName());
			isAvailable=true;
			Thread.sleep(6000);
		}catch(Exception e) {
			
		}finally {
			lock.unlockRead(stamp);
			System.out.println("Read lock released by "+ Thread.currentThread().getName());
		}
	}
	
	public void consume() {
		long stamp= lock.writeLock();
		try {
			System.out.println("write lock aquired by :"+Thread.currentThread().getName());
			isAvailable=false;
		}
		catch(Exception e) {
			
		}finally {
			lock.unlockWrite(stamp);
			System.out.println("write lock released by "+Thread.currentThread().getName());
		}
	}

}
