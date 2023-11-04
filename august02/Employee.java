public class Employee
{
	String name;
	int age;
	double income;
	public Employee(String n, int a,double i)
	{
	  System.out.println("Start of constructor");
	  name   = n;
	  age    = a;
	  income = i;
	  System.out.println("Name is :" + name + " Age is :" +  age  + " Income is :" + income);
	  System.out.println("end of constructor");
	}
	public void doTask()
	{
		System.out.println("Perfom task properly");
	}
	public static void main(String[]args)
	{
		System.out.println("Start og Main Method");
		Employee e1 =new Employee("Bob",21,3400.00);
		Employee e2 =new Employee("Harris",22,3700.00);
		Employee e3 =new Employee("Nathan",24,3900.00);
		Employee e4 =new Employee("Kyle",24,4000.00);
		System.out.println("End of Main Method");
	}

	
}