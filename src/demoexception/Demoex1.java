package demoexception;
// this line tells that the given code belongs to which package.

public class Demoex1 {
	public void m1()
	{
		System.out.println("From m1");
	}
	public void m2(int a, int b)
	{
		int arr[]=new int [3];
		System.out.println("From m2");
		try // a try can have multiple catch but only one catch block is triggered at a time 
			// by catching only one exception at a time.
		{
			arr[4]=a/b;
			int c=a/b;
			System.out.println("Value of c : " + c);
			arr[4]='c';
		}
		/*
		 * catch(ArithmeticException | ArrayIndexOutOfBoundsException ee)------ multiple in same line
		{
			System.out.println(ee);
		}
		*/
		
		catch( ArithmeticException ae)
		{
			System.out.println(ae);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("From finally");
			
		}
// for any type of exception-- if present, directly gets the error as its supreme among given
		
		System.out.println("Finished");
	}
	public static void main(String[] args)
	{
		Demoex1 dex=new Demoex1();
		dex.m1();
		dex.m2(10,0);
	}

}
