package processes;

public class LaptopManufactoringProcess extends GeneralManufacturingProcess{

	public LaptopManufactoringProcess(String name) {
		super(name);
	}

	@Override
	protected void assemblyDevice() {
		System.out.println("Assembled laptop");		
	}

	@Override
	protected void testDevice() {
		System.out.println("Tested laptop");		
	}

	@Override
	public void packageDevice() {
		System.out.println("Packaged laptop");		
	}

	@Override
	public void storeDevice() {
		System.out.println("Stored laptop");		
	}
}
