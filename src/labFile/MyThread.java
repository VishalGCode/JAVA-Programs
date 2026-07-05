package labFile;

//Custom thread class
public class MyThread extends Thread {
	
	/*Lab Experiment: 5
	Name- Rishi Tiwari
	Roll No- 2301641720090
	*/
String message;

MyThread(String msg) {
   this.message = msg;
}

@Override
public void run() {
   // Print the message 5 times
   for (int i = 1; i <= 5; i++) {
       System.out.println(message + " - message " + i);
       try {
           Thread.sleep(500); // pause for half a second
       } catch (InterruptedException e) {
           System.out.println(message + " interrupted.");
       }
   }
}
}
