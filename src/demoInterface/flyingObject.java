package demoInterface;
// API- Application Programming Interface., used to perform functions of a 3rd party in ours.

public interface flyingObject {
	void fly();
	/*in interface, concrete method can be there but should be 
	marked explicitly using the keyword default. (For DEVELOPERS) */
	int a=9;// by default final- Constant, value can't be changed by def=rived class.
	default void a1() 
	{
		System.out.println("From default method 1");
	}
	default void a2() 
	{
		System.out.println("From default method 2");
	}

}
