public class Employee
{
    private String employeeId;
	private String employeeName;
	private double employeeIncome;

	public Employee()
	{
        System.out.println("Start of Employee constructor");
        System.out.println("End of Employee constructor");
	}
	public void setEmployeeId(String employeeId)
	{
		this.employeeId = employeeId;
	}
	public String getEmployeeId()
	{
		return employeeId;
	}
	public void setEmployeeName(String employeeName)
	{
		this.employeeName = employeeName;
	}
	public String getEmployeeName()
	{
		return employeeName;
	}
	public void setEmployeeIncome(double employeeIncome)
	{
		this.employeeIncome = employeeIncome;
	}
	public double getEmployeeIncome()
	{
		return employeeIncome;
	}
	
}