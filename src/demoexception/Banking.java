package demoexception;

public class Banking {
	int bal=5000;
	void debit(int amt) throws InsufficientBalanceException
	{
		if (bal<amt)
		{
			throw new InsufficientBalanceException ("Less Balance");
			// mandatory to add throws with the method signature
		}
		else
		{
			bal=bal-amt;
		}
		
	}
	void credit(int amt)
	{
		bal=bal+amt;
		
	}

}
