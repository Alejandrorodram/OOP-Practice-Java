package composition;

public class App {
	
	public static void main(String[] args) {
		
		Engine engine1 = new Engine();
		Vehicle vehicle1 = new Vehicle(engine1);
		
		vehicle1.operateVehicle();
	}
}
