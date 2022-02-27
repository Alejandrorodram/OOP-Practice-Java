package reporting;

import domain.Employee;

public class EmployeeReportFormatter extends ReportFormatter {

	public EmployeeReportFormatter(Employee employee, FormatType format) {
		super(employee, format);
	}

	private Employee anemployee;
	FormatType formatType;

	public String getFormattedEmployee() {
		return getFormattedValue();
	}
}
