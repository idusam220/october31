public class Employee
{
	public int    employeeId;
	public String employeeName;
	public int    employeeAge;
	public double income;

	public Employee(int employeeId, String employeeName, int employeeAge,double employeeIncome)
	{
	    this.employeeId     = employeeId;
	    this.employeeName   = employeeName;
	    this.employeeAge    = employeeAge;
	    this.employeeIncome = employeeIncome;

	}
	public void m1(int i)
     {
         System.out.println("Start of m1()non-static method of Employee class");
         System.out.println("The value of i is : "+i);
         System.out.println("End of m1()non-static method of Employee class");     
     }
}