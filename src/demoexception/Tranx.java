package demoexception;

public class Tranx {
	public static void main(String[] args)
	{// String[] args-  array of strings
		Banking b1=new Banking();
		b1.credit(5000);
		try
		{
			b1.debit(15000);
		}
		catch(InsufficientBalanceException e)
		{
			e.printStackTrace();
			System.out.println(e);
		}
		
	}

}