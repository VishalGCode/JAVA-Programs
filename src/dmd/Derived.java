package dmd;

public class Derived extends Base  {
	int var1=30;
	int var2=40;
	int sum=0;
	void add()
	{
		sum=var1+var2;
		System.out.println(sum);
	}

}
