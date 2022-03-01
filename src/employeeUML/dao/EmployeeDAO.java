package employeeUML.dao;

import employeeUML.clients.Employee;
import employeeUML.database.DatabaseConnectionManager;

public class EmployeeDAO {
	
	DatabaseConnectionManager connectionManager = new DatabaseConnectionManager();
	
	public void saveEmployee(Employee employee) {
		System.out.println("Saved employee to the database: " + employee);
	}
	
	public void deleteEmployee(Employee employee) {
		System.out.println("Deleted employee from the database: " + employee);
		
	}

}
