
public class Boat extends Vehicle{
	String mainSailColor;
	
	public void _float() {
		System.out.println("Boat floats...");
	}

	@Override
	public void stop() {
		System.out.println("Stopping boat...");
	}
}
