package dependencyInversionPrinciple.clients;

import dependencyInversionPrinciple.processes.GeneralManufacturingProcess;
import dependencyInversionPrinciple.processes.MobileManufactoringProcess;

public class DeviceFactory {
	
	public static void main(String[] args) {
		GeneralManufacturingProcess manfacturer = new MobileManufactoringProcess("Iphone");
		manfacturer.launchProcess();
	}
}
