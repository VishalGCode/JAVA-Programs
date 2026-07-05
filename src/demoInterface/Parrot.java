package demoInterface;

public class Parrot extends Bird implements flyingObject{
	int a=12;
	public void fly()
	{
		System.out.println(this.+"I can Fly");
	}
	

}
