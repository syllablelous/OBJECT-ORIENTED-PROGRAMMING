//Demonstration of Subtyping

public class VehicleSubtyping {
	public static void main(String[] args) {
		
		/* Subtyping deals with types, wherein one type can be considered as a subtype if it inherits the properties 
		 * from a supertype and follows an "is a" style of relationship with the supertype.
		 * In this example, Vehicle, Car, Plane, and Boat are the types. Vehicle is the supertype while 
		 * Car, Plane, and Boat are its subtypes. They all share a common behavior which is to stop so we can consider that
		 * Car, Plane, and Boat is a kind of Vehicle.
		 */
		
		Vehicle v1 = new Car();
		Vehicle v2 = new Plane();
		Vehicle v3 = new Boat();
		
		v1.stop(); //Outputs stopping car
		v2.stop(); //Outputs stopping plane
		v3.stop(); //Outputs stopping boat
		
		//This still works because it follows the "is-a" relationship.
		Car c1 = new ToyotaVIOS();
		Plane p1 = new U2SpyPlane();
		Boat b1 = new FandangoYacht();
		
		c1.drive();
		p1.fly();
		b1._float();
		

	}
}
