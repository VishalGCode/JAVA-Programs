package abstractDemo;

public abstract class DemoAbstraction {
	// can only set visibility as public, protected, default
	int var1=66, var2=98;
	abstract public void add();
	// if we're not providing implementation of method, we can mark the given
	// create method as abstract method, using abstract keyword.
	// if the class contains atleast one abstract method, then the class is abstract too.
	abstract public void sub();
	public void mul() {
		System.out.println("From mul()");
	}
//	abstract protected abcd()
//	{
//		// Can be Made 
//	}
	public void div() {
		System.out.println("From div()");
	}
	//  1 abstract method, so 25% abstraction.
	private void abc() {
		//The method abc() from the type DemoAbstraction is never used locally
		
	}

}
// Visibility specifier and abstract keyword can change their position wrt each other..
/* abstract public void
public abstract void
Same haii.. */


// Abstract is incomplete, it refers to hiding details, since we haven't created the body,
// hence we can't use it or instantiate it.


// abstraction in methods can be 0% meanwhile class can remain abstract/
// In abstract class, we can achieve 0 to 100% abstraction.

//What is to be done, rather than how is to be done.