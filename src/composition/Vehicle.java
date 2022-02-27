package composition;

public class Vehicle {
	
	Engine myEngine;
	
	public Vehicle(Engine anEngine) {
		myEngine = anEngine;
	}
	
	public void operateVehicle() {
		myEngine.start();
	}
}
