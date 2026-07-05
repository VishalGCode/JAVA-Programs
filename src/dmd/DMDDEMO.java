package dmd;

public class DMDDEMO {
	public static void main(String [] arge)
	{
//		Base b1=new Base();
//		b1.add();
		// int a; means it can store integer type of token.
		Derived d1=new Derived();
		System.out.println(d1.var1);
		System.out.println(d1.var2);
		d1.add();
		// when we call state from same obj, values of base will be printed.
		// when we call methods(Behaviour), value of derived will be taken.
//		Derived b1=new Base();  --- Not Possible ---
		// Base b2; means b2 can hold base type of object.
		// Derived d2; it can hold derived type of object.
		// reference of base class can hold any derived reference.
		//Derived d11=(Derived) new Base();
		//ClassCastException at runtime, because a Base object is not actually a Derived object.
		// Possible by type Casting... Explicit (DOWN CASTING).
		
		
		
	}

}
