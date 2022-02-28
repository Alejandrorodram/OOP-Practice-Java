package clients;

import processes.GeneralManufacturingProcess;
import processes.MobileManufactoringProcess;

public class DeviceFactory {
	
	public static void main(String[] args) {
		GeneralManufacturingProcess manfacturer = new MobileManufactoringProcess("Iphone");
		manfacturer.launchProcess();
	}
}
