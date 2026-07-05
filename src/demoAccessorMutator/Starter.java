package demoAccessorMutator;

public class Starter {
	public static void main(String[] args) {
		AccMutDemo amd=new AccMutDemo();
		amd.add(10,20);
		System.out.println(amd.sum);
	//a b and sum r default visible to starter
		
		amd.a=10;
		amd.b=20;
		amd.sum=amd.a+amd.b;
		System.out.println(amd.sum);
	//
	}
	
}