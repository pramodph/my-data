package multiThreadingDemos;

class ExThread01 extends Thread{
	Display d;
	String name;
	public ExThread01(Display d, String name) {
		this.d = d;
		this.name = name;
	}
	
	public void run() {
		d.display(name);
	}
	
	
}

class ExThread02 extends Thread{
	Display d;
	String name;
	public ExThread02(Display d, String name) {
		this.d = d;
		this.name = name;
	}
	
	public void run() {
		d.display1();
	}
}

class Display{
	public synchronized void display(String name) {
		for(int i=0;i<=10;i++) {
			System.out.println(i);
			System.out.println("Good Morning "+name);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public synchronized void display1() {
		for(char ch='A';ch<='K';ch++) {
			System.out.println(ch);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class Demo06 {

	public static void main(String[] args) {
		Display d=new Display();
		ExThread01 t1=new ExThread01(d,"Dhoni");
		ExThread02 t2=new ExThread02(d,"Virat");
		t1.start();
		t2.start();
	}

}
