public class FullTimeEmployee extends Employee
{
	public FullTimeEmployee(int employeeId, String employeeName, int employeeAge,double employeeIncome)
	{
		super(employeeId,employeeName,employeeAge,employeeIncome);
		System.out.println("Start of FullTimeEmployee constructor");
		System.out.println("End of FullTimeEmployee constructor");

	}
	public boolean m2(boolean m)
	{
		System.out.println("Start of m2()method of FullTime Employee");
		System.out.println("The value of m is "+m);
		System.out.println("End of m2()method of FullTime Employee");
		return m;
	}
}