package assignment_que2;

public class ElectricScooter extends MotorBike {
	
	//ElectricScooter – Most specialized class
    @Override
    public void capacity() {
        System.out.println("Electric scooter can carry 2 people.");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Max speed is 80 km/h.");
    }

    public void showDetails() {
        displayType();
        start();
        stop();
        fuelType();
        capacity();
        maxSpeed();
    }
}

