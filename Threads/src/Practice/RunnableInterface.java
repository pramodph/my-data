package Practice;

public class RunnableInterface implements Runnable{

	@Override
	public void run() {
		System.out.println("This is the Run method -"+Thread.currentThread().getName());
	}
	
	
}