package MetodOverloadingDemo;

public class Starter {
	public static void main (String a[])
	{
		MOverloading m1= new MOverloading();
		System.out.println(m1.add(1,5));
		System.out.println(m1.add(5,7));
		System.out.println(m1.add(5,6,7));
		System.out.println(m1.add(3,5.7f));
		// more than 1 method with same name but different parameters 
		// or difference in type of parameters.
		
	}

}
// next- MEthod Ambiguity.