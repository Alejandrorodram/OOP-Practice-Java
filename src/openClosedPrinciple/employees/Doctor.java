package openClosedPrinciple.employees;

public class Doctor extends Employee{

	// 2. We call the actions of each employee into the abstract method
	
	public Doctor(long id, String name, String department, boolean working) {
		super(id, name, department, working);
		System.out.println("Doctor in action...");
	}

	private void prescribeMedicine() {
		System.out.println("Prescribe medicine");
	}
	
	private void diagnosePatients() {
		System.out.println("Diagnosing patient");
	}

	@Override
	public void performDuties() {
		prescribeMedicine();
		diagnosePatients();		
	}	
}
