package abstractDemo;

public class SubDemoAbstract extends DemoAbstraction{
	
	// keywords-- abstract concrete, abstract method, conrete method
	// abstract class, 0-100% abstraction, hiding details of the base class
	// what is to be done rather than how is to be done..
	// concept of abstract class is implemented using inheritence.

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("From add()");
		
	}

	@Override // annotation
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println("From sub()");
		// derived class cannot reduce the visibility of base class..
		// pvt-> public possible, but public->pvt not possible
		
	}
	// this will provide body to abstract methods, or it should declare itself abstract too.
	// e.g., abstract public class SubDemoAbstract extends DemoAbstraction{
	// the derived class should override the unimplemented(abstract) methods of
	// base class or it should declare itself as abstract
	
	
	// ishi se nikl k aayega interface.
	
	

}
