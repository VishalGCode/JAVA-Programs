package threadDemo;

//public class DemoThreadGroup implements Runnable{
//	public void run(){
//		System.out.println(Thread.currentThread().getName());
//	}
//public static void main(String[]args){
//	DemoThreadGroup MyRunnable=new DemoThreadGroup();
//	ThreadGroup tg1=new ThreadGroup("Group A");
//	Thread t1=new Thread(tg1,MyRunnable,"1");
//	t1.start();
//	Thread t2=new Thread(tg1,MyRunnable,"2");
//	t2.start();
//	Thread t3=new Thread(tg1,MyRunnable,"3");
//	t3.start();
//	System.out.println("ThreadGroupName:"+tg1.getName());
//	tg1.list();// tells members along with priority
//}
//}

/*
1 // from run
2 // from run
3 // from run
ThreadGroupName:Group A
java.lang.ThreadGroup[name=Group A,maxpri=10] from tg1.list();
*/



//modification: 2
//
//public class DemoThreadGroup implements Runnable{
//	public void run(){
//		System.out.println(Thread.currentThread().getName()+
//				Thread.currentThread().getPriority());
//	}
//public static void main(String[]args){
//	DemoThreadGroup MyRunnable=new DemoThreadGroup();
//	ThreadGroup tg1=new ThreadGroup("Group A");
//	Thread t1=new Thread(tg1,MyRunnable,"1");
//	Thread t2=new Thread(tg1,MyRunnable,"2");
//	Thread t3=new Thread(tg1,MyRunnable,"3");
//	t2.start();
//	t1.start();
//	t3.start();
//	// threads run differently on how it gets CPU cycles. so o/p may vary
//	//o/p is changed because it is thread and running on basis of Cpu cycle it gets.
//	System.out.println("ThreadGroupName:"+tg1.getName());
//	tg1.list();// tells members along with priority
//}
//}


 
//modification: 3

public class DemoThreadGroup implements Runnable{
	public void run(){
		System.out.println(Thread.currentThread().getName()+
				Thread.currentThread().getPriority());
	}
public static void main(String[]args){
	DemoThreadGroup MyRunnable=new DemoThreadGroup();
	ThreadGroup tg1=new ThreadGroup("Group A");
	Thread t1=new Thread(tg1,MyRunnable,"1");
	Thread t2=new Thread(tg1,MyRunnable,"2");
	Thread t3=new Thread(tg1,MyRunnable,"3");
	t2.start();
	t1.start();
	t3.start();
	Thread.currentThread().setPriority(Thread.NORM_PRIORITY);
	// threads run differently on how it gets CPU cycles. so o/p may vary
	//o/p is changed because it is thread and running on basis of Cpu cycle it gets.
	System.out.println("ThreadGroupName:"+tg1.getName());
	System.out.println("About : "+Thread.currentThread().getName());
	tg1.list();// tells members along with priority
}
}