package threadDemo;

/*				//Method1- Extends
 * public class MyThread extends Thread {
 * MyThread is a thread- start() is frim thread, which will in turn calls run().
	public void run(){
		System.out.println("MyThread running ");
		// here, we''re overriding 
		// if we don't write this, code still works.
	}
	public static void main(String arg[]){
		MyThread mt = new MyThread();
		mt.start(); //it eventually calls run method
		// mt.run(); // run method of thread class
		
	}
}
*/
/* 				//Method 2-Implements
public class MyThread implements Runnable
{

	@Override
	public void run() {
		System.out.println("MyThread running ");
		
	}
	public static void main(String arg[]){
		MyThread mt = new MyThread();
		mt.run();
	}
	
}
*/
// Method 3
public class MyThread implements Runnable
{

	@Override
	public void run() {
		System.out.println("MyThread running ");
		
	}
	public static void main(String arg[]){
		MyThread mt = new MyThread(); //our object, object of MyThread: is a kind of Runnable
		Thread t1=new Thread(mt); // Thread object, which is a Thread: we passed our object to this
		t1.start(); // now, this thread works.
		
	} // ip+port=socket			
}
