public class Employee
{
	String employeeName;
	int employeeAge;
	double employeeIncome;

	static String companyName = "JP Morgan";
	public void performJob()
	{
		System.out.println("Do the task properly");
	}
	public void performJob(int duration)
	{
     System.out.println("Done the task in :"+duration);
	}
	public static void main(String[]args)
	{
	System.out.println("Start of Main Method");
	Employee emp1 =new Employee();
	Employee emp2 =new Employee();
	emp1.employeeName ="Eric";
	emp1.employeeAge  =23;
	emp1.employeeIncome=8500.00;
	
	emp2.performJob();
	emp2.employeeName ="Harris";
	emp2.employeeAge  =33;
	emp2.employeeIncome=9000.00;
	
	emp2.performJob(20);
	System.out.println("Employee One name is :"+emp1.employeeName);
	System.out.println("Employee One age is :"+emp1.employeeAge);
	System.out.println("Employee One Income :"+emp1.employeeIncome);
	System.out.println("EmployeeOne company Name :"+emp1.companyName);
    emp2.companyName="Bank of America";
    System.out.println("Employee Two name is :"+emp2.employeeName);
	System.out.println("Employee Two age is :"+emp2.employeeAge);
	System.out.println("Employee Two Income :"+emp2.employeeIncome);
	System.out.println("Employee Two company Name :"+emp2.companyName);
	System.out.println("Employee One company Name :"+emp1.companyName);
	System.out.println("Employee Two company Name :"+emp2.companyName);
	System.out.println("End of Main Method");

   }


}