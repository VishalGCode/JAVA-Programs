package defaultDemo;

interface I1
{
	default void m1() // methods are public by default and we can't reduce the visibility.
	{
		System.out.println("From Interface I1");
	}
	void m2();
}
interface I2
{
	default void m1()
	{
		System.out.println("From Interface I2");
	}
	void m2();// if it takes 1 argument and m2() in I1 doesn't take argument then it will be the case of overriding.
}

//public class DefaultImplementation implements I2{
//	// we have to provide the concrete implementation of m2
//
//}

public class DefaultImplementation implements I1,I2{
	// we have to provide the concrete implementation of m2
	public void m2()
	{
		System.out.println("From m2");
	}
	@Override 
	public void m1()
	{
		I1.super.m1();
		I2.super.m1();
		System.out.println("From class");
		
	}


public static void main (String [] args)
{
	DefaultImplementation dfi=new DefaultImplementation();
	dfi.m2();
	dfi.m1();
}
}
// implementing two interfaces,
// overrides common concrete method
// calling super
