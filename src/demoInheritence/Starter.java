package demoInheritence;

public class Starter {
	public static void main(String[] args)
	{
//		Car c1=new Car();
//		// new keyword is used to allocate memory inside heap.
//		// initial value of all the states is 0.
//		c1.noWheels=4;
//		c1.capacity=7;
//		c1.speed=240;
//		// Values are reinitialized and printed.
//		System.out.println("Values for Car");
//		System.out.println(c1.noWheels);
//		System.out.println(c1.capacity);
//		System.out.println(c1.speed);
//		Bike b1=new Bike();
//		//  constructor is only used to initialize members.
//		b1.noWheels=2;
//		b1.capacity=2;
//		b1.speed=140;
//		System.out.println("Values for Bike");
//		System.out.println(b1.noWheels);
//		System.out.println(b1.capacity);
//		System.out.println(b1.speed);
//		RacingCar rc1= new RacingCar(); // using void init();
//		rc1.init();// user cannot provide its own value, only call it.
//		rc1.prn();// to print the values
		RacingCar rc2= new RacingCar(4,240,4);
		rc2.prn();// to print the values
		
	}

}
