public class PartTimeEmployee extends Employee
{
	public PartTimeEmployee(int employeeId, String employeeName, int employeeAge,double employeeIncome)
	{
		super(employeeId,employeeName,employeeAge,employeeIncome);
		System.out.println("Start of PartTimeEmployee constructor");
		System.out.println("End of  PartTimeEmployee constructor");
	}
}