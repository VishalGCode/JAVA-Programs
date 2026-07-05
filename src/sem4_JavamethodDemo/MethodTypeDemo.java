package sem4_JavamethodDemo;

public class MethodTypeDemo {
	int a=4,b=7;
	static int c=4;
	static void printhello()
	{
		System.out.println("Hello World");
	}
	public static void main(String a[])
	{
		printhello();
		System.out.println(c);
		MethodTypeDemo std= new MethodTypeDemo(); // object creation
		System.out.println(std.a); // since object is made, so value is accessible
		
		
	}

}
