public class Employee
{
	public String employeeName;
	public int employeeId;
	public double employeeIncome;

	public Employee(String employeeName,int employeeId ,double employeeIncome)
	{
       this.employeeName   = employeeName;
       this.employeeId     = employeeId;
       this.employeeIncome = employeeIncome;
	}
	@Override
	public String toString()
	{
		return " Employee name is = "+employeeName + " Employee Id = "+employeeId + " employeeIncome = "+employeeIncome;
	}
}//close of Employee class