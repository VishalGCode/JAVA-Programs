package demoInterface;

public class Starter {
	public static void main(String [] args)
	{
	Parrot p1=new Parrot();
	Kiwi k1=new Kiwi();
	int a=24;
	System.out.println(p1.a);
	System.out.println(p1.nolegs);
	System.out.println(k1.nolegs);
	p1.fly();
	p1.a1();
}
}