package processes;

public class MobileManufactoringProcess extends GeneralManufacturingProcess{

	public MobileManufactoringProcess(String name) {
		super(name);
	}

	@Override
	protected void assemblyDevice() {
		System.out.println("Assembled smartphone");		
	}

	@Override
	protected void testDevice() {
		System.out.println("Tested smartphone");	
	}

	@Override
	public void packageDevice() {
		System.out.println("Packaged smartphone");	
	}

	@Override
	public void storeDevice() {
		System.out.println("Stored smartphone");		
	}
}
