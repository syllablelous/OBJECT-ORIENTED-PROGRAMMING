
public class Plane extends Vehicle{
	int wingsSpan;
	
	public void fly() {
		System.out.println("Flying plane...");
	}
	
	@Override
	public void stop() {
		System.out.println("Stopping plane...");
	}
}
