package openClosedPrinciple.employees;

public abstract class Employee {
	
	// 1. We put Employee class abstract and add performDuties method
	
	private long id;
	private String name;
	private String department;
	private boolean working;
	
	public Employee(long id, String name, String department, boolean working) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.working = working;
	}
	
	public abstract void performDuties();

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", working=" + working + "]";
	}
	
	
}
