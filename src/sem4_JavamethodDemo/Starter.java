package sem4_JavamethodDemo;

public class Starter {
	public static void main(String a[])
	{
		MethodTypeDemo mtd1= new MethodTypeDemo();
		MethodTypeDemo1 mtd2= new MethodTypeDemo1();
		mtd2.MethodCallV(15, 10);
		mtd2.MethodCallR(mtd1);
	}

}
