
public class Employee {
	private int employeeId;
	private String employeeName;
	private double employeeSalary;
	private static String companyName="Deloitte";
	public static String getCompanyName()
	{
		return companyName;
	}
	public double calculateBonus()
	{
		double bonus=10.0;
		return employeeSalary*bonus;
	}
	public Employee(int employeeId, String employeeName, double employeeSalary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}
	public Employee() {
		System.out.println("Defualt value called");
		this.employeeId=123;
		this.employeeName="ibin";
		this.employeeSalary=200;
	}
}

