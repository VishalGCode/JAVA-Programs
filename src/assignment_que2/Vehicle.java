package assignment_que2;

public abstract class Vehicle {
	//Most generalized class (abstract)
    abstract void start();
    abstract void stop();
    abstract void fuelType();
    abstract void capacity();
    abstract void maxSpeed();

    public void displayType() {
        System.out.println("This is a vehicle.");
    }
}

