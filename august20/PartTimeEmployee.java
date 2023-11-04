public class PartTimeEmployee extends Employee
{
	public void doWork()
	{
	  System.out.println("Start of doWork class ParttimeEmployee method");
	  System.out.println("Employee has to work four hour per day");
	  System.out.println("End of doWork class ParttimeEmployee method");
	}
	public void submitTask()
	{
		System.out.println("Start of submitTask class ParttimeEmployee method");
		System.out.println("submit your task once done");
		System.out.println("End of submitTask class ParttimeEmployee method");
	}
	public void applyLeaves()
	{
		System.out.println("Start of applyLeaves class ParttimeEmployee method");
		System.out.println("Employee has only two days per month ");
		System.out.println("End of applyLeaves method");
	}
	public void getIncomeDaily()
	{
		System.out.println("Start of getIncomeDaily class ParttimeEmployee method");
		System.out.println("Employee is payed at the end of the shift");
		System.out.println("End of getIncomeDaily method");

	}
}