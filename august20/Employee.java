public class Employee
{
	String name;
	int    age;
	double income;

	public void dowork()
	{
	   System.out.println("Start of doWork class Employee method");
	   System.out.println("Employee has his own task to finish");
	   System.out.println("End of doWork class Employee method ");
	}
	public void submitTask()
	{
		System.out.println("Start of submitTask class Employee method");
		System.out.println("Submit your task daily");
		System.out.println("End of submitTask class Employee method");
	}
	public void applyLeaves()
	{
		System.out.println("Start of applyLeaves class Employee method");
		System.out.println("Employee can apply sick leave  and vacation leave");
		System.out.println("End of applyLeaves class Employee");
	}
}