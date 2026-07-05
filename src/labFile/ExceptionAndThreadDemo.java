package labFile;

//Exp-5
//Class to demonstrate Exception Handling and Multithreading
public class ExceptionAndThreadDemo {

 public static void main(String[] args) {
     // -------- Exception Handling --------
     try {
         int a = 10;
         int b = 0;
         int result = a / b;  // This will throw ArithmeticException
         System.out.println("Result: " + result);
     } catch (ArithmeticException e) {
         System.out.println("Exception caught: Cannot divide by zero!");
     } finally {
         System.out.println("Finally block executed.");
     }

     // -------- Multithreading --------
     Thread thread1 = new MyThread("Thread 1");
     Thread thread2 = new MyThread("Thread 2");

     thread1.start();
     thread2.start();
 }
}


