package ReadWriteLock;

import java.util.concurrent.locks.ReadWriteLock;

public class SharedResource {
	boolean isAvailable = false;
	
	public void Producer(ReadWriteLock lock) {
		lock.readLock().lock();
		System.out.println("Read lock aquired by : "+Thread.currentThread().getName());
		
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			lock.readLock().unlock();
			System.out.println("Read lock released by :"+Thread.currentThread().getName());
		}
	}
	
	public void Consumer(ReadWriteLock lock) {
		try {
			lock.writeLock().lock();
			System.out.println("Write lock aquired by : "+Thread.currentThread().getName());
			isAvailable=false;
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			lock.writeLock().unlock();
			System.out.println("Write lock released by :"+Thread.currentThread().getName());
		}
	
	}

}
