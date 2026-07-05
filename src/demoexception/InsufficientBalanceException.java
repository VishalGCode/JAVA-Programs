package demoexception;

public class InsufficientBalanceException extends RuntimeException{
	// Checked exception since it extends Exception
	// now unchecked since it extends RuntimeException- so handling is not mandatory.
	public InsufficientBalanceException (String s)
	{
		System.out.println("Exception is :" + s);
	}
	

}
