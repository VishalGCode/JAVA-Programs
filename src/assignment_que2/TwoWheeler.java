package assignment_que2;

public abstract class TwoWheeler extends LandVehicle {
	//woWheeler – Inherits LandVehicle
    @Override
    public void stop() {
        System.out.println("Two-wheeler stopped using disc brakes.");
    }
}
