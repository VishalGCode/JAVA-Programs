package demoexception;

public class Demothrow {
	void m1()
	{
		System.out.println("from m1");
		try
		{
			m2(); // calling m2
		}
		catch(ArithmeticException ae1)
		{
			System.out.println("Exception caught in m1");
			System.out.println("Name of Exception : " + ae1);
		}
	}
	void m2() throws ArithmeticException
	{
		System.out.println("from m2");
		try
		{
			int c=10/0;
			System.out.println("This will not be printed");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Exception caught in m2");
			throw ae;
		}
		System.out.println("M2 Continues");
		
	}
	public static void main(String args[])
	{
		Demothrow dthrow=new Demothrow();
		dthrow.m1();
	}

}
