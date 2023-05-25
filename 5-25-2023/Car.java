// Subclassing is achieved through the extends keyword, wherein Car is now a subclass of Vehicle, and ToyotaVIOS is a subclass of Car, and so on and so forth.

public class Car extends Vehicle{
	//Inherits the speed, color, and price variables from car.
	String tireType;
	
	public void drive() {
		System.out.println("Driving car...");
	}
	
	//Overrides the inherited method from Vehicle to be adjusted for this class.
	@Override
	public void stop() {
		System.out.println("Stopping car...");
	}
	
}
