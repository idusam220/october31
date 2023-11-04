public class FullTimeEmployee extends Employee
{
	public void doWork()
	{
	  System.out.println("Start of doWork class FullTimeEmployee method");
	  System.out.println("Employee has to work 8 hours per day");
	  System.out.println("End of doWork class FullTimeEmployee method");
	}
	public void submitTask()
	{
		System.out.println("Start of submitTask class ParttimeEmployee method");
		System.out.println("submitTask your task at the end of the shift");
		System.out.println("End of submitTask class FullTimeEmployee method");
	}
	public void applyLeaves()
	{
		System.out.println("Start of applyLeaves class FulltimeEmployee method");
		System.out.println("Employee  can use his Time Off any time needed ");
		System.out.println("End of applyLeaves class FullTimeEmployee method");
	}
	public void getIncomeMonthly()
	{
		System.out.println("Start of getIncomeDaily class FullTimeEmployee method");
		System.out.println("Employee is payed on the 1st of each month");
		System.out.println("End of getIncomeDaily class FullTimeEmployee method");
	}
}
