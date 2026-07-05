package demoexception;

public class Self_example {
	void m1()
	{
		m2();
	}
	void m2()
	{
		m3();
	}
	void m3()
	{
		return 5/0;
	}
	public static void main(String args[])
	{
		m1();
	}

}
