package david.fulltimeemployee.examplethree;
public class FullTimeEmployee extends Employee
{
	double income;
	public FullTimeEmployee(int employeeId,String employeeName,int departmentId ,double income)
	{
		super(employeeId,employeeName,departmentId);
		this.income = income;
		System.out.println("End of FullTimeEmployee() constructor");
       
	}
	void calculateIncome(double tax)
	{
		System.out.println("Start of of calculateIncome()method");
		double monthlyIncome = income - tax;
		System.out.println("Monthly income is : "+monthlyIncome);
		System.out.println("End of calculateIncome()method");
	}
}//End of class FullTimeEmployee