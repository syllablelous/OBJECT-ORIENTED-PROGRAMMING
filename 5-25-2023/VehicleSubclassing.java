//Demonstration of Subclassing

public class VehicleSubclassing {
	public static void main(String[] args) {
		
		ToyotaVIOS tv = new ToyotaVIOS();
		U2SpyPlane sp = new U2SpyPlane();
		FandangoYacht fy = new FandangoYacht();
		
		/* The ToyotaVIOS class is the subclass and the Car class acts as the superclass. ToyotaVIOS inherits properties 
		 * from both the Car class and the Vehicle class (which the Car class is inheriting from), and overrides the method 
		 * drive() from the Car class. In the Car class, it overrides the stop method inherited from the Vehicle class and 
		 * Toyota-VIOS inherits that since it is a subclass of the Car class.
		 */
		tv.color = "Gray";
		tv.price = 886000;
		tv.speed = 200;
		tv.tireType = "Performance";
		tv.drive(); //Outputs Driving Toyota-VIOS...
		tv.stop(); //Outputs Stopping car...
		
		
		/* Plane class acts as the superclass and U2SpyPlane class as the subclass. Like in the previous example, the object 
		 * of the U2SpyPlane class inherits properties from the Plane and Vehicle class and overrides the method fly() from 
		 * the Plane class.
		 */
		sp.color = "Black";
		sp.price = 1000000;
		sp.speed = 805;
		sp.wingsSpan = 31;
		
		sp.fly(); //Outputs Flying U-2 Spy Plane...
		sp.stop(); //Outputs Stopping plane...

		/* Boat class is the superclass and FandangoYacht is the subclass. FandangoYacht inherits properties and the overriden
		 * method stop() from Boat class, and in turn also overrides the _float() method from Boat.
		 */
		fy.color = "White";
		fy.price = 3500000;
		fy.speed = 18;
		fy.mainSailColor = "Beige";
		
		fy._float(); //Outputs Fandango Yacht floats...
		fy.stop(); //Outputs Stopping boat...
		
		
	}
}
