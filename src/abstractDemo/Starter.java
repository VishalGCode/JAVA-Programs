package abstractDemo;

public class Starter {
	public static void main(String [] args)
	{
		// DemoAbstraction da=new DemoAbstraction();
		// we can't create instantiation of abstract class...
		// we can define type of variable as DemoAbstraction but can't instantiate it.
		
		// after doing override of abstract class, now we can instantiate it.
		SubDemoAbstract da =new SubDemoAbstract();
		da.add();
		da.sub();
		da.mul();
		da.div();
		System.out.println(da.var1); // var1 from base class;
		//constructor is used to initialize
		DemoAbstraction da1=new SubDemoAbstract();
		da1.div();
		// If we instantiate but don't use, it will show warning.
		// obj of DemoAbstraction, costructor of SubDemoAbstract.
	}

}
/* A class that doesn't have any abstract method still can be marked as abstract
just to prevent instantiation of the class */
