package multiThreadingDemos;

class MyThread extends Thread {
	//if run () method not overridden then the thread class run methods will be executed which has empty implementation
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Child Thread  "+Thread.currentThread().getName()+"Priority->"+Thread.currentThread().getPriority());
		}
	}
	
	/*public void run(int j) {
		for(int i=0;i<10;i++) {
			System.out.println("Child Thread with args  "+Thread.currentThread().getName());
		}
	}*/
	
	/*@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("start method oveeridden which will be executed just like normal method call");
	}*/
}

public class Demo01 {
	public static void main(String[] args) {
		MyThread t=new MyThread();
		t.start();
		//t.start(); //if we try to start tread again will get illegal thread state Exception
		//t.run() ;//will call the run method with main thread only
		//t.run(5);//just like normal method call we can do t.start() will always execute the no args run methods 
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread "+Thread.currentThread().getName());
		}
	}

}
