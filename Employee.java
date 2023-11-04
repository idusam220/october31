public class Employee
{
	String name;
	int age;

	public void Employee(String name,int age)
	{
      System.out.println("Employee constructor");
      name = name;
      age =age;
      System.out.println("Your name is :" +name + "Age :" +age);
	}
	public static void main(String[]args)
	{
		System.out.println("Start of Main Method");
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		e1.Employee("Eric",35);
		e2.Employee("John",28);
		System.out.println("End of Main Method");
	}
}