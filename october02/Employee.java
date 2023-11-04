public abstract class Employee
{
	public int employeeId;
	public String employeeName;
	//public abstract int employeeAge;

	public abstract void doTask();
	public abstract final void m2()
	{
		System.out.println("Start of abstract final m2()");
		System.out.println("end of abstract final m2()");

	}

}